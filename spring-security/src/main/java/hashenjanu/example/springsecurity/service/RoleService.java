package hashenjanu.example.springsecurity.service;

import hashenjanu.example.springsecurity.entity.Role;
import hashenjanu.example.springsecurity.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;
    public Role createNewRole(Role role){

        return roleRepo.save(role);
    }
}
