package Week3;

import java.util.HashSet;

public class CollegeEventRegistration {
    public static void main(String[] args) {

        HashSet<String> participants = new HashSet<>();

        participants.add("Prawin");
        participants.add("Ragu");
        participants.add("Ashwin");
        participants.add("Prawin"); 
        participants.add("Anu");

        System.out.println("Registered Students");
        for (String student : participants) {
            System.out.println(student);
        }

        System.out.println();

        if (participants.contains("Prawin")) {
            System.out.println("Prawin is Registered for the Event.");
        } else {
            System.out.println("Prawin is Not Registered.");
        }

        System.out.println();

        participants.remove("Ashwin");
        System.out.println("Ashwin's registration removed successfully.");

        System.out.println("Updated Participant List");
        for (String student : participants) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Total Participants: " + participants.size());
    }
}