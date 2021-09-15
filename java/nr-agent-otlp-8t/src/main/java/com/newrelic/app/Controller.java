package com.newrelic.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }

  @GetMapping("/error")
  public String error() {
    throw new IllegalArgumentException("Error!");
  }
}
