package pl.ptarapacki.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ptarapacki.userservice.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
