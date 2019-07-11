/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN_BARRE_OUTILS;

import java.awt.PopupMenu;
import javax.swing.JToolBar;

/**
 *
 * @author HP Pavilion
 */
public class BarreOutils {

    private final JToolBar barreOutils;

    public BarreOutils(JToolBar barreOutils) {
        this.barreOutils = barreOutils;
        this.barreOutils.removeAll();
    }

    public void AjouterBouton(Bouton bouton) {
        barreOutils.add(bouton.getBouton());
    }
    
    public void AjouterComposant(PopupMenu bouton) {
        barreOutils.add(bouton);
    }
    
    public void SupprimerBouton(Bouton bouton){
        barreOutils.remove(bouton.getBouton());
    }

    public void AjouterSeparateur() {
        barreOutils.addSeparator();
    }
    
    public void Vider(){
        barreOutils.removeAll();
    }

}
