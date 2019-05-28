package ua.lviv.iot.zoo.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.zoo.models.AquariumAnimal;

public interface AquariumAnimalRepository<T  extends AquariumAnimal> extends
        CrudRepository<T, Integer> {
}
