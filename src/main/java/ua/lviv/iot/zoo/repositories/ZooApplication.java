package ua.lviv.iot.zoo.repositories;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.zoo.models.*;


@SpringBootApplication
public class ZooApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZooApplication.class, args);
	}

	@Bean
	public CommandLineRunner turtleBean(final TurtleRepository turtleRepository) {
		return (args) -> {
			turtleRepository.save(new Turtle("Obeme", 150, 25, Sex.MALE, 3000, Species.REPTILE, Shell.BROWN_PATTERN, 2000));
			turtleRepository.findAll().forEach(turtle -> System.out.print(turtle));
		};
//		Turtle turtle = new Turtle("Obeme", 150, 25, Sex.MALE, 3000, Species.REPTILE, Shell.BROWN_PATTERN, 2000);
//		return (args) -> {
//			turtleRepository.save(turtle);
//			turtleRepository.findAll().forEach(turtle -> System.out.println(turtle));
//		};
	}

	@Bean
	public CommandLineRunner sharkBean(final SharkRepository sharkRepository) {
//		Shark shark = new Shark("Bomabigma", 8, 2, Sex.FEMALE, 5000, Species.FISH, SpeciesOfSharks.HAMMERHEAD, 140, SwimType.ALONE);
		return (args) -> {
			sharkRepository.save(new Shark ("Bomabigma", 8, 2, Sex.FEMALE, 5000, Species.FISH, SpeciesOfSharks.HAMMERHEAD, 140, SwimType.ALONE));
			sharkRepository.findAll().forEach(shark -> System.out.println(shark));
		};
	}

	@Bean
	public CommandLineRunner penguinBean(final PenguinRepository penguinRepository) {
//		Penguin penguin = new Penguin("Boy", 10, 6, Sex.MALE, 2000, Species.BIRDS, 150, 55, SpeciesOfPenguin.FAIRY);
		return (args) -> {
			penguinRepository.save(new Penguin("Boy", 10, 6, Sex.MALE, 2000, Species.BIRDS, 150, 55, SpeciesOfPenguin.FAIRY));
			penguinRepository.findAll().forEach(penguin -> System.out.println(penguin));
		};
	}
}
