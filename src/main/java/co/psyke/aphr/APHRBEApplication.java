package co.psyke.aphr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class APHRBEApplication {
	 public static void main(String[] args) {
                ApplicationContext ctx  = SpringApplication.run(APHRBEApplication.class, args);
                System.out.println("List of all loaded beans");
                for (String x : ctx.getBeanDefinitionNames()){
                        System.out.println(x);
                }
        }

}
