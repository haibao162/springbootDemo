package qian.AccountBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import qian.AccountBook.domain.Project;
import qian.AccountBook.service.ProjectService;
import qian.AccountBook.service.UserService;

@Controller
public class ProjectController {

	@Autowired
	ProjectService projectService;

	@Autowired
	UserService userService;

	@RequestMapping("/project")
	public String project(Model model) {

		Integer userNum = userService.findAllUser().size();

		model.addAttribute("userNum", userNum);

		List<Project> listAllProject = projectService.findAllProject();
		model.addAttribute("listAllProject", listAllProject);

		return "project";
	}
}
