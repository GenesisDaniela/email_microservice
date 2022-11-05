package ufps.app.email_microservice.rest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufps.app.email_microservice.model.Email;
import ufps.app.email_microservice.service.EmailService;

import java.util.List;

@RestController
@RequestMapping("api/email")
@CrossOrigin(origins = "*")
@Slf4j
public class EmailRest {

    @Autowired
    EmailService emailService;

    @GetMapping
    public ResponseEntity<List<Email>> listar(){
        return ResponseEntity.ok(emailService.listarEmails());
    }
}
