package model;

public class Books {
   String name;
   String author;
   int ISBN;
   int publishedyear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublishedyear() {
        return publishedyear;
    }

    public void setPublishedyear(int publishedyear) {
        this.publishedyear = publishedyear;
    }

    public Books(String name, String author, int ISBN, int publishedyear) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.publishedyear = publishedyear;
    }
    public void printformat() {
        System.out.println("name: " + this.name);
        System.out.println("author:" + this.author);
        System.out.println("ISBN:" + this.ISBN);
        System.out.println("publishedyear:" + this.publishedyear);


    }
}