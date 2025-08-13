package trash;

import java.time.LocalDate;

public class deletedFiles {
    public String bookName;
    public String deletedBy;
    public LocalDate deletionDate;

    // Constructor
    public deletedFiles(String bookName, String deletedBy, LocalDate deletionDate) {
        this.bookName = bookName;
        this.deletedBy = deletedBy;
        this.deletionDate = deletionDate;
    }

    // toString method to display deleted book information
    @Override
    public String toString() {
        return "deletedFiles [bookName=" + bookName + ", deletedBy=" + deletedBy + ", deletionDate=" + deletionDate + "]";
    }
}
