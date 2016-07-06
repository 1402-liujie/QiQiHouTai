package cn.wzvtc.soft14;


import cn.wzvtc.soft14.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by linji on 2016/3/4.
        */

@RestController
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@CrossOrigin(origins = {},methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
public class Contorl extends WebMvcConfigurerAdapter {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Contorl.class, args);
    }
}
