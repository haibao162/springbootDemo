package qian.AccountBook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qian.AccountBook.domain.User;
import qian.AccountBook.repository.UserRepository;

@Service
public class TestService {
	@Autowired
	UserRepository userRepository;

	public String mm(String userName) {
		User u = new User();
		u.setUserName(userName);
		userRepository.save(u);

		List<User> l = userRepository.findAll();
		
		return l.size()+"";

	}
}
