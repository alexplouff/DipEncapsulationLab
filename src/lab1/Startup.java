package lab1;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

//import java.util.List;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        

        
        HumanResources hr = new HumanResources();
        
        hr.createNewEmployee( "Dan"  , "Rogers" , "C306" );
        hr.createNewEmployee( "Alex" , "Plouff" , "B101" );
        hr.createNewEmployee( "Josh" , "Conley" , "B102" );
        
        System.out.println( hr.getEmployeeList() );
        
        
        
//        employeeList.add( hr.getEmployee() );
    //        
//        EmployeeStrategy alex = new Employee( "Alex" , "Plouff" , "B101"  );
//        EmployeeStrategy dan = new Employee( "Dan" , "Rogers" , "C201" ) ;
//        
//        hr.hireEmployee( alex, "B101" );
//        
//        hr.hireEmployee( dan, "C202" );
//        
//        List myEmployeeList = new ArrayList();
//        
//        myEmployeeList.add( alex );
//        myEmployeeList.add( dan );
//        
//        System.out.println( myEmployeeList );
    
    
    }
    
    
}
