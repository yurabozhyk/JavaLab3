package ua.lviv.iot.zoo.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.zoo.models.Shark;

import javax.transaction.Transactional;

@Transactional
public interface SharkRepository extends CrudRepository<Shark, Integer> {
}
