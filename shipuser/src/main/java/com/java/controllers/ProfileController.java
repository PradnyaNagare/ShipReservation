package com.java.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.java.beans.Profile;
import com.java.dao.ProfileDao;

@Controller
public class ProfileController {
  @Autowired
  ProfileDao dao;
  @RequestMapping("/profileform")
  public String showform(Model m){
    m.addAttribute("command", new Profile());
    return "profileform";
  } 
  @RequestMapping(value="/save9",method = RequestMethod.POST)
  public String save(@ModelAttribute("profile") Profile profile){
    dao.save(profile);
    return "redirect:/viewprofile";
  }  
  @RequestMapping("/viewprofile")
  public String viewprofile(Model m){
    List<Profile> list=dao.getUsers();
    m.addAttribute("list",list);
    return "viewprofile";
  }  
  @RequestMapping(value="/editprofile/{userId}")
  public String edit(@PathVariable int userId, Model m){
    Profile profile=dao.getProfileByUserId(userId);
    m.addAttribute("command",profile);
    return "profileeditform";
  } 
  @RequestMapping(value="/editsave9",method = RequestMethod.POST)
  public String editsave(@ModelAttribute("profile") Profile profile){
    dao.update(profile);
    return "redirect:/viewprofile";
  }
  @RequestMapping(value="/deleteprofile/{userId}",method = RequestMethod.GET)
  public String delete(@PathVariable int userId){
    dao.delete(userId);
    return "redirect:/viewprofile";
  }
  
}