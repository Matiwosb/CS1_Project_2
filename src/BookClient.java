import java.util.Objects;

public class BookClient {
    public static void main(String[] args) {
        Book book1 = new Book("Starting out with JAVA: From Control Structures through Objects",
                "Tony Gaddis", "Pearson","15947");
        book1.displayCarInfo();
    }
}
