package br.com.geradordedevs.clinicaveterinaria.repositories;

import br.com.geradordedevs.clinicaveterinaria.entities.ManagerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends CrudRepository <ManagerEntity, Long> {
}
