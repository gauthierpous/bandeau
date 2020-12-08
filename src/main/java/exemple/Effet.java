/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author gauthierpous
 */
public abstract class Effet {
    public String message;
    public int rep;
    public Bandeau bandeau;

    public Effet(String message, int rep, Bandeau bandeau) {
        this.message = message;
        this.rep = rep;
        this.bandeau = bandeau;
    }
    
    public abstract void afficher();
}