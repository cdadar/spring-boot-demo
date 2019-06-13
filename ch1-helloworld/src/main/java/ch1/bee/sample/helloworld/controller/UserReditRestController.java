package ch1.bee.sample.helloworld.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chens
 * @date 6/11/19
 */
@RestController
public class UserReditRestController {

  @RequestMapping(value = "/usercredit/{id}")
  public Integer getCreditLevel(@PathVariable String id){
    return 3;
  }

}
