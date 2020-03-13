package pc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import pc.beans.Components;
import pc.beans.Computer;
import pc.controller.BeanConfiguration;
import pc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}
	
	@Autowired
	ComputerRepository repo;
	
	@Override
	public void run(String... args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Computer c = appContext.getBean("computer", Computer.class);
		c.setPower("High-end");
		repo.save(c);
		
		Computer d = new Computer("My Computer", 2020, "Pretty Powerful");
		Components cs = new Components("Ryzen 7 1700x", "RTX 2070s", 750, 32);
		d.setComponents(cs);
		repo.save(d);
		
		List<Computer> allComputers = repo.findAll();
		for(Computer comps: allComputers) {
			System.out.println(comps.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
