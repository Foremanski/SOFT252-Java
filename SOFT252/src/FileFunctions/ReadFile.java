/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileFunctions;

import java.io.File;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author dforeman
 */
public class ReadFile {
    
    public Scanner scanFile;
    public int TotalUsers = 0;
    
    // public Classes.SystemUser[] userArray = new Classes.SystemUser[1];
    public ArrayList<Classes.SystemUser> userArray = new ArrayList<Classes.SystemUser>();
            
    
    public void OpenFile()
    {
        File file = new File("UserInformation.txt");
        
        try{
            scanFile = new Scanner(file);
        }
        catch(Exception e){
                  System.out.println("could not find file");
          }
        
    }
    
    public void ScanFile()
    {      
        int i = 0;
        
        while(scanFile.hasNext())
        {
            //get users and input them into variables
            String userID = scanFile.nextLine();
            String userPassword = scanFile.nextLine();
            String userName = scanFile.nextLine();
            String userAddress = scanFile.nextLine();
            
            
            
            //create new object with variables
            Classes.SystemUser userArrayInput = new Classes.SystemUser(userID, userPassword,userName, userAddress);
            
            //checks if user is patient
            if(userID.contains("P"))
            {
                String userAge = scanFile.nextLine();
                String userGender = scanFile.nextLine();
                Classes.Patient patientArrayInput = new Classes.Patient(userArrayInput, userAge, userGender);
                userArray.add(patientArrayInput);
            }
            
            //if not, upload the default 
            else 
            {
                  //adds the user to the list
                  userArray.add(userArrayInput);
            }
            
            
            i++;
            //debug print
            //System.out.println(userID);
            //System.out.println(userPassword);
            //System.out.println(userName);
            //System.out.println(userAddress);
                    
        }
    }
    
    public void CloseFile()
    {
        scanFile.close();
    }
    
    public ArrayList<Classes.SystemUser> getUserArray()
    {
        return this.userArray;
    }
}
