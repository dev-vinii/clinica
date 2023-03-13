package br.com.geradordedevs.clinicaveterinaria.services.impl;

import br.com.geradordedevs.clinicaveterinaria.entities.EmployeeEntity;
import br.com.geradordedevs.clinicaveterinaria.repositories.EmployeeRepository;
import br.com.geradordedevs.clinicaveterinaria.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity findById(Long id) {
        return employeeRepository.findById(id).orElse(new EmployeeEntity());
    }

    @Override
    public EmployeeEntity save(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity update(Long id, EmployeeEntity employeeEntity) {
        employeeEntity.setId(id);
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
