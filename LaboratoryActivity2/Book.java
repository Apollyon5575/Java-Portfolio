class Book {
    String title;
    String author;
    int publishDate;
    int currentPage;
    
    public Book(String title, String author, int publishDate) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.currentPage = 0;
    }
    
    public void details() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Current Page: " + currentPage);
        System.out.println(); 
    }
    
    public void changePage(int page) {
        this.currentPage = page;
    }
    
    public int getPublishDate() {
        return publishDate;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void changeAuthor(String author){
        this.author = author;
    }
}