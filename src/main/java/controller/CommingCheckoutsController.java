package controller;

import java.util.List;
import java.util.stream.Collectors;

public class CommingCheckoutsController {

	private CommingCheckoutsService commingCheckOutsService;

	public String commingCheckoutsList(Model theModel) {

		List <Guest> commingCheckouts = commingCheckOutsService.getCommingCheckouts();
		
		theModel.addAttribute("guestList", commingCheckouts);
		return "guestList";

	}

}

