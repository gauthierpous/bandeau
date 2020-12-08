/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author gauthierpous
 */
public class Scenario {
    
    public Bandeau b;
    private ArrayList<Effet> lesEffets = new ArrayList<>();

    public Scenario(Bandeau b) {
        this.b = b;
    }
    
    public void ajouterEffet(Effet effet){
        this.lesEffets.add(effet);
    }
    
    public void executer(){
        lesEffets.forEach((e) -> {
            e.afficher();
            b.sleep(1000);
        });
        b.close();
    }
}
