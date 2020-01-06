/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN_BARRE_OUTILS;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author HP Pavilion
 */
public class Bouton {

    public static Color COULEUR_BLEU = new Color(26, 45, 77);       //Pour plus d'infos visiter le lien https://www.colorhexa.com/1a2e4d
    public static Color COULEUR_BLEU_CLAIRE_1 = new Color(68, 117, 192);    //Une variante claire
    public static Color COULEUR_BLEU_CLAIRE_2 = new Color(141, 171, 217);    //Une variante claire
    public static Color COULEUR_ORANGE = new Color(251, 155, 12);   //Pour plus d'information, visiter le lien https://www.colorhexa.com/fb9b0c
    public static Color COULEUR_ROUGE = new Color(251, 36, 12);       //Une variante  

    private int taille;
    private JButton bouton;
    private String nom;
    private ImageIcon icone;
    private BoutonListener ecouteur;
    private boolean isGras;
    private String infosBulle;

    public Bouton(int taille, String nom, String infosBulle, boolean isGras, ImageIcon icone, BoutonListener ecouteur) {
        this.taille = taille;
        this.nom = nom;
        this.icone = icone;
        this.ecouteur = ecouteur;
        this.infosBulle = infosBulle;
        this.isGras = isGras;
        init();
    }

    private void init() {
        bouton = new JButton();
        bouton.setIcon(this.icone);
        bouton.setText(this.nom);
        bouton.setToolTipText(this.infosBulle);
        if (isGras == true) {
            bouton.setFont(new java.awt.Font("Tahoma", Font.BOLD, this.taille));
        } else {
            bouton.setFont(new java.awt.Font("Tahoma", Font.PLAIN, this.taille));
        }
        bouton.setEnabled(true);
        bouton.setFocusable(false);
        bouton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bouton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecouteur.OnEcouteLeClick();
            }
        });
        bouton.repaint();
    }

    public void setIsOpenned() {
        bouton.setForeground(Color.WHITE);

    }

    public void setIsClosed() {
        bouton.setForeground(COULEUR_ORANGE);
        setIsSelected(false);
    }

    public void setIsSelected(boolean rep) {
        bouton.setBorder(new CustomBordure(this, rep));
    }

    public void setVisible(boolean montrer) {
        bouton.setVisible(montrer);
    }

    public void setInfosBulle(String texte) {
        bouton.setToolTipText(texte);
    }

    public void setForeground(Color couleur) {
        bouton.setForeground(couleur);
    }

    public void setBackground(Color color) {
        bouton.setBackground(color);
    }

    public void setIcone(ImageIcon icone) {
        this.icone = icone;
        bouton.setIcon(this.icone);
    }

    public void setGras(boolean isGras) {
        if (isGras == true) {
            bouton.setFont(new java.awt.Font("Tahoma", Font.BOLD, taille));
        } else {
            bouton.setFont(new java.awt.Font("Tahoma", Font.PLAIN, taille));
        }
    }

    public boolean isGras() {
        if (bouton.getFont().getStyle() == Font.BOLD) {
            return true;
        } else {
            return false;
        }
    }

    public void setText(String texte, int taille, boolean isGras) {
        bouton.setText(texte);
        if (isGras == true) {
            bouton.setFont(new java.awt.Font("Tahoma", Font.BOLD, taille));
        } else {
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
