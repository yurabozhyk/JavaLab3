package ua.lviv.iot.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.zoo.models.Penguin;
import ua.lviv.iot.zoo.repositories.PenguinRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
public class PenguinController {

    @Autowired
    private PenguinRepository penguinRepository;

    @RequestMapping(value = "/penguin", method = RequestMethod.GET)
    public List<Penguin> getPenguins() {
        List<Penguin> allPenguins = new LinkedList<>();
        penguinRepository.findAll().forEach(allPenguins::add);
        if (allPenguins.isEmpty())
            return null;
        return allPenguins;
    }

    @RequestMapping(value = "/penguin/{id}", method = RequestMethod.GET)
    public Penguin getPenguin(@PathVariable Integer id) {
        Optional<Penguin> penguin = penguinRepository.findById(id);
        if (penguin.isPresent()) {
            return penguin.get();
        }
        return null;
    }

    @RequestMapping(value = "/penguin", method = RequestMethod.POST)
    public Penguin addPenguin(@RequestBody Penguin penguin) {
        return penguinRepository.save(penguin);
    }

    @RequestMapping(value = "/penguin", method = RequestMethod.PUT)
    public Penguin updatePenguin(@RequestBody Penguin penguin) {
        return penguinRepository.save(penguin);
    }

    @RequestMapping(value = "/penguin/{id}", method = RequestMethod.DELETE)
    public void deletePenguin(@PathVariable Integer id) {
        if (penguinRepository.findById(id).isPresent()) {
            penguinRepository.deleteById(id);
        }
    }
}
