package Week4;

interface Greeting{
    void sayHello();
}
class Hello implements Greeting{
    public void sayHello(){
        System.out.println("Welcome Students");
    }
}

public class traditionalappr {
    public static void main(String[] args) {
        
        Hello obj = new Hello();
        obj.sayHello();
    }
    
}
