/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.util.List;

/**
 *
 * @author Alex
 */
public interface HumanResourcesStrategy {

    public abstract void createNewEmployee(String firstName, String lastName, String cubeId);

    public abstract Employee getEmployee();

    public abstract void hireEmployee(EmployeeStrategy e);

    public abstract String verifyNewHire();
    
    
}
