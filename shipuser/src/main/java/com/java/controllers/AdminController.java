package com.java.controllers;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import com.java.Admin_Login;

@Controller

public class AdminController {

	 @RequestMapping("/hello")

	  public String display(Model m)

	  {

	    m.addAttribute("admin", new Admin_Login());

	    return "Admin";

	  }

  @RequestMapping("/helloagain")

  public String submitForm( @Valid @ModelAttribute("admin") Admin_Login a, BindingResult br)

  {

    if(br.hasErrors())

    {

      return "Admin";

    }

    else

    {

    return "Home";

    }

  }
  @RequestMapping("/Logout")

  public String logout(Model m)

  {

    m.addAttribute("admin", new Admin_Login());

    return "Admin";

  }

}



