import javax.swing.*;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateName;

    //Constructor to receive the  firstname and lastname
    public Email(String firstName , String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created : "+ this.firstName + " "+ this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department : "+ this.department);

        //Call a method that will return the random password
    }

    //Ask for the department
    private String setDepartment()
    {
        System.out.println("Department Code\n1 for Sales\n2 for Development\n3 for Accounting\n0 for blank\nEnter the Department ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1)
            return "sales";
        else if (depChoice == 2)
            return "dev";
        else if (depChoice == 3)
            return "acct";
        else
            return "";
    }
    //Generate the random password
    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        char[] password = new char[length];
        for(int i =0;i<length;i++)
        {
            int rand = (int) (Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return password;
    }

    //Set the alternate mail

    //Change the password
}
