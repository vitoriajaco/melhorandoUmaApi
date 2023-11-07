package br.com.alura.adopet.api.service;

import br.com.alura.adopet.api.model.Adocao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void enviarEmail(String to, String subject, String message){

        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom("adopet@email.com.br");
       // email.setTo(adocao.getPet().getAbrigo().getEmail());
        email.setTo(to);
       // email.setSubject("Solicitação de adoção");
        email.setSubject(subject);
       // email.setText("Olá " +adocao.getPet().getAbrigo().getNome() +"!\n\nUma solicitação de adoção foi registrada hoje para o pet: " +adocao.getPet().getNome() +". \nFavor avaliar para aprovação ou reprovação.");
        email.setText(message);
        emailSender.send(email);


    }
}
