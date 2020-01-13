/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;



/**
 *
 * @author dforeman
 */
public class SOFT252 {

    public static void main (String[] args) {
        // TODO code application logic here
       soft252.Classes.ReadFile fileReader = new soft252.Classes.ReadFile();
        
       fileReader.OpenFile();
       fileReader.ReadFile();
        
       Login newLogin = new Login();
        
       newLogin.show();
    }

  
}


