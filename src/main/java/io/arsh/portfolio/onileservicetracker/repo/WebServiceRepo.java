package io.arsh.portfolio.onileservicetracker.repo;

import io.arsh.portfolio.onileservicetracker.domain.WebService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebServiceRepo extends JpaRepository<WebService,Long> {
}
