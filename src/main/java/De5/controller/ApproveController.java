package De5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import De5.data.HouseRepository;
import De5.entity.House;

@Controller
public class ApproveController {
	
	@Autowired
	private HouseRepository repo;

	@GetMapping("/approve")
	public String approve(@RequestParam(name="id") String id) {
		House h = repo.getById(id);
		House house = new House(h.getId(), h.getAddress(), h.getArea(), h.getType(), 1);
		repo.save(house);
		return "redirect:/viewHouses";
	}
}
