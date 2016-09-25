package cloud.esik.service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cloud.esik.service.model.User;


@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(value = "/sayHello/{name}", method = RequestMethod.GET)
    public String helloV1(@PathVariable final String name) {
        return "Hello "+name+"!";
    }
        
    @RequestMapping(value = "/getUser/{name}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable final String name) {
         return new User(name);
    }
	
}
