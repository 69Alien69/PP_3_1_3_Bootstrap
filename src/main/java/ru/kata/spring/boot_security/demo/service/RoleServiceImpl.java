package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleDAO;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class RoleServiceImpl implements RoleService {
    private final RoleDAO roleDAO;

    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }


    @Override
    public List<Role> getRoles() {
        return roleDAO.getRoles();
    }

    @Override
    public Role findByAuthority(String authority) {
        return roleDAO.findByAuthority(authority);
    }
}
