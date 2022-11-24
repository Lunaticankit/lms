package model;

public class Student {
    String name;
    int classs;
    int booksborrowed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClasss() {
        return classs;
    }

    public void setClasss(int classs) {
        this.classs = classs;
    }

    public int getBooksborrowed() {
        return booksborrowed;
    }

    public void setBooksborrowed(int booksborrowed) {
        this.booksborrowed = booksborrowed;
    }

    public Student(String name, int classs, int booksborrowed) {
        this.name = name;
        this.classs = classs;
        this.booksborrowed = booksborrowed;
    }
    public void printfomat(){
        System.out.println("The student is Prayush Shrestha of class 11 and has 10 books borrowed");
    }
}
