package user;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Registration.RegistrationRequest;
import exception.UserAlreadyExistsException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserService implements IUserService  {
	private final UserRepository userRepository = null;
	
	private PasswordEncoder passwordEncoder;
	
	@Override
	public List<User> getUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User registerUser(RegistrationRequest request) {
	  Optional<User> user = this.findByEmail(request.email());
	  if(user.isPresent()) {
		  throw new UserAlreadyExistsException(
		"User with email "+ request.email() + "alreadyexists");
	  }
	  var newUser = new User();
	  newUser.setfirstName(request.FirstName());
	  newUser.setlastName(request.LastName());
	  newUser.setemail(request.email());
	  newUser.setpassword(passwordEncoder.encode(request.password()));
	  newUser.setrole(request.role());
		return userRepository.save(newUser);
	}

	@Override
	public Optional<User> findByEmail(String email) {
	
		return userRepository.findByEmail(email);
	}

}
