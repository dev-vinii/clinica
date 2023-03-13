package br.com.geradordedevs.clinicaveterinaria.services.impl;

import br.com.geradordedevs.clinicaveterinaria.entities.AnimalEntity;
import br.com.geradordedevs.clinicaveterinaria.repositories.AnimalRepository;
import br.com.geradordedevs.clinicaveterinaria.services.AnimalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Iterable<AnimalEntity> findAll() {
        return animalRepository.findAll();
    }

    @Override
    public AnimalEntity findById(Long id) {
        return animalRepository.findById(id).orElse(new AnimalEntity());
    }

    @Override
    public AnimalEntity update(Long id, AnimalEntity animalEntity) {
        animalEntity.setId(id);
        return animalRepository.save(animalEntity);
    }

    @Override
    public AnimalEntity save(AnimalEntity animalEntity) {
        return animalRepository.save(animalEntity);
    }

    @Override
    public void deleteById(Long id) {
        animalRepository.deleteById(id);
    }
}
