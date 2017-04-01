package qian.AccountBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import qian.AccountBook.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
	
	
}

