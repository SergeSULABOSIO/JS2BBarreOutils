package CallBackBarreOutils;

import BEAN_BARRE_OUTILS.Bouton;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP Pavilion
 */
public abstract class EcouteurSelection {
    public abstract Bouton whenOpened();
    public abstract Bouton whenSelected();
    public abstract Bouton whenClosed();
}
