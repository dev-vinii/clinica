package br.com.geradordedevs.clinicaveterinaria.services.impl;

import br.com.geradordedevs.clinicaveterinaria.entities.ManagerEntity;
import br.com.geradordedevs.clinicaveterinaria.repositories.ManagerRepository;
import br.com.geradordedevs.clinicaveterinaria.services.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public Iterable<ManagerEntity> findAll() {
        return managerRepository.findAll();
    }

    @Override
    public ManagerEntity findById(Long id) {
        return managerRepository.findById(id).orElse(new ManagerEntity());
    }

    @Override
    public ManagerEntity save(ManagerEntity managerEntity) {
        return managerRepository.save(managerEntity);
    }

    @Override
    public ManagerEntity update(Long id, ManagerEntity managerEntity) {
        managerEntity.setId(id);
        return managerRepository.save(managerEntity);
    }

    @Override
    public void deleteById(Long id) {
        managerRepository.deleteById(id);
    }
}
