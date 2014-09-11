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
public class MockEmployeeDatabase {
    
    ArrayList <Employee> employeeList = new ArrayList <Employee> ();
    
    public void addEmployeeToList( Employee employee ){
        
        employeeList.add( employee );
        
    }
    
    public ArrayList <Employee> getList(){
        return employeeList;
    }
    
    
    
    
    
}
