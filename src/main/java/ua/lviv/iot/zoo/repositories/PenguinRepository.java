package ua.lviv.iot.zoo.repositories;

import ua.lviv.iot.zoo.models.Penguin;

import javax.transaction.Transactional;

@Transactional
public interface PenguinRepository extends AquariumAnimalRepository<Penguin> {
}
