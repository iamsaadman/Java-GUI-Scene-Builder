package Exam;


class Author{
    private String name;
    private int age;

    public Author(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
            this.age =age;
}

}
class Book{
    private String name;
    private Author author;

    public  Book(String name, Author author){
        this.name = name;
        this.author = author;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Author getAuthor(){
        return author;
    }
    public void setAge(Author author){
        this.author =author;
    }

}
class Publisher{
    private String name;
    private Book[] books;
    public Publisher(String name,Book[] books){
        this.name = name;
        this.books = books;
    }
    public int countBooks(String authorName){
        int count =0;
        for(Book books: books){
            if(books.getAuthor().getName()==(authorName))
                count++;
        }
        return count;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Book[] getBooks(){
        return books;
    }
    public void setBooks(Book[] books){
        this.books = books;
    }

}
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Saadman",36);

        Book book1 = new Book("book1",author);
        Book book2= new Book("book2",author);
        Book book3 = new Book("book3",author);
        Book[] books = {book1, book2, book3};
        Publisher publisher = new Publisher("Publisher A", books);

        // Count the books by an author
        String authorName = "Saadman" ;
        int bookCount = publisher.countBooks(authorName);
        System.out.println("Number of books published by " + authorName + ": " + bookCount);
    }
}
