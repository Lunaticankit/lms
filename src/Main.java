import model.Books;
import model.Borrowing;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Books books1=new Books("Da Vinci Code","Dan Brown",1234455,2015);
        Student student1=new Student("prayushshrestha",11,10);
        Borrowing borrowing1=new Borrowing(1,200,100,10,10);
        Borrowing borrowing2=new Borrowing(1,201,100,3,120);
       books1.printformat();
       student1.printfomat();
       borrowing2.printformat();
    }
}
