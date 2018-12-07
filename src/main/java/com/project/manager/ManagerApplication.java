package com.project.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.project.manager.domain.Torder;
import com.project.manager.domain.TorderRepository;
import com.project.manager.domain.UnitRepository;
import com.project.manager.domain.User;
import com.project.manager.domain.UserRepository;
import com.project.manager.domain.Item;
import com.project.manager.domain.ItemRepository;
import com.project.manager.domain.Unit;



@SpringBootApplication
public class ManagerApplication {
	private static final Logger log = LoggerFactory.getLogger(ManagerApplication.class);
	

	public static void main(String[] args) {
		SpringApplication.run(ManagerApplication.class, args);
	}
	
	
	
	@Bean
	public CommandLineRunner oderDe (TorderRepository repository, ItemRepository itemrepository, UnitRepository unitrepository, UserRepository urepository) {
		return (args) -> {
			log.info("save orders");
			
			// username: user password: user
		      urepository.save(new User("Johny",
		      "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi",
		      "USER"));
		      // username: admin password: admin
		      urepository.save(new User("Olga",
		      "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", 
		      "ADMIN"));

	
	itemrepository.save(new Item ("Nuts"));
	itemrepository.save(new Item ("Bolts"));
	itemrepository.save(new Item ("Screws"));
	itemrepository.save(new Item ("Nails"));
	itemrepository.save(new Item ("Lugs"));
	itemrepository.save(new Item ("Dampers"));
	itemrepository.save(new Item ("Rods"));
	itemrepository.save(new Item ("Pins"));
	
	
	
	Unit unit1 = new Unit ("Piece");
	Unit unit2 = new Unit("Box");
	Unit unit3 = new Unit ("Package");
	Unit unit4 = new Unit ("Set");
	unitrepository.save(unit1);
	unitrepository.save(unit2);
	unitrepository.save(unit3);
	unitrepository.save(unit4);
	
	repository.save(new Torder (100, "12/12/2018",  itemrepository.findByName("Nuts").get(0), unit2));
	repository.save(new Torder (100, "11/12/2018",  itemrepository.findByName("Lugs").get(0), unit3));
	repository.save(new Torder (100, "10/12/2018",  itemrepository.findByName("Nuts").get(0), unit2));
	repository.save(new Torder (100, "12/12/2018",  itemrepository.findByName("Nails").get(0), unit4));
	repository.save(new Torder (100, "11/11/2018",  itemrepository.findByName("Nuts").get(0), unit1));
	repository.save(new Torder (100, "10/10/2018",  itemrepository.findByName("Rods").get(0), unit1));
	repository.save(new Torder (100, "12/10/2018",  itemrepository.findByName("Pins").get(0), unit4));
	repository.save(new Torder (100, "12/11/2018",  itemrepository.findByName("Nuts").get(0), unit1));
	repository.save(new Torder (100, "12/12/2018",  itemrepository.findByName("Nuts").get(0), unit2));
	repository.save(new Torder (100, "11/12/2018",  itemrepository.findByName("Lugs").get(0), unit3));
	repository.save(new Torder (100, "10/12/2018",  itemrepository.findByName("Nuts").get(0), unit2));
	repository.save(new Torder (100, "12/12/2018",  itemrepository.findByName("Nails").get(0), unit4));
	repository.save(new Torder (100, "11/11/2018",  itemrepository.findByName("Nuts").get(0), unit1));
	repository.save(new Torder (100, "10/10/2018",  itemrepository.findByName("Rods").get(0), unit1));
	repository.save(new Torder (100, "12/10/2018",  itemrepository.findByName("Pins").get(0), unit4));
	repository.save(new Torder (100, "12/11/2018",  itemrepository.findByName("Nuts").get(0), unit1));
	repository.save(new Torder (100, "12/12/2018",  itemrepository.findByName("Nuts").get(0), unit2));
	repository.save(new Torder (100, "11/12/2018",  itemrepository.findByName("Lugs").get(0), unit3));
	repository.save(new Torder (100, "10/12/2018",  itemrepository.findByName("Nuts").get(0), unit2));
	repository.save(new Torder (100, "12/12/2018",  itemrepository.findByName("Nails").get(0), unit4));
	repository.save(new Torder (100, "11/11/2018",  itemrepository.findByName("Nuts").get(0), unit1));
	repository.save(new Torder (100, "10/10/2018",  itemrepository.findByName("Rods").get(0), unit1));
	repository.save(new Torder (100, "12/10/2018",  itemrepository.findByName("Pins").get(0), unit4));
	repository.save(new Torder (100, "12/11/2018",  itemrepository.findByName("Nuts").get(0), unit1));
	repository.save(new Torder (100, "12/12/2018",  itemrepository.findByName("Nuts").get(0), unit2));
	repository.save(new Torder (100, "11/12/2018",  itemrepository.findByName("Lugs").get(0), unit3));
	repository.save(new Torder (100, "10/12/2018",  itemrepository.findByName("Nuts").get(0), unit2));
	repository.save(new Torder (100, "12/12/2018",  itemrepository.findByName("Nails").get(0), unit4));
	repository.save(new Torder (100, "11/11/2018",  itemrepository.findByName("Nuts").get(0), unit1));
	repository.save(new Torder (100, "10/10/2018",  itemrepository.findByName("Rods").get(0), unit1));

	
	
	
	
	
	
	log.info("fetch all orders");
	for (Torder torder : repository.findAll()) {
		log.info(torder.toString());
	}

};

}
 

}

