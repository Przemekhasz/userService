package pl.ptarapacki.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ptarapacki.userservice.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
