import java.util.Scanner;
import java.util.Arrays;
class Grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String s=sc.nextLine();
        System.out.print("Enter number of subjects:");
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        System.out.print("Enter marks of every subject\n");
        for(int i=0;i<n;i++)
        {
            System.out.print("subject "+(i+1)+":");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        System.out.println("--- "+s+" Marks Report ---");
        System.out.println("Total: "+sum);
        System.out.println("Highest mark: "+arr[n-1]);
        System.out.println("Lowest mark: "+arr[0]);
        float avg=(float)sum/n;
        System.out.println("Average: "+avg);
        System.out.print("Your performance is ");
        if(avg>=95){
        System.out.println("Outstanding");
        System.out.println("Your grade is A");
        }
        else if(avg>=90){
        System.out.println("Excellent");
        System.out.println("Your grade is S");
        }
        else if(avg>=80){
        System.out.println("Well done");
        System.out.println("Your grade is A");
        }
        else if(avg>=70){
        System.out.println(" Very Good");
        System.out.println("Your grade is B");
        }
        else if(avg>=60){
        System.out.println("Good ");
        System.out.println("Your grade is C");
        }
        else if(avg>=50){
        System.out.println("Satisfactory");
        System.out.println("Your grade is D");
        }
        else if(avg>=35){
        System.out.println("Need to improve");
        System.out.println("Your grade is E");
        }
        else
        {
            System.out.println("Fail");
            System.out.println("Your grade is F");
        }
    }
}
