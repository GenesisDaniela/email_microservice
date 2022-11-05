package ufps.app.email_microservice.service;

import ufps.app.email_microservice.model.Email;

import java.util.List;

public interface EmailService {
    public List<Email> listarEmails();
}
