package Week6;

class employee1{
    int id = 101;
}

public class garbage_Collection {
    public static void main(String[] args) {
        
        employee1 emp = new employee1();
        emp = null;
        System.gc();
        System.out.println("Employee  Object Eligible for Garbage Collection");
    }
    
}

// this is garbage collection used to remove the unused memory in the program
// so that the program will run optimal 
// memory released where there is no variable reference in the program

//  can we force gc to action?
// ans: no