import controllers.TheatreTicketController;
import models.Theatre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Odeon", 10);
        TheatreTicketController controller = new TheatreTicketController(theatre);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. View available seats");
            System.out.println("2. Book a ticket");
            System.out.println("3. Unbook a ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.displayAvailableSeats();
                    break;
                case 2:
                    System.out.print("Enter seat number to book: ");
                    int bookSeatNumber = scanner.nextInt();
                    if (controller.bookSeat(bookSeatNumber)) {
                        System.out.println("Seat " + bookSeatNumber + " booked successfully!");
                    } else {
                        System.out.println("Seat " + bookSeatNumber + " is already booked or invalid!");
                    }
                    break;
                case 3:
                    System.out.print("Enter seat number to unbook: ");
                    int unbookSeatNumber = scanner.nextInt();
                    if (controller.unbookSeat(unbookSeatNumber)) {
                        System.out.println("Seat " + unbookSeatNumber + " unbooked successfully!");
                    } else {
                        System.out.println("Seat " + unbookSeatNumber + " is already unbooked or invalid!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}