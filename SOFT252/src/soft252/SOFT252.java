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

/**
 *
 * @author dforeman
 */
public class SOFT252 {

    public static void main (String[] args) {
        // TODO code application logic here
        ReadFile();
        
        Login newLogin = new Login();
        
        newLogin.show();
    }
    
    private static void ReadFile()
    {
        File file = new File("C:\\Users\\dforeman\\Documents\\GitHub\\SOFT252-Java\\SOFT252\\UserInformation.txt");
        //String Directory = System.getProperty("C:\\Users\\dforeman\\Documents\\GitHub\\SOFT252-Java");
        //String fileName = "UserInformation.txt";

        FileReader readFile = new FileReader(file);
            
        int i;
        while((i = readFile.read()) != -1)
        {
            System.out.print((char) i);
        }

        
                                    
    }

  
}


