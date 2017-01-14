package com.jota.patterns.singleton.singleton;

public class User {

  private static User instance = new User();

  private String token;
  private String socialNetwork;

  private User() {
  }

  public static User getInstance() {
    return instance;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getSocialNetwork() {
    return socialNetwork;
  }

  public void setSocialNetwork(String socialNetwork) {
    this.socialNetwork = socialNetwork;
  }
}
