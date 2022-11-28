package com.java;

import javax.validation.constraints.Size;

public class Admin_Login {

  private String name;

  @Size(min=7,message="Please Enter correct Password")

  private String pass;

  public String getName() {

    return name;

  }

  public void setName(String name) {

    this.name = name;

  }

  public String getPass() {

    return pass;

  }

  public void setPass(String pass) {

    this.pass = pass;

  }

}

