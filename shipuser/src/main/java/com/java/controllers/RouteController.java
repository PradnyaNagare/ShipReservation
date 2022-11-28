package com.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.java.beans.Route;

import com.java.dao.RouteDao;

@Controller

public class RouteController {

  @Autowired

 RouteDao dao;

  @RequestMapping("/AddRoute")

  public String showform(Model m){

    m.addAttribute("command", new Route());

    return "AddRoute";

  }

  
  @RequestMapping(value="/save1",method = RequestMethod.POST)

  public String save(@ModelAttribute("route") Route route){

    dao.save(route);

    return "redirect:/ViewRoute";

  }

  

  @RequestMapping("/ViewRoute")

  public String ViewRoute(Model m){

   List<Route> list=dao.getRouteDetails();

    m.addAttribute("list",list);

    return "ViewRoute";

  }

  

  @RequestMapping(value="/editsave1/{routeId}")

  public String edit(@PathVariable int routeId, Model m){

   Route route=dao.getRouteByRouteId(routeId);

    m.addAttribute("command",route);

    return "EditRoute";

  }

 

  @RequestMapping(value="/editsave1",method = RequestMethod.POST)

  public String editsave(@ModelAttribute("route") Route route){

    dao.update(route);

    return "redirect:/ViewRoute";

  }

  

  @RequestMapping(value="/deleteroute/{routeId}",method = RequestMethod.GET)

  public String delete(@PathVariable int routeId){

    dao.delete(routeId);

    return "redirect:/ViewRoute";

  }

}


