package br.com.geradordedevs.clinicaveterinaria.controllers;

import br.com.geradordedevs.clinicaveterinaria.entities.ManagerEntity;
import br.com.geradordedevs.clinicaveterinaria.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping
    public Iterable<ManagerEntity> getAllManagers() {
        return managerService.findAll();
    }

    @GetMapping("/{id}")
    public ManagerEntity findById(@PathVariable Long id) {
        return managerService.findById(id);
    }

    @PostMapping
    public ManagerEntity saveNewManager(@RequestBody ManagerEntity managerEntity) {
        return managerService.save(managerEntity);
    }

    @PutMapping("/{id}")
    public ManagerEntity updateManager(@PathVariable Long id, @RequestBody ManagerEntity managerEntity) {
        return managerService.update(id, managerEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        managerService.deleteById(id);
    }
}
