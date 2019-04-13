package cn.ce.st.gateawy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @Author houxi
* @Description
* @Date 13:52 2019/4/13
**/
@SpringBootApplication
@EnableEurekaClient
public class GateawyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateawyApplication.class, args);
	}

}
