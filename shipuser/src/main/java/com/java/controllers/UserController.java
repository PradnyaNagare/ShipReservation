package com.java.controllers;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import com.java.User_Login;

@Controller

public class UserController {

	 @RequestMapping("/userhello")

	  public String display(Model m)

	  {

	    m.addAttribute("user", new User_Login());

	    return "User";

	  }

  @RequestMapping("/userhelloagain")

  public String submitForm( @Valid @ModelAttribute("user") User_Login a, BindingResult br)

  {

    if(br.hasErrors())

    {

      return "User";

    }

    else

    {

    return "HomeUser";

    }

  }
  @RequestMapping("/UserLogout")

  public String logout(Model m)

  {

    m.addAttribute("user", new User_Login());

    return "User";

  }

}



