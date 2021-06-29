package in.mani.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.mani.exception.ValidationException;
import in.mani.model.User;
import in.mani.service.UserService;
import in.mani.util.EmailValidation;
import in.mani.util.MobileNumberValidation;
import in.mani.util.NameValidation;
import in.mani.util.PasswordValidation;
import in.mani.util.UserNameValidation;

@Component
public class UserValidator {

	@Autowired
	UserService userService;

	@Autowired
	UserValidator validator;

	public void isValidUser(User user) {

		try {
			/*
			 * if (!userDTO.getNewpassword().equals(confirmPassword)) { throw new
			 * ValidationException("Password Not Matches"); }
			 */
			validator.isSameUser(user);

			NameValidation.isValidName(user.getFirstname());
			NameValidation.isValidName(user.getLastname());
			EmailValidation.isValidEmail(user.getEmail());
			MobileNumberValidation.isValidMobileNumber(user.getMobilenumber());
			UserNameValidation.isValidUserName(user.getUsername());
			PasswordValidation.isValidPassword(user.getNewpassword());
		} catch (Exception e) {
			throw new ValidationException(e.getMessage());
		}
	}

	public void isSameUser(User user) {
		Iterable<User> allUsers = userService.getAllUsers();
		for (User userObj : allUsers) {
			if (user.getEmail().equals(userObj.getEmail())) {
				throw new ValidationException("Email ID Already Registered");
			}
			if (user.getMobilenumber().equals(userObj.getMobilenumber())) {
				throw new ValidationException("Mobile Number Already Registered");
			}
			if (user.getUsername().equals(userObj.getUsername())) {
				throw new ValidationException("User Name Already Registered");
			}
		}
	}
}
