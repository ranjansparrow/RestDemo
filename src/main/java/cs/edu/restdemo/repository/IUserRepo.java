package cs.edu.restdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cs.edu.restdemo.Domain.User;

@Repository
public interface IUserRepo extends CrudRepository<User, Long> {

}
