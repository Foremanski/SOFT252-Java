/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileFunctions;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author dforeman
 */

public class AddAccount {
    
    private Scanner writeFile;
    
    public ArrayList<Classes.SystemUser> WriteArray = new ArrayList<Classes.SystemUser>();
    public FileFunctions.ReadFile fileReader = new FileFunctions.ReadFile();
    public Classes.SystemUser newAccount = new Classes.SystemUser();
    
    //get the array 
    public void AddAccount()
    {     
        WriteArray = fileReader.getUserArray();
        WriteArray.add(newAccount);
        
        UpdateFile();
    }
    public void UpdateFile()
    {
       while(fileReader.userArray.size())
       {
           
       }
       
    }
}
