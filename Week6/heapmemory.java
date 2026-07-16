package Week6;

class Employee2{
        int id = 101;
    }

public class heapmemory {

    public static void main(String[] args) {

        Employee2 emp = new Employee2();
        System.out.println(emp.id);

        
    }
    
}


// this is heap memory stores object
// it is slower and gc removed the unused data