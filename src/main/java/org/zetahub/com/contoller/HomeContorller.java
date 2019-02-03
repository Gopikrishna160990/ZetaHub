package org.zetahub.com.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContorller {
	
	@RequestMapping("/")
	public String home() {
		return "Zeta hub is working.";
	}
}
