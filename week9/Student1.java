package week9;

import java.util.Scanner;

public class Student1 {
   Scanner firstname = new Scanner(System.in);
   Scanner lastname = new Scanner(System.in);

    public String toString(){
        String name = firstname.nextLine();
        String surname = lastname.nextLine();
        return "My first name "+name+" last name " +surname;
    }    public static void main(String[] args) {
        System.out.println("enter your name and lastname");
        Student1 p = new Student1();
        System.out.println(p.toString());
    }
}
