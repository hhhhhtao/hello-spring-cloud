package priv.hhhhhtao.hellospringcloudeureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: TODO
 * @project: hello-spring-cloud
 * @date: 2024/4/22 00:28
 * @author: hhhhhtao
 */
@SpringBootApplication
@EnableEurekaServer
public class HelloEurekaApplication {

    private static final Logger log = LoggerFactory.getLogger(HelloEurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloEurekaApplication.class, args);
        log.info("##########################");
        log.info("### eureka run success ###");
        log.info("##########################");
    }
}
