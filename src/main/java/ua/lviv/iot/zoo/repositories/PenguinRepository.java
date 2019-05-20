package ua.lviv.iot.zoo.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.zoo.models.Penguin;

import javax.transaction.Transactional;

@Transactional
public interface PenguinRepository extends CrudRepository<Penguin, Integer> {
}
