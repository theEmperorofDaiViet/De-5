package De5.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import De5.entity.House;

public interface HouseRepository extends CrudRepository <House, String>{

	House getById(String id);
	
	List<House> findByApproved(int approved);
}
