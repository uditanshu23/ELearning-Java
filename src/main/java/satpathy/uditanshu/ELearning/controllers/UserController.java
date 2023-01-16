package satpathy.uditanshu.ELearning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import satpathy.uditanshu.ELearning.models.User;
import satpathy.uditanshu.ELearning.respositories.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<User> getUserById(@PathVariable("id") int id){
		User user = userRepository.findById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
