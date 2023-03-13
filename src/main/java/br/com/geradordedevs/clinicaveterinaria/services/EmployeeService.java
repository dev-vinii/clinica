package br.com.geradordedevs.clinicaveterinaria.services;

import br.com.geradordedevs.clinicaveterinaria.entities.EmployeeEntity;

public interface EmployeeService {
    Iterable<EmployeeEntity> findAll();
    EmployeeEntity findById(Long id);
    EmployeeEntity save(EmployeeEntity employeeEntity);
    EmployeeEntity update(Long id, EmployeeEntity employeeEntity);
    void deleteById(Long id);
}
