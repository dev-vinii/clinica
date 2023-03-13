package br.com.geradordedevs.clinicaveterinaria.repositories;

import br.com.geradordedevs.clinicaveterinaria.entities.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}
