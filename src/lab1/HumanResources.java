/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class HumanResources {
    
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;  
    private String cubeId;
    
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if(metWithHr) {
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    private String getStatus() {
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }  
    
    Employee employee = null;
    MockEmployeeDatabase db = new MockEmployeeDatabase ();
    
    
    public void createNewEmployee( String firstName , String lastName , 
                                        String cubeId ){
        this.employee = new Employee( firstName , lastName , cubeId );

        db.addEmployeeToList(employee);
        
    }    
    
    public ArrayList<Employee> getEmployeeList(){
        return db.getList();
    }
    
    public Employee getEmployee(){
        return employee;
    }      
    
   // @Override
    public void hireEmployee( Employee e ){    
        
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle( cubeId );
        getStatus();
        
    }
   
   // @Override
    public String verifyNewHire(){
        
        return employee.getFirstName() + " " + employee.getLastName() + 
                " was successfully hired!" + 
                "\n CubeId: " + employee.getCubeId();
        
    }
    
    
    
    
}
