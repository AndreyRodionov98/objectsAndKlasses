public class Book {
    private String titleOfTheBook;
    private Author author;
    int publisherYear;


    public Book(String titleOfTheBook,Author author, int publisherYear ) {
       this.titleOfTheBook = titleOfTheBook;
        this.publisherYear=publisherYear;
        this.author=author;
    }
    public Author getAuthor(){
        return author;
    }
    public  String getTitleOfTheBook() {
        return titleOfTheBook;
    }
    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }




    }


