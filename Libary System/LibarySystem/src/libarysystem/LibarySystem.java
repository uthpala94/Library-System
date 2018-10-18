/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libarysystem;

/**
 *
 * @author Uthpala Jayawardena
 */
public class LibarySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book book1=new Book("AAAA","au01","isbn01","khtfdbn");
        Book book2=new Book("BBBB","au02","isbn02","rbvdgthy");
        Book book3=new Book("CCCC","au03","isbn03","hjkfbvc");
          
        
          SetOfBooks st =new SetOfBooks();
          
          
          st.addBook(book1);
          st.addBook(book2);
          st.addBook(book3);
          
          
          
          SetOfBooks FiAu =new SetOfBooks();
          
          FiAu=st.findBookByAuthor("au02");
          
          Book bk=new Book();
         
          System.out.println(bk);
        
        
        
    }
    
}
