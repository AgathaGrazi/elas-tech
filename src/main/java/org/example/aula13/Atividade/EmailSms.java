package org.example.aula13.Atividade;

import java.util.ArrayList;

public class EmailSms {
    static void main() {
        ArrayList<Notificacao> mensagem = new ArrayList<>();
        mensagem.add(new Email());
        mensagem.add(new SMS());

        for (Notificacao mensagens : mensagem){
            mensagens.enviar("Sua compra foi aprovada!");
        }

    }
}
