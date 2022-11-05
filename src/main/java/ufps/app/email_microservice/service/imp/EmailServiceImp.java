package ufps.app.email_microservice.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import ufps.app.email_microservice.service.EmailSenderService;

import javax.mail.MessagingException;

public class EmailServiceImp {
    @Autowired
    private EmailSenderService emailSenderService;

    @Value("{spring.mail.username}")
    private String emailFrom;

    public void enviarEmail(String asunto, String mensaje, String destinatario) throws MessagingException {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(emailFrom);
        simpleMailMessage.setText(mensaje);
        simpleMailMessage.setSubject(asunto);
        simpleMailMessage.setTo(destinatario);

        emailSenderService.sendEmail(simpleMailMessage);
    }
}
