package co.samtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "co.samtel")
@EnableJpaRepositories(basePackages = "co.samtel.repo.repository")
public class App extends SpringBootServletInitializer 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
