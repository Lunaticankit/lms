package model;

public class Borrowing {
    int bookid;
    int studentid;
    int bookprice;
    int extradays;
    int fine;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getBookprice() {
        return bookprice;
    }

    public void setBookprice(int bookprice) {
        this.bookprice = bookprice;
    }

    public int getExtradays() {
        return extradays;
    }

    public void setExtradays(int extradays) {
        this.extradays = extradays;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public Borrowing(int bookid, int studentid, int bookprice, int extradays, int fine) {
        this.bookid = bookid;
        this.studentid = studentid;
        this.bookprice = bookprice;
        this.extradays = extradays;
        this.fine = fine;
    }
    public void printformat(){
        double total=this.bookprice+fine;
        System.out.println(total);
        System.out.println("The total fine for bookId "+"\t"+this.bookid+"\t"+this.extradays+"\t"+this.fine);

    }
}