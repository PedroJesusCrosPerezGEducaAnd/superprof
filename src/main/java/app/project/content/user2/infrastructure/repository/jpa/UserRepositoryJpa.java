package app.project.content.user2.infrastructure.repository.jpa;

import app.project.content.user2.infrastructure.repository.jpa.entity.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJpa extends JpaRepository<UserJpa, Long> {}