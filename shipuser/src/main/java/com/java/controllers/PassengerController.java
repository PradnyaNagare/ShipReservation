package com.java.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.java.beans.Passenger;
import com.java.dao.PassengerDao;

@Controller
public class PassengerController {
  @Autowired
  PassengerDao dao;
  @RequestMapping("/passengerform")
  public String showform(Model m){
    m.addAttribute("command", new Passenger());
    return "passengerform";
  } 
  @RequestMapping(value="/save10",method = RequestMethod.POST)
  public String save(@ModelAttribute("passenger") Passenger passenger){
    dao.save(passenger);
    return "redirect:/viewpassenger";
  }  
  @RequestMapping("/viewpassenger")
  public String viewpassenger(Model m){
    List<Passenger> list=dao.getPassengers();
    m.addAttribute("list",list);
    return "viewpassenger";
  }  
  @RequestMapping(value="/editpassenger/{reservationId}")
  public String edit(@PathVariable String reservationId, Model m){
    Passenger passenger=dao.getPassengerById(reservationId);
    m.addAttribute("command",passenger);
    return "passengereditform";
  } 
  @RequestMapping(value="/editsave10",method = RequestMethod.POST)
  public String editsave(@ModelAttribute("passenger") Passenger passenger){
    dao.update(passenger);
    return "redirect:/viewpassenger";
  }
  @RequestMapping(value="/deletepassenger/{reservationId}",method = RequestMethod.GET)
  public String delete(@PathVariable int reservationId){
    dao.delete(reservationId);
    return "redirect:/viewpassenger";
  }
}