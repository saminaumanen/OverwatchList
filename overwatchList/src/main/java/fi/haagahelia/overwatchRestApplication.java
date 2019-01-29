package fi.haagahelia;

import fi.haagahelia.domain.Character;
import fi.haagahelia.domain.CharacterRepository;
import fi.haagahelia.domain.User;
import fi.haagahelia.domain.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class overwatchRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(overwatchRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CharacterRepository repository, UserRepository userRepository) {
		return (args) -> {
			repository.save(new Character("Tracer", "Hanamura", "WIN"));
			repository.save(new Character("Zenyatta", "Kings Row", "LOSS"));
			repository.save(new Character("Reinhardt", "Junkertown", "WIN"));
			repository.save(new Character("Winston", "Oasis", "WIN"));
			repository.save(new Character("Zarya", "Numbani", "WIN"));

			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			userRepository.save(user1);
			userRepository.save(user2);
		};
	}
}
