package in.mani.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mani.dao.TrainRepository;
import in.mani.exception.ServiceException;
import in.mani.model.Train;
import in.mani.validation.TrainValidator;

@Service
public class TrainService {

	@Autowired
	TrainRepository trainRep;
	
	@Autowired
	TrainValidator trainvalidator;

	/**
	 * This Method returns all the Trains
	 * 
	 * @return
	 */
	public Iterable<Train> getAllTrains() {

		return trainRep.findAll();
	}

	/**
	 * This method Add the Train Details
	 * @param train
	 */
	public void addTrain(Train train) {
		try { 
			train.setTrainName(train.getTrainName().toUpperCase());
			train.setSource(train.getSource().toUpperCase());
			train.setDestination(train.getDestination().toUpperCase());
			trainvalidator.validateTrainDetails(train);
			trainRep.save(train);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
	
	}
}
