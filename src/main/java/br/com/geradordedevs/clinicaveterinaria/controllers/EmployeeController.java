package br.com.geradordedevs.clinicaveterinaria.controllers;

import br.com.geradordedevs.clinicaveterinaria.entities.EmployeeEntity;
import br.com.geradordedevs.clinicaveterinaria.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Iterable<EmployeeEntity> findAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public EmployeeEntity findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public EmployeeEntity postNewEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.save(employeeEntity);
    }

    @PutMapping("/{id}")
    public EmployeeEntity updateEmployee(@PathVariable Long id, @RequestBody EmployeeEntity employeeEntity) {
        return employeeService.update(id, employeeEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        employeeService.deleteById(id);
    }
}
