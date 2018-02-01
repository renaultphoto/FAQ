package com.renault.faq.controller.Home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.renault.faq.service.UserService;
import com.renault.faq.util.Functions;

import javax.servlet.http.HttpServletRequest;
/**
 * 用户的controller
 * Created by 言曌 on 2017/8/24.
 */
@Controller
public class UserController {

	@Autowired
	private  HttpServletRequest request;

	@Autowired
	private UserService userService;

	@Autowired
	private Functions functions;








}
