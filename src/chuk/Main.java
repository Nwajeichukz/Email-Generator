package chuk;

public class Main {
    public static void main(String[] args) {
        Email em1 = new EmailDetails("john", "smith");

        System.out.println(em1);
        System.out.println(em1.displayUserInfo());
        System.out.println("Password: " +  em1.generatePassword());

    }
}