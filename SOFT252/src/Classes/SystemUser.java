/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author dforeman
 */
public class SystemUser {
    
    String userID;
    String userName;
    String userPassword;
    String userAddress;
       
    //constuctors
    //used for login
    public SystemUser()
    {
        
    }
    
    public SystemUser(String password, String id)
    {
       userID = id;
       userPassword = password;     
    }
    
    //used for the user details
    public SystemUser(String id,String password, String name, String address)
    {
        userID = id;
        userPassword = password;
        userName = name;
        userAddress = address;            
    }
    
    //getters and setters
    //get and set ID
    public String getUserId()
    {
        return this.userID;
    }
    private void setUserId(String id)
    {
        this.userID = id;
    }
    
    //get and set name
    public String getUserName()
    {
        return this.userName;
    }
    private void setUserName(String name)
    {
        this.userName = name;
    }
    
    //get and set address
    public String getUserAddress()
    {
        return this.userAddress;
    }
    private void setUserAddress(String address)
    {
        this.userAddress = address;
    }
    
    //get and set password
    public String getUserPassword()
    {
        return this.userPassword;
    }
    private void setUserPassword(String password)
    {
        this.userPassword = password;
    }
    
}
