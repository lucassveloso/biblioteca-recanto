package biblioteca.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"biblioteca"})
@EnableJpaRepositories(basePackages = {"biblioteca"})
@EntityScan(basePackages = {"biblioteca"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}