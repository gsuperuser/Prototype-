import java.util.Scanner;
public class BookRecord{
    int bookId;
    Date dueDate, returnDate;
    int fine;
}
public class Main
{   Scanner sc = new Scanner(System.in);
    public void takeInput(BookRecord record)
    {
        S
    }


    public static void main(String[] args)
    {   char choice;
        int totalFine = 0;
        String overduebks = "";
        int totalcount = 0;
        while (true):{System.out.println("Do you want to enter a new book record? (y/n)");
            if choice == ignoreCase('y'):
                BookRecord record = new BookRecord();
            
                takeInput(record);
                totalFine += record.fine;
                overduebks += " Book ID: " + record.bookId ;
                totalcount++;
                
            else:
                break;}
            
    }
}
