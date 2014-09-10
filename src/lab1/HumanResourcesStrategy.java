/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Alex
 */
public interface HumanResourcesStrategy {

    void createNewEmployee(String firstName, String lastName, String cubeId);

    EmployeeStrategy getEmployee();

    void hireEmployee(EmployeeStrategy e);

    String verifyNewHire();
    
}
