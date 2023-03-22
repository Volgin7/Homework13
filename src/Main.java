public class Main {
    public static void main(String[] args) {

        Author firstAuthor = new Author("Stethen", "King");
        Author secondAuthor = new Author("Leo", "Tolstoy");
        Book firstBook = new Book("The Shining", firstAuthor, 1977);
        Book secondBook = new Book("Anna Karenina", secondAuthor, 1877);

        // Author toString method
        System.out.println(firstAuthor);
        System.out.println(secondAuthor);
        System.out.println();

        // Book toString method
        System.out.println(firstBook);
        System.out.println(secondBook);
        System.out.println();

        // Author equals method
        System.out.println("Are authors " + firstAuthor + " and " + firstAuthor + " the same? " + firstAuthor.equals(firstAuthor));
        System.out.println("Are authors " + firstAuthor + " and " + secondAuthor + " the same? " + firstAuthor.equals(secondAuthor));
        System.out.println();

        // Book equals method
        System.out.println("Are Books '" + firstBook.getBookName() + "' and '" + firstBook.getBookName() + "' the same? " + firstBook.equals(firstBook));
        System.out.println("Are Books '" + firstBook.getBookName() + "' and '" + secondBook.getBookName() + "' the same? " + firstBook.equals(secondBook));
        System.out.println();

        // hashCode for Author
        System.out.println(firstAuthor + ", hash code = " + firstAuthor.hashCode());
        System.out.println(secondAuthor + ", hash code = " + secondAuthor.hashCode());
        System.out.println();

        // hashCode for Book
        System.out.println(firstBook.getBookName() + ", hash code = " + firstBook.hashCode());
        System.out.println(secondBook.getBookName() + ", hash code = " + secondBook.hashCode());
        System.out.println();

    } // end of main
} //end of Main