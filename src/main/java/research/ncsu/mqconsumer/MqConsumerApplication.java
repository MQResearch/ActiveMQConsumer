package research.ncsu.mqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,SecurityAutoConfiguration.class,ManagementWebSecurityAutoConfiguration.class})
public class MqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqConsumerApplication.class, args);
	}

}
