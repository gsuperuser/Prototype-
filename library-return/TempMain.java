import java.util.*;
public class TempMain {
    public static void main(String[] args) {
        int fine , bookId;
        int dueDate, returnDate;
        boolean state = true;
        char choice;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("process bk? (y/n)");
            choice = sc.next().charAt(0);
            if (choice == 'y'){System.out.println("Enter book id: ");
                bookId = sc.nextInt();
                System.out.println("Enter due date (yyyy-mm-dd): ");
                dueDate = sc.nextInt();
                System.out.println("Enter return date (yyyy-mm-dd): ");
                returnDate = sc.nextInt();
                if (returnDate > dueDate)
                {   System.out.println("Book is overdue.");
                    fine = 5 * (returnDate - dueDate);
                System.out.println("Book ID: " + bookId + ", Fine: " + fine);}
                else
                {   System.out.println("Book is returned on time.");
                    fine = 0;}}
                
                
            else{state = false;}
                
        }while (state);
    }
}