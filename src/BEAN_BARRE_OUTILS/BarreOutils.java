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
    private Vector<Bouton> btsOpenned = new Vector<Bouton>();
    private Vector<Bouton> btsSelected = new Vector<Bouton>();

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
    
    public void setEcouteurSelection(EcouteurSelection es){
        this.es = es;
    }
    
    public void appliquerEcouteur(){
        if(es != null){
            Bouton btOpenned = es.whenOpened();
            if(btOpenned != null){
                for(Bouton btop: btsOpenned){
                    if(btop.equals(btOpenned)){
                        if(!btsOpenned.contains(btOpenned)){
                            btsOpenned.add(btOpenned);
                        }
                    }
                }
            }
            
        }
    }

}
