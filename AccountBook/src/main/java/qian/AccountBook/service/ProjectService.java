package qian.AccountBook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qian.AccountBook.domain.Project;
import qian.AccountBook.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	ProjectRepository projectRepository;
	
	public List<Project> findAllProject(){		
		
		List<Project> listAllProject=projectRepository.findAll();	
		return listAllProject;
	}
}
