package pl.ptarapacki.userservice.service;

import pl.ptarapacki.userservice.domain.Role;
import pl.ptarapacki.userservice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
