/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.crypto.SecretKey;

/**
 *
 * @author Oumy Gueye
 */
public interface IKeyGeneration {
    public boolean keygeneration(String FilePath);
    public SecretKey genkey();
    public boolean savekey(String FilePath , SecretKey key);
    public SecretKey recupkey(String FilePath);
    
}
