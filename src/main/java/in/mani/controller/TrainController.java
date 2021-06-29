package in.mani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mani.model.Train;
import in.mani.service.TrainService;
import in.mani.util.Message;

@RestController
@RequestMapping("trains")
public class TrainController {

	@Autowired
	TrainService trainService;

	// http://localhost:9000/trains/trainList
	@GetMapping("/trainList")
	public Iterable<Train> list() {
		return trainService.getAllTrains();
	}

	// http://localhost:9000/trains/addTrain
	@PostMapping("/addTrain")
	public ResponseEntity<Message> addTrain(@RequestBody Train train) {
		try {
			trainService.addTrain(train);
			Message message = new Message();
			message.setInfoMessage("Successfully Added Train");
			return new ResponseEntity<>(message, HttpStatus.OK);
		} catch (Exception e) {
			Message message = new Message();
			message.setErrorMessage(e.getMessage());
			return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		}
	}
}
