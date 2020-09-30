/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptosymetrique;

import javax.swing.JFileChooser;

/**
 *
 * @author Oumy Gueye
 */
public class CryptoSymetrique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new KeyGeneration().keygeneration("./Secret-Key.key");
        
       Chiffrement chiffrement = new Chiffrement();
       chiffrement.runCipher("./Secret-Key.key","./mohamed.txt", "./CHIFFRER.txt");
        
       Dechiffrement dechiffrement = new Dechiffrement();
       dechiffrement.runCipher("./Secret-Key.key","./CHIFFRER.txt", "./DECHIFFRER.txt");
       
       // JFileChooser jfc = new JFileChooser();
        //jfc.showSaveDialog(jfc);
       // jfc.showOpenDialog(jfc);
    }
    
}
