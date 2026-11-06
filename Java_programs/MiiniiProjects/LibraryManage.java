class Library {
    String[] availableBooks = new String[100];
    String[] issuedBooks = new String[100];

    int availableBooks_count = 0;
    int issuedBooks_count = 0;

    public void addBooks(String book){
        availableBooks[availableBooks_count] = book;
        availableBooks_count++;
        System.out.println(book + " Book is added.");
    }


    public void issueBooks(String book){
        for (int i = 0; i < availableBooks_count; i++) {
            if (availableBooks[i].equalsIgnoreCase(book)) {
                issuedBooks[issuedBooks_count] = book;
                issuedBooks_count++;

                // Remove book from available books
                for (int j = i; j < availableBooks_count - 1; j++) {
                    availableBooks[j] = availableBooks[j + 1];
                }

                availableBooks_count--;
                System.out.println(book + " issued successfully.");
                return;
            }
        }

        System.out.println(book + " is not available.");
    }    


    public void returnBook(String book){
        for (int i = 0; i < issuedBooks_count; i++){
            if (issuedBooks[i].equalsIgnoreCase(book)){
                 availableBooks[availableBooks_count] = book;
                availableBooks_count++;
            }

            // Remove book from issued books
            for (int j = i; j < issuedBooks_count - 1; j++) {
                    issuedBooks[j] = issuedBooks[j + 1];
                }

            issuedBooks_count--;
            System.out.println(book + " returned successfully.");
            return;
            }

        System.out.println("This book was not issued.");
    }

    
    public void showAvailableBooks(){
        for (int i = 0; i < availableBooks_count; i++){
            System.out.println(availableBooks[i]);
        }
    }

}


public class LibraryManage {
    public static void main(String[] args) {

        Library lb = new Library();

        lb.addBooks("Python Programming");
        lb.addBooks("C Programming");
        lb.addBooks("Java Programming");
        lb.addBooks("C++ Programming");

        lb.issueBooks("Java Programming");
        lb.issueBooks("C Programming");
        lb.issueBooks("Money");

        lb.returnBook("Java Programming");
         
        lb.showAvailableBooks();
    }
}
