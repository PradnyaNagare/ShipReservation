package com.java.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.beans.Card;

import com.java.dao.CardDao;


@Controller
public class CardController {
  @Autowired
  CardDao dao;
  @RequestMapping("/cardform")
  public String showform(Model m){
    m.addAttribute("command", new Card());
    return "cardform";
  } 
  @RequestMapping(value="/save7",method = RequestMethod.POST)
  public String save(@ModelAttribute("card") Card card){
    dao.save(card);
    return "redirect:/viewcard";
  }  
  @RequestMapping("/viewcard")
  public String viewcard(Model m){
    List<Card> list=dao.getCards();
    m.addAttribute("list",list);
    return "viewcard";
  }  
  @RequestMapping(value="/editcard/{userId}")
  public String edit(@PathVariable String userId, Model m){
    Card card=dao.getCardById(userId);
    m.addAttribute("command",card);
    return "cardeditform";
  } 
  @RequestMapping(value="/editsave7",method = RequestMethod.POST)
  public String editsave(@ModelAttribute("card") Card card){
    dao.update(card);
    return "redirect:/viewcard";
  }
  @RequestMapping(value="/deletecard/{userId}",method = RequestMethod.GET)
  public String delete(@PathVariable int userId){
    dao.delete(userId);
    return "redirect:/viewcard";
  }
}