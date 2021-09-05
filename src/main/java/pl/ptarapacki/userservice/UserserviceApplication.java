package pl.ptarapacki.userservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.ptarapacki.userservice.domain.Role;
import pl.ptarapacki.userservice.domain.User;
import pl.ptarapacki.userservice.service.UserService;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_MENAGER"));
			userService.saveRole(new Role(null, "ROLE_USER"));

			userService.saveUser(new User(null, "Przemek Tarapacki", "rumcajs", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Magdalena Wolna", "Majda", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Sylvester", "Rambo", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Paulina", "tworek", "1234", new ArrayList<>()));

			userService.addRoleToUser("rumcajs", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Majda", "ROLE_ADMIN");
			userService.addRoleToUser("Rambo", "ROLE_MENAGERR");
			userService.addRoleToUser("tworek", "ROLE_USER");
			userService.addRoleToUser("Rambo", "RROLE_MENAGER");
			userService.addRoleToUser("rumcajs", "ROLE_ADMIN");
		};
	}
}
