package com.min.edu.ctrl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

	@GetMapping("/")
	public String getMethodName() {
		return new String("SpringBoot Docker 배포 자동으로 서버에도 배포 해줘 ~~~ (❁´◡`❁)");
	}
	
}
