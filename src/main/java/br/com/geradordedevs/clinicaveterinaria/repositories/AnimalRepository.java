package br.com.geradordedevs.clinicaveterinaria.repositories;

import br.com.geradordedevs.clinicaveterinaria.entities.AnimalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<AnimalEntity, Long> {
}
