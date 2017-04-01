package qian.AccountBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import qian.AccountBook.domain.User;
import qian.AccountBook.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/user")
	public String user(Model model) {

		List<User> listAllUser = userService.findAllUser();
		model.addAttribute("listAllUser", listAllUser);
		return "user";
	}

	@RequestMapping("/adduser")
	public String adduser(@RequestParam("userName") String userName, Model model) {
		if (userName.length() == 0) {

			model.addAttribute("flag", "failure");

		} else {

			String result = userService.addUser(userName);

			model.addAttribute("flag", result);

		}
		List<User> listAllUser = userService.findAllUser();
		model.addAttribute("listAllUser", listAllUser);

		return "user";
	}
}
