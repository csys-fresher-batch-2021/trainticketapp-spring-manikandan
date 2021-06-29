package in.mani.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mani.model.Admin;
import in.mani.model.User;
import in.mani.service.UserService;
import in.mani.util.Message;

@RestController
@RequestMapping("User")
public class UserController {

	@Autowired
	UserService userService;

	// http://localhost:9000/User/userList
	@GetMapping("/userList")
	public Iterable<User> list() {
		return userService.getAllUsers();
	}

	// http://localhost:9000/User/register
	@PostMapping("/register")
	public ResponseEntity<Message> registerUser(@RequestBody User user) {
		try {
			userService.addUser(user);
			Message message = new Message();
			message.setInfoMessage("Successfully Registered User");
			return new ResponseEntity<>(message, HttpStatus.OK);
		} catch (Exception e) {
			Message message = new Message();
			message.setErrorMessage(e.getMessage());
			return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		}
	}

	// http://localhost:9000/User/userLogin
	@PostMapping("/userLogin")
	public ResponseEntity<Message> userLogin(@RequestBody User user, HttpServletRequest request) {
		try {
			userService.userLogin(user.getUsername(), user.getNewpassword());
			HttpSession session = request.getSession();
			session.setAttribute("LOGGED_IN_USER", user.getUsername());
			Message message = new Message();
			message.setInfoMessage("Successfully Logged In");
			return new ResponseEntity<>(message, HttpStatus.OK);
		} catch (Exception e) {
			Message message = new Message();
			message.setErrorMessage(e.getMessage());
			return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		}
	}

	// http://localhost:9000/User/adminLogin
	@PostMapping("/adminLogin")
	public ResponseEntity<Message> adminLogin(@RequestBody Admin admin, HttpServletRequest request) {
		try {
			userService.adminLogin(admin.getAdminId(), admin.getPassword());
			HttpSession session = request.getSession();
			session.setAttribute("LOGGED_IN_ADMIN", admin.getAdminId());
			session.setAttribute("ROLE", "ADMIN");
			Message message = new Message();
			message.setInfoMessage("Successfully Logged In");
			return new ResponseEntity<>(message, HttpStatus.OK);
		} catch (Exception e) {
			Message message = new Message();
			message.setErrorMessage(e.getMessage());
			return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		}
	}

}
