/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

/**
 *
 * @author ZaCCC
 */
public class PFE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patient patient1 = new Patient("mouh","l3abassi","19.05.96","Male","n258, riadh -batna-","206639");
        System.out.println("Nom du patient :"+patient1.nom+"\n ----------- \n prénom du patient :"+patient1.prénom);
        
    }
    
}
