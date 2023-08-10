package user;

import java.util.List;
import java.util.Optional;

import Registration.RegistrationRequest;
import jakarta.servlet.Registration;

public interface IUserService {
	List<User> getUsers();
	User registerUser (RegistrationRequest  request);
	Optional<User> findByEmail(String email);
	
	

}
