/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Classes;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author dforeman
 */
public class ReadFile {
    
    private Scanner scanFile;
    
    public soft252.Classes.SystemUser[] userArray = new soft252.Classes.SystemUser[2];
    
    public void OpenFile()
    {
        File file = new File("UserInformation.txt");
        
        try{
            scanFile = new Scanner(file);
        }
        catch(Exception e){
                  System.out.println("could not find file");
          }
        
        ReadFile();
    }
    
    public void ReadFile()
    {
        
        int i = 0;
        
        while(scanFile.hasNext())
        {
            
            
            String userID = scanFile.nextLine();
            String userPassword = scanFile.nextLine();
            String userName = scanFile.nextLine();
            String userAddress = scanFile.nextLine();
            
            soft252.Classes.SystemUser userArrayInput = new soft252.Classes.SystemUser(userID, userPassword,userName, userAddress);
            
            userArray[i] = userArrayInput;          
            
            i++;
            //debug print
            //System.out.println(userID);
            //System.out.println(userPassword);
            //System.out.println(userName);
            //System.out.println(userAddress);
                    
        }
        closeFile();
    }
    
    public void closeFile()
    {
        scanFile.close();
    }
}
