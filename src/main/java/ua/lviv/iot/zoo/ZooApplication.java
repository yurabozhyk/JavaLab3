package ua.lviv.iot.zoo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.zoo.models.*;
import ua.lviv.iot.zoo.repositories.PenguinRepository;


@SpringBootApplication
public class ZooApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZooApplication.class, args);
	}

	@Bean
	public CommandLineRunner penguinBean(final PenguinRepository penguinRepository) {
		return (args) -> {
			penguinRepository.save(new Penguin("Obeme", 15, 7, Sex.MALE, 2000, Species.BIRDS, 155, 55, SpeciesOfPenguin.FAIRY));
			penguinRepository.findAll().forEach(penguin -> System.out.println(penguin));
		};
	}
}
