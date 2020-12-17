package io.arsh.portfolio.onileservicetracker.repo;

import io.arsh.portfolio.onileservicetracker.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
