package in.mani.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mani.dao.AdminRepository;
import in.mani.dao.UserRepository;
import in.mani.exception.ServiceException;
import in.mani.model.Admin;
import in.mani.model.User;
import in.mani.validation.LoginValidator;
import in.mani.validation.UserValidator;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRep;
	
	@Autowired
	AdminRepository adminRep;
	
	@Autowired
	UserValidator userValidator;
	
	@Autowired
	LoginValidator loginValidator;

	/**
	 * This Method is used to get all user details
	 * @return list of all users
	 */
	public Iterable<User> getAllUsers() {
		return userRep.findAll();
	}
	
	/**
	 * This Method is used to tore the user details
	 * @param user
	 */
	public void addUser(User user) {

		try {
			userValidator.isValidUser(user);
			userRep.save(user);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}

	}
	
	/**
	 * This Method is used to check whether the user is valid or not
	 * @param userName
	 * @param password
	 */
	public boolean userLogin(String userName, String password) {
			boolean valid = false;
		try {
			Optional<User> user = userRep.findByUserNameAndPassWord(userName, password);
			loginValidator.isUserExists(user);
			valid = true;
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
		return valid;
	}
	
	/**
	 * This Method is used to check whether the admin is valid or not
	 * @param userName
	 * @param password
	 */
	public void adminLogin(String userName, String password) {
		try {
			Optional<Admin> admin = adminRep.findByUserNameAndPassWord(userName, password);
			loginValidator.isValidAdmin(admin);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
	}
	
	/**
	 * This Method is used to get user id of the user
	 * @param userName
	 * @return userId 
	 */
	public Integer findByUserName(String userName) {
		return  userRep.findByUserName(userName);
	}

}
