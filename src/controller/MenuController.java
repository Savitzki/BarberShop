/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Agenda;
import view.Menu;

/**
 *
 * @author Marina Savitzki
 */
public class MenuController {
    
    private final Menu menuPrincipal;

    public MenuController(Menu menu) {
        this.menuPrincipal = menu;
    }
    
    public void goAgenda(){
        Agenda agenda = new Agenda(null, false);
        agenda.setVisible(true);
        
    }
        
    
}
