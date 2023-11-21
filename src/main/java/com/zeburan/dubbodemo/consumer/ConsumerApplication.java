package com.zeburan.dubbodemo.consumer;

import com.zeburan.dubbodemo.TimeService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;

/**
 * Create by swtywang on 11/21/23 10:14 PM
 */

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


    @RestController
    public static class IndexController{
        @DubboReference
        private TimeService timeService;

        @GetMapping("/")
        public String getTime(){
            return timeService.getTime().format(DateTimeFormatter.ISO_DATE_TIME);
        }
    }
}
