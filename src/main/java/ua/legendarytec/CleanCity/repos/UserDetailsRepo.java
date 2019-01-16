package ua.legendarytec.CleanCity.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.legendarytec.CleanCity.domains.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
