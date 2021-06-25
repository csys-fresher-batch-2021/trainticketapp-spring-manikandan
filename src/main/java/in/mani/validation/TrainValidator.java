package in.mani.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import in.mani.exception.ValidationException;
import in.mani.model.Train;
import in.mani.service.TrainService;
import in.mani.util.NameValidation;
import in.mani.util.NumberValidator;

@Configuration
public class TrainValidator {

	@Autowired
	TrainService trainService;
	
	@Autowired
	NumberValidator numberValidator;
	
	@Autowired
	NameValidation nameValidation;

	public void validateTrainDetails(Train trainDetails) {

		Iterable<Train> trains = trainService.getAllTrains();
		try {
			for (Train train : trains) {
				if (trainDetails.getTrainNumber().equals(train.getTrainNumber())) {
					throw new ValidationException("Train Number Already Exists");
				}
				if (trainDetails.getTrainName().equals(train.getTrainName())) {
					throw new ValidationException("Train Name Already Exists");
				}
			}
			numberValidator.isValidNumber(trainDetails.getTrainNumber());
			nameValidation.isValidName(trainDetails.getTrainName());
			nameValidation.isValidName(trainDetails.getSource());
			nameValidation.isValidName(trainDetails.getDestination());
			numberValidator.isValidNumber(trainDetails.getFare());
			numberValidator.isValidNumber(trainDetails.getAvailability());
		} catch (Exception e) {
			e.printStackTrace();
			throw new ValidationException(e.getMessage());
		}
	}

}
