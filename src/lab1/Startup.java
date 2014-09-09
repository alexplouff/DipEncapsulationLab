package lab1;

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
        
        
//        employee.hireEmployee();
//        employee2.hireEmployee();
        
        HumanResourcesStrategy hr = new HumanResources();
        
        EmployeeStrategy employee = new Employee( "Alex" , "Plouff" , "B101"  );
        EmployeeStrategy employee2 = new Employee( "Dan" , "Rogers" , "C201" ) ;
        
        
        hr.hireEmployee(employee);
        hr.hireEmployee(employee2);
    }
    
    
}
