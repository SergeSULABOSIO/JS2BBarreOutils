/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN_BARRE_OUTILS;

import CallBackBarreOutils.EcouteurSelection;
import java.awt.PopupMenu;
import java.util.Vector;
import javax.swing.JToolBar;

/**
 *
 * @author HP Pavilion
 */
public class BarreOutils {
    private EcouteurSelection es;
    private Vector<Bouton> bts = new Vector<Bouton>();
    

    public BarreOutils() {
        this.barreOutils = null;
    }

    private final JToolBar barreOutils;

    public BarreOutils(JToolBar barreOutils) {
        this.barreOutils = barreOutils;
        this.barreOutils.removeAll();
    }

    public void AjouterBouton(Bouton bouton) {
        barreOutils.add(bouton.getBouton());
        if(!bts.contains(bouton)){
            bts.add(bouton);
        }
    }
    
    public void AjouterComposant(PopupMenu bouton) {
        barreOutils.add(bouton);
    }
    
    public void SupprimerBouton(Bouton bouton){
        barreOutils.remove(bouton.getBouton());
        if(bts.contains(bouton)){
            bts.remove(bouton);
        }
    }

    public void AjouterSeparateur() {
        barreOutils.addSeparator();
    }
    
    public void Vider(){
        barreOutils.removeAll();
    }
    
    public void setEcouteurSelection(EcouteurSelection es){
        this.es = es;
    }
    
    public void effacerSelection(){
        for(Bouton bt: bts){
            
        }
    }

}
