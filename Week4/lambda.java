package Week4;

interface Greeting1{
    void sayHello();
}

public class lambda {
    public static void main(String[] args) {

        Greeting1 obj = () -> System.out.println("Welcome all");
        obj.sayHello();
        
    }
    
}
