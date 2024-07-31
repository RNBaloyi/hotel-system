package com.dailycodework.lakesidehotel.service;

import com.dailycodework.lakesidehotel.model.Role;
import com.dailycodework.lakesidehotel.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final RoleRepository roleRepository;

    @Autowired
    public DataInitializer(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        if (roleRepository.findByName("ROLE_USER").isEmpty()) {
//            Role userRole = new Role();
//            userRole.setName("ROLE_USER");
//            roleRepository.save(userRole);
//        }

        if (roleRepository.findByName("ROLE_ADMIN").isEmpty()) {
            Role userRole = new Role();
            userRole.setName("ROLE_ADMIN");
            roleRepository.save(userRole);
        }

    }
}
