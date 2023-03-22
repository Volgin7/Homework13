public class Book {
    private String bookName;
    private Author bookAuthor;
    private int  publishingYear;

    public Book(String bookName, Author bookAuthor, int publishingYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book = '" + this.bookName + "' " + this.bookAuthor.getFirstName() + " " + this.bookAuthor.getFamilyName() + " " + this.publishingYear;
    }

    public boolean equals(Book other) {
        if (this.bookName.equals(other.bookName)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

}  // end of Book