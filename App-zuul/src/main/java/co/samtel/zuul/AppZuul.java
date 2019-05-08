package co.samtel.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class AppZuul extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
        SpringApplication.run(AppZuul.class, args);
    }
}
