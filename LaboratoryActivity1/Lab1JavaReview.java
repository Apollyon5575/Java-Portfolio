import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int books = 5;
        String[] book = new String[books];    
        String[] status = new String[books]; 
        int bookCount = 0;                    
        int choice;
        
        do {
            System.out.println("Welcome to the library what would you like to do?");
            System.out.println("1. Add Books.");
            System.out.println("2. Update Book Status.");
            System.out.println("3. Show All Books");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            if(choice == 1){
                System.out.println("What is the title of the book that you want to add?");
                if (bookCount < books) {
                    System.out.print("Enter book title:   ");
                    book[bookCount] = sc.nextLine();
                    status[bookCount] = "Available";
                    bookCount++;
                    System.out.println("===Book added===");
                } else {
                    System.out.println("No space for more books.");
                }
            }
            else if(choice == 2){
                if(bookCount == 0){
                    System.out.println("There are no books to update.");
                }
                else {
                    System.out.println("What book would you like to update?");
                    for (int i = 0; i < bookCount; i++) {
                    System.out.println((i + 1) + ". " + book[i] + " - " + status[i]);
                    }
                    int num = sc.nextInt();
                    sc.nextLine();
                    if (num > 0 && num <= bookCount) {
                        int i = num - 1;
                        if (status[i].equals("Available")) {
                            status[i] = "Borrowed";
                        } else {
                            status[i] = "Available";
                        }
                        System.out.println("Book status updated successfully.");
                    } else {
                        System.out.println("Invalid book number.");
                    }
                }
            }
            else if(choice == 3){
                if (bookCount == 0) {   
                    System.out.println("There are currently no books in the library.");
                } else {
                    for (int i = 0; i < bookCount; i++) {   
                        System.out.println((i + 1) + ". " + book[i] + " - " + status[i]);    
                    }
                }
            }
            else if (choice == 4) {
                System.out.println("Goodbye!");
            } 
            else {
                System.out.println("Invalid choice.");
            }
            System.out.println();
            
        } while (choice != 4);
        
        sc.close();
    }
}
