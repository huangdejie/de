package com.fanstasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by huangdejie on 2018/8/9 0009.
 */
@SpringBootApplication
@EnableConfigServer
public class FanstasyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanstasyApplication.class,args);
    }

}
