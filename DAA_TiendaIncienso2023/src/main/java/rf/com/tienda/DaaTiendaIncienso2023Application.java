package rf.com.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DaaTiendaIncienso2023Application {

	public static void main(String[] args) {
		SpringApplication.run(DaaTiendaIncienso2023Application.class, args);
	}

}
