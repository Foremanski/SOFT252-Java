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
public class Patient extends SystemUser {
    
    String userGender;
    String userAge;
    SystemUser userDetails;
    
    
    //constuctors
    public Patient(SystemUser user, String age, String gender)
    {       
        userDetails = user;
        userAge = age;
        userGender = gender;
        
    }
    
    //getters and setters;
    //get and set UserDetails
    public SystemUser getUser()
    {
        return this.userDetails;
    }
    private void setUser(SystemUser user)
    {
        this.userDetails = user;
    }
    
    //get and set Gender
    public String getGender()
    {
       return this.userGender;
    }
    private void SetGender(String gender)
    {
        this.userGender = gender;
    }
    
    //get and set Age
    public String getAge()
    {
        return this.userAge;
    }
    private void setAge(String age)
    {
        this.userAge = age;
    }
}
