package qian.AccountBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import qian.AccountBook.service.TestService;

@Controller
public class HelloController {
	@Autowired
	TestService testService;

	@RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
    	
		String r=testService.mm(name);
    	
        model.addAttribute("name", r);
        return "hello";
    }
}