package org.goldyxdxd.demoJwt.service;

import org.goldyxdxd.demoJwt.entity.Role;
import org.goldyxdxd.demoJwt.entity.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
