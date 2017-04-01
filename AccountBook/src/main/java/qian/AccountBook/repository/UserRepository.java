package qian.AccountBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import qian.AccountBook.domain.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
