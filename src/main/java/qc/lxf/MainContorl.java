package qc.lxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


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
public class MainContorl extends WebMvcConfigurerAdapter {
    /**
     * hello
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainContorl.class, args);
        /*hello*/
    }
    String a(){
        return "1";
    }
    //hi
}
