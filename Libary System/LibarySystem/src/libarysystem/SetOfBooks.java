/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libarysystem;
import libarysystem.Book;
import java.util.Vector;
/**
 *
 * @author Uthpala Jayawardena
 */
public class SetOfBooks  extends Vector<Book> 
  {
    
    public SetOfBooks()
  {
    super();
  }

    
  public void addBook(Book book)
  {
    super.add(book);
  }
  
  
  public void removeBook(Book book )
  {
      super.remove(book);
  }
  
  
 
  
  ///////////////////////////////////////////////////
    public SetOfBooks findBookFromTitle(String Title)
  {
      SetOfBooks STBooks=new SetOfBooks();
      int totalElements=this.size();
      Book book;
      for(int index=0;index<totalElements;index++)
      {
          
          book=this.get(index);
          if(book.getTitle().equals(Title))
          {
              STBooks.add(book);
          }
          
      }
      return STBooks;
  }
    
    ////////////////////////////////////////////
  public SetOfBooks findBookByAuthor(String Author)
  {
      SetOfBooks STBooks=new SetOfBooks();
      int totalElements=this.size();
      Book book;
      for(int index=0;index<totalElements;index++)
      {
          
          book=this.get(index);
          if(book.getAuthor().equals(Author))
          {
              STBooks.add(book);
          }
          
      }
      return STBooks;
  }
  

  /////////////////////////////////////////////////////////
  public SetOfBooks findBookFromAccNo(int accNo)
  {
      SetOfBooks STBooks=new SetOfBooks();
      int totalElements=this.size();
      Book book;
      for(int index=0;index<totalElements;index++)
      {
          
          book=this.get(index);
          if(book.getsetAccessionNumber() ==  accNo)
          {
              STBooks.addBook(book);
          }
          
      }
      return STBooks;
  }
  ////////////////////////////////////////////////////////
   public SetOfBooks findBookFromISBN(String ISBN)
  {
      
      SetOfBooks STBooks=new SetOfBooks();
      int totalElements=this.size();
      Book book=new Book();
      for(int index=0;index<totalElements;index++)
      {
          
          book=this.get(index);
          if(book.getISBN().equals(ISBN))
          {
              STBooks.add(book);
          }
          
      }
      return STBooks;
  }
   
   
   public void deleteBook(Book book)
   {      
     this.remove(book);
       
       
   }
    
    
    
    
    
    

    }
