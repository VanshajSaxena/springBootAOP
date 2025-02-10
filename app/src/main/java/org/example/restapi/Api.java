package org.example.restapi;

import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
  @Autowired
  private UserService userService;

  @GetMapping("/")
  public String userLogin() {
    userService.logout();
    return "User login endpoint called successfully!";
  }
}
