package De5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import De5.data.HouseRepository;
import De5.entity.House;

@Controller
public class DeleteController {

	@Autowired
	private HouseRepository repo;
	
	@GetMapping("/delete")
	public String deleteRequest(@RequestParam(name="id") String id, Model model) {
		House house = repo.getById(id);
		model.addAttribute("house",house);
		return "confirm";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam(name="action") String action,
						 @RequestParam(name="id") String id) {
		if(action.toLowerCase().equals("yes")) {
			repo.deleteById(id);
		}		
		return "redirect:/viewHouses";
	}
}
