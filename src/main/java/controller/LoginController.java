package controller;

import javax.servlet.http.HttpSession;


public class LoginController {
	
	LoginService loginService;
	

	public String showLoginForm() {
		return "login";
	}

	public String verifyLogin(@RequestParam String login, @RequestParam String password,
			HttpSession session,Model theModel){
		User user = loginService.loginUser(login, password);
		if(user==null) {
			theModel.addAttribute("loginError", "Error login in. Please try again");
			return "login";
		}
		session.setAttribute("loggedInUser", user);
		return "redirect:/hotelStatus/";
		
	}

	public String logout(HttpSession session) {
		session.removeAttribute("loggedInUser");
		return "redirect:/";
	}
}
