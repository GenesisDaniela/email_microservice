package ufps.app.email_microservice.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "email")
@NamedQueries({
        @NamedQuery(name = "Email.findAll", query = "SELECT e FROM Email e")})
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 250)
    @Column(name = "email")
    private String email;
    @Size(max = 250)
    @Column(name = "asunto")
    private String asunto;
    @Column(name = "cuerpo")
    private String cuerpo;
    @Column(name = "estado")
    private boolean estado;

    public Email(){}

    public Email(String asunto, String email, String cuerpo, boolean estado) {
        this.asunto = asunto;
        this.email = email;
        this.cuerpo = cuerpo;
        this.estado = estado;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
