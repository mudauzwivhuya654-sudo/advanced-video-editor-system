import java.util.Scanner;

public class AdvancedVideoEditing {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String storedUsername = "Admin";
        String storedPassword = "Java123";

        String username;
        String password;

        System.out.print("Enter your Username: ");
        username = scanner.nextLine();

        System.out.print("Enter your Password: ");
        password = scanner.nextLine();

        if (username.equals(storedUsername) && password.equals(storedPassword)){
            System.out.println("Login Successfull");
        }
        else {
            System.out.println("Access Denied");
        }
        System.out.println();


        String clientName;
        String videotype;
        String help;
        double budget;
        boolean isUrgent;
        boolean isStudent;

        System.out.print("Enter Your Name: ");
        clientName = scanner.nextLine();
        System.out.println();
        System.out.println("Hello " + clientName);
        System.out.print("How may I help you? ");
        help = scanner.nextLine();


        System.out.println();
        System.out.println("-----VIDEO TYPES AND BUDGET-----");
        System.out.println();
        System.out.println("1.Wedding = R3000");
        System.out.println("2.Gaming = R1500");
        System.out.println("3.Advertisement = R5000");
        System.out.println("4.Birthday = R2000");
        System.out.println();


        System.out.print("Enter Video Type: ");
        videotype = scanner.nextLine();

        System.out.print("Enter your budget: ");
        budget = scanner.nextDouble();
        

        System.out.println();


        System.out.println("Is your project urgent (true/false)? ");
        isUrgent = scanner.nextBoolean();

        System.out.println("Are you a student (true/false)? ");
        isStudent = scanner.nextBoolean();


        double finalPrice = 0;
        double urgentFee = 500;

        if (isUrgent) {
            if (isStudent) {
                System.out.println("The service fee for urgent project is R500 per day.");
                System.out.println("You will get the discount of 10%");
                System.out.println();
                finalPrice = budget + urgentFee * 0.10;
                System.out.println();
                System.out.println("Final Price: " + finalPrice);
            }
            else {
                System.out.println("The service fee for urgent project is R500 per day.");
                System.out.println();
                finalPrice = budget + urgentFee;
                System.out.println();
                System.out.println("Final Price: " + finalPrice);
            }

        }
        else {
            if (isStudent){
                System.out.println("You will get the discount of 10%");
                System.out.println();
                finalPrice = budget * 0.10;
                System.out.println();
                System.out.println("Final Price: " + finalPrice);
            }
            else {
                System.out.println("Okay you'll pay a normal price but it will take 5 days.");
            }

        }

        String status;
        if (finalPrice >= 2500){
            status = "Premium Project";
        }
        else {
            status = "Standard project";
        }

        System.out.println("============================================");
        System.out.println("        VIDEO EDITOR BUSINESS REPORT       ");
        System.out.println("============================================");
        System.out.println();
        System.out.printf("Client Name: %s", clientName);
        System.out.println();
        System.out.printf("Video Type: %s", videotype);
        System.out.println();
        System.out.printf("Urgent Project: %b", isUrgent);
        System.out.println();
        System.out.printf("Student Client: %b", isStudent);
        System.out.println();
        System.out.printf("Final Price: R%.2f", finalPrice);
        System.out.println();
        System.out.printf("Project Catecory: %s", status);



    }
}
