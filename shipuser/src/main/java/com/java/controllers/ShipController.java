package com.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.java.beans.Ship;

import com.java.dao.ShipDao;

@Controller

public class ShipController {

  @Autowired

 ShipDao dao;

  @RequestMapping("/AddShip")

  public String showform(Model m){

    m.addAttribute("command", new Ship());

    return "AddShip";

  }

  

  @RequestMapping(value="/save2",method = RequestMethod.POST)

  public String save(@ModelAttribute("Ship") Ship Ship){

    dao.save(Ship);

    return "redirect:/ViewShips";

  }

  

  @RequestMapping("/ViewShips")

  public String ViewShips(Model m){

   List<Ship> list=dao.getShipDetails();

    m.addAttribute("list",list);

    return "ViewShips";

  }

  

  @RequestMapping(value="/editsave2/{ShipId}")

  public String edit(@PathVariable int ShipId, Model m){

   Ship Ship=dao.getShipById(ShipId);

    m.addAttribute("command",Ship);

    return "EditShip";

  }

  

  @RequestMapping(value="/editsave2",method = RequestMethod.POST)

  public String editsave(@ModelAttribute("Ship") Ship Ship){

    dao.update(Ship);

    return "redirect:/ViewShips";

  }

  

  @RequestMapping(value="/deleteship/{ShipId}",method = RequestMethod.GET)

  public String delete(@PathVariable int ShipId){

    dao.delete(ShipId);

    return "redirect:/ViewShips";

  }

}

