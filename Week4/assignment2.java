package Week4;

interface Alert{
    void sendMessage();
}

public class assignment2 {
    public static void main(String[] args) {
        Alert emg = () -> System.out.println("Notification Sent Successfully");
        emg.sendMessage();
    }
    
}
