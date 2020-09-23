/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import model.Scheduling;

/**
 *
 * @author Marina Savitzki
 */
public class Correio {
    /**
     * Enviar email com dados do agendamento do cliente
     * @param scheduling 
     */
    public void notifyEmail(Scheduling scheduling){
        
        String emailFormated = formatEmail(scheduling);
        //destinatarios
        String remittee = scheduling.getCliente().getEmail();
        
        /*
        Uso da classe email
        */
        
        Email newEmail = new Email("BaberShop", emailFormated, remittee);
        newEmail.enviar();
    }

    private String formatEmail(Scheduling scheduling) {
        
        String nameClient = scheduling.getCliente().getNome();
        String service = scheduling.getServico().getDescricao();
        String dateScheduling = scheduling.getDataFormated();
        String hourScheduling = scheduling.getHoraFormated();
        float value = scheduling.getValor();
        
        return "Olá " + nameClient + " Vai dar uma renovada no visual... Seu agendamento para " + 
                service +", está marcado para a dia " + dateScheduling +" as " + hourScheduling 
                + " com o valor de " + value + " Obrigado pela preferencia.";
    }
        
}
