package qian.AccountBook.domain;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer UserId;
	private String userName;


	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public String getUserName() {
		return userName;	
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
