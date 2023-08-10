package Registration;

import java.net.http.HttpRequest;
import java.time.Clock;

import org.apache.catalina.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Event.RegistrationCompleteEvent;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import user.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegistrationController {
	
	private final UserService userService = new UserService();
	private final ApplicationEventPublisher publisher = null;
	
	
	@PostMapping
	public String registerUser(RegistrationRequest registrationRequest, final HttpServletRequest request) {
		
		user.User user = userService.registerUser(registrationRequest);
		publisher.publishEvent(new RegistrationCompleteEvent(user, applicationUrl(request)));
		return "Success! please, check Your email for to complete your registration";
	}
	public String applicationUrl(HttpServletRequest request) {
		
		return 
				"http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	}
	
	
	

}
