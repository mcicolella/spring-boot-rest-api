package net.emmecilab.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
	    basePackages = {
	        "org.openapitools",
	        "net.emmecilab.openapi",
	        "org.openapitools.configuration"
	    }
)
public class SpringApiContractFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiContractFirstApplication.class, args);
	}

}
