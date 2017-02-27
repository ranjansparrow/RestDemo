package cs.edu.restdemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs.edu.restdemo.Domain.User;
import cs.edu.restdemo.repository.IUserRepo;
import cs.edu.restdemo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserRepo userrepo;
	@Override
	public void save(User user) {
		userrepo.save(user);
	}

	@Override
	public User findOneUser(long id) {
		return userrepo.findOne(id);
	}

	@Override
	public List<User> findAllUser() {
		return (List<User>)userrepo.findAll();
	}

	@Override
	public void deleteUser(long id) {
		userrepo.delete(id);
	}

}
