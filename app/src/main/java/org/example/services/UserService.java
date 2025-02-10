package org.example.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Service
public class UserService {
  @Getter
  @Setter
  @AllArgsConstructor
  public class User {
    private String name;
    private String age;
    private String address;
  }

  private User user;

  public UserService() {
    this.user = new User("Vanshaj", "10", "Ghaziabad, UP");
  }

  public void login() {
    System.out.println("Logging " + user + " In");
  }

  public void logout() {
    System.out.println("Logging " + user + " Out");
  }
}
