public class Author {
    private String firstName;
    private String familyName;

    public Author(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String toString() {
        return "Name = " + this.firstName + " " + this.familyName;
    }


    public boolean equals(Author other) {
        if (this.firstName.equals(other.firstName) && this.familyName.equals(other.familyName)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName + familyName);
    }
} // end of Author