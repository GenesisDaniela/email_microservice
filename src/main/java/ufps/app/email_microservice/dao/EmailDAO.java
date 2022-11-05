package ufps.app.email_microservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.app.email_microservice.model.Email;

public interface EmailDAO extends JpaRepository<Email, Integer> {
}
