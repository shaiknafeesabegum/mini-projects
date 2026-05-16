import java.util.*;

class hotel1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t===== HOTEL ROOM RESERVATION =====");
        System.out.print("\nEnter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Number of Guests: ");
        int guests = sc.nextInt();
        sc.nextLine();
        Stack<Integer> standardRoom = new Stack<>();
        Stack<Integer> deluxeRoom = new Stack<>();
        Stack<Integer> suiteRoom = new Stack<>();
        for(int i = 101; i <= 105; i++)
            standardRoom.push(i);

        for(int i = 201; i <= 205; i++)
            deluxeRoom.push(i);

        for(int i = 301; i <= 305; i++)
            suiteRoom.push(i);
        System.out.println("\nRoom Types Available");
        System.out.println("1. Standard Room  - ₹2500");
        System.out.println("2. Deluxe Room    - ₹3500");
        System.out.println("3. Suite Room     - ₹4500");

        System.out.print("\nEnter Room Type (standard/deluxe/suite): ");
        String room = sc.nextLine().toLowerCase();

        switch(room)
        {
            case "standard":
                System.out.println("\nAvailable Standard Rooms: " + standardRoom);
                break;

            case "deluxe":
                System.out.println("\nAvailable Deluxe Rooms: " + deluxeRoom);
                break;

            case "suite":
                System.out.println("\nAvailable Suite Rooms: " + suiteRoom);
                break;

            default:
                System.out.println("Invalid Room Type!");
                return;
        }
        System.out.print("\nEnter Room Number You Want: ");
        int roomNo = sc.nextInt();
        sc.nextLine();

        boolean booked = false;

        if(room.equals("standard") && standardRoom.contains(roomNo))
        {
            standardRoom.removeElement(roomNo);
            booked = true;
        }
        else if(room.equals("deluxe") && deluxeRoom.contains(roomNo))
        {
            deluxeRoom.removeElement(roomNo);
            booked = true;
        }
        else if(room.equals("suite") && suiteRoom.contains(roomNo))
        {
            suiteRoom.removeElement(roomNo);
            booked = true;
        }

        if(!booked)
        {
            System.out.println("Sorry! Room Not Available.");
            return;
        }

        System.out.println("Room Booked Successfully!");
        System.out.print("\nEnter ID Proof: ");
        String id = sc.nextLine();
        System.out.print("Confirm Booking? (yes/no): ");
        String confirm = sc.nextLine().toLowerCase();

        if(confirm.equals("no"))
        {
            if(room.equals("standard"))
                standardRoom.push(roomNo);

            else if(room.equals("deluxe"))
                deluxeRoom.push(roomNo);

            else
                suiteRoom.push(roomNo);

            System.out.println("\nBooking Cancelled Successfully!");
            return;
        }
        System.out.println("\n========= BOOKING DETAILS =========");

        System.out.println("Customer Name : " + name);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("Guests        : " + guests);
        System.out.println("Room Type     : " + room);
        System.out.println("Room Number   : " + roomNo);
        System.out.println("ID Proof      : " + id);

        System.out.print("Payment Amount: ");

        if(room.equals("standard"))
            System.out.println("₹2500");

        else if(room.equals("deluxe"))
            System.out.println("₹3500");

        else
            System.out.println("₹4500");

        System.out.println("\n===== THANK YOU FOR VISITING =====");
    }
}
