package De5.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import De5.data.HouseRepository;
import De5.entity.House;

@Controller
public class ViewHousesController {
	
	@Autowired
	private HouseRepository repo;

	@RequestMapping("/viewHouses")
	public String viewHouses(Model model) {
		ArrayList<House> houses = (ArrayList<House>) repo.findByApproved(0);
		model.addAttribute("houses",houses);
		return "viewHouses";
	}
}
