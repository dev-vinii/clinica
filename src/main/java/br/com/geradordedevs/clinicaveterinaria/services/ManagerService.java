package br.com.geradordedevs.clinicaveterinaria.services;

import br.com.geradordedevs.clinicaveterinaria.entities.ManagerEntity;

public interface ManagerService {
    Iterable<ManagerEntity> findAll();
    ManagerEntity findById(Long id);
    ManagerEntity save(ManagerEntity managerEntity);
    ManagerEntity update(Long id, ManagerEntity managerEntity);
    void deleteById(Long id);
}
