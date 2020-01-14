/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileFunctions;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
/**
 *
 * @author dforeman
 */
public class DeleteAccount {
    
    
    public void ReadTempFile(Classes.SystemUser entryToRemove)
    {
       try{               
                File tempFile = new File("tempUserInfo.txt");
         
                PrintWriter writeFile = new PrintWriter(tempFile);
                
                
                RemoveFile(writeFile, entryToRemove);
            }   
        catch(Exception e){
          System.out.println("file not found");
        }       
    }
    
    public void RemoveFile(PrintWriter writeFile, Classes.SystemUser entryToRemove)
    {
        File inputFile = new File("UserInformation.txt");
        
        //Classes.SystemUser entryToRemove = new Classes.SystemUser();
        FileFunctions.ReadFile array = new FileFunctions.ReadFile();
        array.OpenFile();
        array.ScanFile();
        array.CloseFile();
        
        
        for(int i = 0; i < array.getUserArray().size(); i++)
        {
            //if the current entry matches the entry to remove, remove from list
            if(array.getUserArray().get(i) == entryToRemove)
            {
                array.getUserArray().remove(i);
            }
            //otherwise write the current entry to new temp folder
            else
            {
                writeFile.println(array.getUserArray().get(i).getUserId());
                writeFile.println(array.getUserArray().get(i).getUserPassword());
                writeFile.println(array.getUserArray().get(i).getUserName());
                writeFile.println(array.getUserArray().get(i).getUserAddress());
            }
        }       
    }
}
