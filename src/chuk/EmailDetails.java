package chuk;

import java.security.SecureRandom;
import java.util.Scanner;

public class EmailDetails extends Email{
//    public String email;


    public EmailDetails(String firstName, String lastName) {
        super(firstName, lastName);
//        this.email = getFirstName() + "." + getLastName() + "@" + departMent() + "." + "company.com";

    }

    public String toString() {
        return "The Code of " +  getFirstName() + " are: " +
                "\n1. SALES" +
                "\n2. DEVELOPMENT" +
                "\n3. ACCOUNTING" +
                 "\nENTER OPTION: " ;
    }

    public String departMent() {

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if(userInput == 1) return "sales";
        if(userInput == 2) return "dev";
        if (userInput == 3) return "acct";

        return "";
    }


    public String generatePassword () {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 10; i++) {
            int randomIndex = random.nextInt(passwordSet.length());
            sb.append(passwordSet.charAt(randomIndex));
        }

        return sb.toString();

    }

    public String getEmail() {
        return getFirstName() + "." + getLastName() + "@" + departMent() + "." + "company.com";
    }

    public String displayUserInfo () {
        return "Names: " + getFirstName() + " " + getLastName() +
                "\nEmail: " + getEmail() +
                "\nMail Capacity: " + getMailboxCapacity() + "MB";
    }

}
