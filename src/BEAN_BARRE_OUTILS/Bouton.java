/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN_BARRE_OUTILS;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author HP Pavilion
 */
public class Bouton {

    private int taille;
    private JButton bouton;
    private final String nom;
    private final ImageIcon icone;
    private final BoutonListener ecouteur;

    public Bouton(int taille, String nom, ImageIcon icone, BoutonListener ecouteur) {
        this.taille = taille;
        this.nom = nom;
        this.icone = icone;
        this.ecouteur = ecouteur;
        init();
    }

    private void init() {
        bouton = new JButton();
        bouton.setIcon(this.icone);
        bouton.setText(this.nom);
        bouton.setFont(new java.awt.Font("Tahoma", Font.PLAIN, this.taille));
        bouton.setToolTipText(this.nom);
        bouton.setEnabled(true);
        bouton.setFocusable(false);
        bouton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bouton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecouteur.OnEcouteLeClick();
            }
        });
    }
    
    public void setGras(boolean isGras){
        if(isGras == true){
            bouton.setFont(new java.awt.Font("Tahoma", Font.BOLD, taille));
        }else{
            bouton.setFont(new java.awt.Font("Tahoma", Font.PLAIN, taille));
        }
    }
    
    public boolean isGras(){
        if(bouton.getFont().getStyle() == Font.BOLD){
            return true;
        }else{
            return false;
        }
    }
    
    public void setText(String texte, int taille, boolean isGras){
        bouton.setText(texte);
        if(isGras == true){
            bouton.setFont(new java.awt.Font("Tahoma", Font.BOLD, taille));
        }else{
            bouton.setFont(new java.awt.Font("Tahoma", Font.PLAIN, taille));
        }
    }
    

    public JButton getBouton() {
        return bouton;
    }

    public void appliquerDroitAccessDynamique(boolean oui) {
        this.bouton.setEnabled(oui);
    }

}
