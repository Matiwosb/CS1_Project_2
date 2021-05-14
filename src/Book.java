public class Book {
    private String title;
    private String author;
    private String publisher;
    private String copiesSold;

    public Book(String title, String author, String publisher, String copiesSold){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copiesSold = copiesSold;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(String copiesSold) {
        this.copiesSold = copiesSold;
    }
    public void displayCarInfo(){
        System.out.println("Book Information: ");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Copies sold: " + copiesSold);
    }
}
