package in.mani.dao;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.mani.model.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {

	@Query("Select * from employees e  where e.admin_name =:userName and e.admin_password =:password")
	Optional<Admin> findByUserNameAndPassWord(@Param("userName") String userName, @Param("password") String password);
}
