package guru.springframework.spring6restmvc;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.services.BeerService;
import guru.springframework.spring6restmvc.services.BeerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.UUID;

@SpringBootApplication
public class Spring6RestMvcApplication {



	public static void main(String[] args) {
		//Beer beer = new Beer();
		//beer.setQuantityOnHand(23);
		//System.out.println(beer.getQuantityOnHand());
		//System.out.println("test nish");
		//System.out.println(new BeerServiceImpl().getBeerById(UUID.randomUUID()));

		ConfigurableApplicationContext run = SpringApplication.run(Spring6RestMvcApplication.class, args);
		BeerService bean = run.getBean(BeerService.class);
		Beer beerById = bean.getBeerById(UUID.randomUUID());
		System.out.println(beerById.getBeerStyle().toString());
	}

}
