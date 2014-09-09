/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.util.Date;

/**
 *
 * @author Alex
 */
public interface EmployeeStrategy {

    public abstract Date getBirthDate();

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getSsn();

    public abstract void setBirthDate(Date birthDate);

    public abstract void setFirstName(String firstName);

    public abstract void setLastName(String lastName);

    public abstract void setSsn(String ssn);
    
    //ask about this
    public abstract void setCubeId( String cubeId );
    
    public abstract String getCubeId();
    
}
