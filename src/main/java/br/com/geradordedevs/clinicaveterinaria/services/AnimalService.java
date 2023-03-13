package br.com.geradordedevs.clinicaveterinaria.services;

import br.com.geradordedevs.clinicaveterinaria.entities.AnimalEntity;

public interface AnimalService {

    Iterable<AnimalEntity> findAll();
    AnimalEntity findById(Long id);
    AnimalEntity update(Long id, AnimalEntity animalEntity);
    AnimalEntity save(AnimalEntity animalEntity);
    void deleteById(Long id);
}
