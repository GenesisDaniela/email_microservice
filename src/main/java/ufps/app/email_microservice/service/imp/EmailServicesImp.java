package ufps.app.email_microservice.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufps.app.email_microservice.dao.EmailDAO;
import ufps.app.email_microservice.model.Email;
import ufps.app.email_microservice.service.EmailService;

import java.util.List;

@Service
public class EmailServicesImp implements EmailService {

    @Autowired
    EmailDAO emailDAO;

    @Override
    public List<Email> listarEmails() {
        return emailDAO.findAll();
    }

    @Override
    public Email guardar(Email email) {
        return emailDAO.save(email);
    }


}
