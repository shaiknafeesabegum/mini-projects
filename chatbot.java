import java.util.*;
import java.util.Scanner;
import java.time.LocalDateTime;
class chatbot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello! my name is CHATBOT");
        System.out.println("What is your name!");
        String str=sc.nextLine();
        System.out.println("How can I help you");
        while(true)
        {
            String s=sc.nextLine();
            s=s.toLowerCase();
            LocalDateTime now=LocalDateTime.now();
            if(s.equals("hello")||s.equals("hi")||s.equals("greetings"))
            System.out.println("hi how can I help you?");
            else if(s.equals("what's the time now")||s.equals("what is the time now")||s.equals("time"))
            System.out.println("The time is "+now);
            else if(s.equals("what is OOPS")||s.equals("what is oops"))
            System.out.println("OOPS means object oriented programming");
            else if(s.equals("what is java language")||s.equals("what is mean by java")||s.equals("what is java"))
            System.out.println("Java is a high level object oriented language");
            else if(s.equals("thankyou")||s.equals("thank you"))
            System.out.println("You're welcome...");
            else{
            System.out.println("Sorry I've Trained on little things only...");
            System.out.println("You can try these Queries");
            System.out.println("Greetings");
            System.out.println("Time");
            System.out.println("OOP'S Concept");
            System.out.println("What is java");
            }
        }
    }
}