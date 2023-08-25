package br.com.geradordedevs.clinicaveterinaria.controllers;

import br.com.geradordedevs.clinicaveterinaria.entities.AnimalEntity;
import br.com.geradordedevs.clinicaveterinaria.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal")
@CrossOrigin(origins = "*")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public Iterable<AnimalEntity> getAllAnimals() {
        return animalService.findAll();
    }

    @PostMapping
    public AnimalEntity postNewAnimal(@RequestBody AnimalEntity animalEntity) {
        return animalService.save(animalEntity);
    }

    @PutMapping("/{id}")
    public AnimalEntity putAnimal(@PathVariable Long id, @RequestBody AnimalEntity animalEntity) {
        return animalService.update(id, animalEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        animalService.deleteById(id);
    }
}
