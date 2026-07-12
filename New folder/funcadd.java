public class funcadd {
    int a = 10;
    int b = 20;

    void sum(){
        int c ;
        c = a + b;
        System.out.println(c);
    }

    int apple_count = 5, apple_price = 20;

    void garden(){
        System.out.println(apple_count*apple_price);
    }

    void addition(int a, int b){
        int c;
        c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    void subtraction(int a, int b){
        int c;
        c = a - b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    void product(int a, int b){
        int c;
        c = a * b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    void division(int a, int b){
        int c;
        c = a / b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    int remainder(int a, int b){
        int remainder = a % b;
        return remainder;
    }

    String getname(){

        String name = "prawin";

        return name;
    }

    public static void main(String[] args) {
        funcadd num = new funcadd();  // function 
        num.sum();
        num.garden();
        num.addition(5, 5);
        num.subtraction(5, 5);
        num.product(5, 5);
        num.division(5, 5);
        int remaind = num.remainder(123, 23);
        System.out.println(remaind);

        String myname = num.getname();
        System.out.println(myname);
    }

}
