package qian.AccountBook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qian.AccountBook.domain.User;
import qian.AccountBook.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAllUser(){
		List<User> listAllUser=userRepository.findAll();	
		return listAllUser;
	}
	
	public String addUser(String userName){

		User user=new User();
		user.setUserName(userName);
		try {
			userRepository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return "failure";
		}
		
		
		return "success";
	}
}
