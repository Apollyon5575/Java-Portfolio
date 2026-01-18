public class MyBookList {
    public static void main(String[] args) {
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Java Programming", "John Doe", 2020);
        Book book5 = new Book("Hunger Games: Catching Fire", "Suzanne Collins", 2009);
        
        book1.details();
        book2.details();
        book3.details();
        book4.details();
        book5.details();
        
        book1.changePage(50);
        book3.changePage(100);
        book5.changePage(27);
        
        book4.changeAuthor("Jane Smith");
        
        System.out.println("After changing pages: ");
        book1.details();
        book3.details();
        book4.details();
        
        System.out.println("After Changing Author: ");
        book4.details();
        
        Book[] books = {book1, book2, book3, book4, book5};
        System.out.println("Books published after 2010: ");
        for (Book book : books) {  
            if (book.getPublishDate() > 2010) {
                System.out.println(book.getTitle());
            }
        }
    }
}
