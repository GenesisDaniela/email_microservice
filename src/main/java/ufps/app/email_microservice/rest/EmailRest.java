package ufps.app.email_microservice.rest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import ufps.app.email_microservice.model.Email;
import ufps.app.email_microservice.service.EmailService;

import javax.validation.Valid;
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

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody @Valid String email, BindingResult br){
        if (br.hasErrors()) {
            return new ResponseEntity<List<ObjectError>>(br.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        emailService.guardar(new Email(email));
        return ResponseEntity.ok(email);
    }
}
