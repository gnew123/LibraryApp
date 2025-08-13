	package trash;
	
	import java.time.LocalDate;
	
	public class Book {
	
		String bookName;
		String addedBy;
		boolean isIssued = false ;
		LocalDate issueDate = null;
		String issuedBy = null ;
		
		
		@Override
		public String toString() {
			return "Book [bookName=" + bookName + ", addedBy=" + addedBy + ", isIssued=" + isIssued + ", issueDate="
					+ issueDate + ", issuedBy=" + issuedBy + "]";
		}
		public Book(String bookName, String addedBy) {
			super();
			this.bookName = bookName;
			this.addedBy = addedBy;
			
		}
		
	}
