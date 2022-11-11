package ufps.app.email_microservice.tut1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.amqp.core.Queue;

@Profile({"tut1","hola-mundo"})
public class tutconfig {
    @Bean
    public Queue hola ()  {
        return  new Queue ( "hola" );
    }

    @Profile("receptor")
    @Bean
    public Tut1Receiver receptor ()  {
        return  new Tut1Receiver();
    }

    @Profile("remitente")
    @Bean
    public Tut1Sender remitente ()  {
        return  new Tut1Sender();
    }
}
