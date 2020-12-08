/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author gauthierpous
 */
public class Clignotant extends Effet{
    public Clignotant(String message, int rep, Bandeau bandeau) {
        super(message, rep, bandeau);
    }
    

    @Override
    public void afficher() {
        bandeau.setMessage(message);
        for (int n = 0; n < this.rep; n++) {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {
                    this.bandeau.setForeground(Color.white);
                    this.bandeau.sleep(100);
                }
                if ((i % 2) != 0) {
                    this.bandeau.setForeground(Color.black);
                    this.bandeau.sleep(100);

                }
            }
        }
    }
}
