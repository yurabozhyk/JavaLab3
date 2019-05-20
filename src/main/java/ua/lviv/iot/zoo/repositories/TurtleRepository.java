package ua.lviv.iot.zoo.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.zoo.models.Turtle;

import javax.transaction.Transactional;

@Transactional
public interface TurtleRepository extends CrudRepository<Turtle, Integer> {
}
