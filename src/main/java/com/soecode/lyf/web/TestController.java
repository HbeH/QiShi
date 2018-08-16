package com.soecode.lyf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soecode.lyf.dto.BackResult;

@Controller
@ResponseBody
public class TestController {

	@RequestMapping("/test")
	public BackResult test(){
		System.out.println(33);
		BackResult backResult = new BackResult();
		backResult.setData("1");
		backResult.setMsg("test");
		backResult.setStatus(0);
		return backResult;
	}
}
