package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class TestRun {
	
	@RequestMapping("/test")
	public String firstOutput()
	{
		return "Hello I am running";
	}


}
