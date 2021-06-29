package in.mani.dao;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.mani.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("Select * from users u  where u.username =:userName and u.newpassword =:password")
	Optional<User> findByUserNameAndPassWord(@Param("userName") String userName , @Param("password") String password);
	
	@Query("Select id from users u  where u.username =:userName")
	Integer findByUserName(@Param("userName") String userName);
}
