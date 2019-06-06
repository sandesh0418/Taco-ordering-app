package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homepage {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	

}
