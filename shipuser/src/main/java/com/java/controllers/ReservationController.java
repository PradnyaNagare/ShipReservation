package com.java.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.beans.Reservation;

import com.java.dao.ReservationDao;

@Controller
public class ReservationController {
  @Autowired
  ReservationDao dao;
  @RequestMapping("/reservationform")
  public String showform(Model m){
    m.addAttribute("command", new Reservation());
    return "reservationform";
  } 
  @RequestMapping(value="/save8",method = RequestMethod.POST)
  public String save(@ModelAttribute("reservation") Reservation reservation){
    dao.save(reservation);
    return "redirect:/viewreservation";
  }  
  @RequestMapping("/viewreservation")
  public String viewreservation(Model m){
    List<Reservation> list=dao.getReservations();
    m.addAttribute("list",list);
    return "viewreservation";
  }  
  @RequestMapping(value="/editreservation/{reservationId}")
  public String edit(@PathVariable String reservationId, Model m){
    Reservation reservation=dao.getReservationById(reservationId);
    m.addAttribute("command",reservation);
    return "reservationeditform";
  } 
  @RequestMapping(value="/editsave8",method = RequestMethod.POST)
  public String editsave(@ModelAttribute("reservation") Reservation reservation){
    dao.update(reservation);
    return "redirect:/viewreservation";
  }
  @RequestMapping(value="/deletereservation/{reservationId}",method = RequestMethod.GET)
  public String delete(@PathVariable int reservationId){
    dao.delete(reservationId);
    return "redirect:/viewreservation";
  }
}