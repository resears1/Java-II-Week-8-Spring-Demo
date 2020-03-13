package pc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pc.beans.Components;
import pc.beans.Computer;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Computer computer() {
		Computer bean = new Computer("Ricky's PC");
		//bean.setName("Ricky's PC");
		//bean.setBuildYear(2020);
		//bean.setPower("High-end");
		return bean;
	}
	
	@Bean
	public Components components() {
		Components bean = new Components("Ryzen 5 1600", "RTX 2060S", 600, 16);
		return bean;
	}
}
