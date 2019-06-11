package ch1.bee.sample.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chens
 * @date 6/11/19
 */

@Controller
public class HelloWorldController {

  @RequestMapping("/sayhello.html")
  public @ResponseBody String say(){
    return "Hello Spring Boot";
  }
}
