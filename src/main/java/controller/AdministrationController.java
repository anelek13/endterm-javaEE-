package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import services.AdministrationService;

public class AdministrationController {

	private AdministrationService adminService;

	public String checkAdminAndShow(HttpSession session, Model theModel) {
		User loggedInUser = (User) session.getAttribute("loggedInUser");
		if(loggedInUser != null && loggedInUser.getFirstName().equals("admin")) {

			List<User> userList = adminService.getAllUsers();
			theModel.addAttribute("userList", userList);
			return "userList";

		}else {

			theModel.addAttribute("noAdminLoggedIn","You must be logged in as an admin to use administration tab");
			return "hotelStatus";

		}
	}
	public String showRegisterForm(Model theModel) {
		User user = new User();
		theModel.addAttribute("user", user);
		return "register";
	}

	public String registerNewUser(@Valid @ModelAttribute("user") User newUser, BindingResult bindingResult, Model theModel) {
		if(bindingResult.hasErrors()) {

			theModel.addAttribute("user", newUser);
			return "register";

		}else {
			adminService.registerUser(newUser);
			return "redirect:/administration/";
		}
	}

	public String deleteUser(@RequestParam("tempUserId") int id) {
		adminService.deleteUser(id);
		return "redirect:/administration/";
	}

	public String updateUser(@RequestParam("tempUserId") int id, Model theModel) {
		User user = adminService.getUser(id);
		theModel.addAttribute("user", user);
		return "register";
	}

	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}
