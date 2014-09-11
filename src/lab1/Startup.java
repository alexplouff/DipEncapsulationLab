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
        
       // System.out.println( hr.verifyNewHire() );
        
        hr.createNewEmployee( "Alex" , "Plouff" , "B101" );
        
       // System.out.println( hr.verifyNewHire() );
        
        hr.createNewEmployee( "Josh" , "Conley" , "B102" );
        
       // System.out.println( hr.verifyNewHire() );
        
        System.out.println(hr.getEmployeeList());
        
      //  System.out.println( hr.getEmployeeList() );

        
    
    
    }
    
    
}
