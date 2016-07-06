package cn.wzvtc.soft14.contorl;

import cn.wzvtc.soft14.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

/**
 * Created by asus on 2016/7/4.
 */
@RestController
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@CrossOrigin(origins = {},methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
public class ActivityContorl {

    @Autowired
    private UserService userService;

    @RequestMapping("/loginUser")
    @ResponseBody
    Object loginUser(@RequestParam("name") String name,
                     @RequestParam("pass") String pass)
    {
        return this.userService.isExist(name,pass);
    }
}
