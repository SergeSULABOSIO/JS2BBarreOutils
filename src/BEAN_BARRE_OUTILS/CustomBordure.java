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

    public int top;
    public int left;
    public int bottom;
    public int right;
    public Color color = null;

    public CustomBordure() {
        this.top = 2;
        this.left = 4;
        this.bottom = 8;
        this.right = 10;
        this.color = Color.RED;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

        Insets insets = getBorderInsets(c);
        if (color != null) {
            g.setColor(color);
        }

        g.fill3DRect(0, 0, width - insets.right, insets.top, true);
        g.fill3DRect(0, insets.top, insets.left, height - insets.top, true);
        g.fill3DRect(insets.left, height - insets.bottom, width - insets.left, insets.bottom, true);
        g.fill3DRect(width - insets.right, 0, insets.right, height - insets.bottom, true);
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(top, left, bottom, right);
    }

    public boolean isBorderOpaque() {
        return true;
    }

}
