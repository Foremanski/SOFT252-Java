/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileFunctions;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

import java.util.ArrayList;
/**
 *
 * @author dforeman
 */

public class AddAccount {
    
    
    //create array list for writing
    //public ArrayList<Classes.SystemUser> WriteArray = new ArrayList<Classes.SystemUser>();
    //create new file reader
    public FileFunctions.ReadFile fileReader = new FileFunctions.ReadFile();
    
    
    
    //get the array 
    public void AddAccount(Classes.SystemUser newAccount)
    {                     
        try{
                FileWriter writeFile = new FileWriter("UserInformation.txt", true);
                
                //copy info to new array
                //WriteArray = fileReader.getUserArray();                
                //System.out.println(fileReader.getUserArray());
                
                //add the account to the list
                //WriteArray.add(newAccount);
                
                UpdateFile(writeFile, newAccount);
            }   
        catch(Exception e){
          System.out.println("file not found");
        }       
    }
    public void UpdateFile(FileWriter outputToFile, Classes.SystemUser accountOutput)
    {
        
        BufferedWriter bufferedWriter = new BufferedWriter(outputToFile);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        
       //for(int i = 0; i < WriteArray.size(); i++)
       //{
           //System.out.println(WriteArray.get(i).getUserId());
           //System.out.println(WriteArray.size());       
           printWriter.println(accountOutput.getUserId());
           printWriter.println(accountOutput.getUserPassword());
           printWriter.println(accountOutput.getUserName());
           printWriter.println(accountOutput.getUserAddress());
           
           
           printWriter.flush();
          // fileReader.scanFile.hasNext();          
       //}
       
 
       
    }
}
