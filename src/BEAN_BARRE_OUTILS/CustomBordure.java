/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN_BARRE_OUTILS;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 *
 * @author HP Pavilion
 */
public class CustomBordure implements Border{
    
    public static Color COULEUR_BLEU = new Color(26, 45, 77);       //Pour plus d'infos visiter le lien https://www.colorhexa.com/1a2e4d
    public static Color COULEUR_BLEU_CLAIRE_1 = new Color(68, 117, 192);    //Une variante claire
    public static Color COULEUR_BLEU_CLAIRE_2 = new Color(141, 171, 217);    //Une variante claire
    public static Color COULEUR_ORANGE = new Color(251, 155, 12);   //Pour plus d'information, visiter le lien https://www.colorhexa.com/fb9b0c
    public static Color COULEUR_ROUGE = new Color(251, 36, 12);       //Une variante  

    public Insets insets;

    public CustomBordure(Insets insets) {
        this.insets = insets;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

        Insets insets = getBorderInsets(c);
        if (COULEUR_ORANGE != null) {
            g.setColor(COULEUR_ORANGE);
        }

        g.fill3DRect(0, 0, width - insets.right, insets.top, true);   //Haut
        g.fill3DRect(0, insets.top, insets.left, height - insets.top, true);  //Gauche
        g.fill3DRect(insets.left, height - insets.bottom, width - insets.left, insets.bottom, true);  //Bas
        g.fill3DRect(width - insets.right, 0, insets.right, height - insets.bottom, true);    //Droite
    }

    public Insets getBorderInsets(Component c) {
        return insets;
    }

    public boolean isBorderOpaque() {
        return true;
    }

}
