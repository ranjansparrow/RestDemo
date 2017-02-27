package cs.edu.restdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs.edu.restdemo.Domain.User;


@Service
public interface IUserService {
	
	public void save(User user);
	public User findOneUser(long id);
	public List<User> findAllUser();
	public void deleteUser(long id);

}
