package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController 
{
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		return "Hi KL Please comback to RCB";
	}

}
