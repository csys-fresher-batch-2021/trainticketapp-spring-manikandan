package in.mani.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.mani.model.Train;

@Repository
public interface TrainRepository extends CrudRepository<Train, Integer> {

}
