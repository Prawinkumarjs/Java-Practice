package Week6;

public class immutable {
    public static void main(String[] args) {
        String name = "java";
        name.concat(" kumar");
        System.out.println(name);
    }
    
}

// we have not received the o/p with kumar 
// bcoz string is immutable and new object