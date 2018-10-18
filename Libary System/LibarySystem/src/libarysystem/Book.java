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
public class Book implements java.io.Serializable 
    {
  private String title;
  private int accessionNumber;
  private String author;
  private String ISBN;
  private String catalogue;
  private Member borrower;
  private boolean isLoan;
  private String loanDate;
  private String acceptDate;
 
  
  
  
   public Book()
  {
      
    this.title="";
    this.author="";
    this.ISBN="";
    this.catalogue="";
    this.borrower=null;
    this.isLoan=false;
    this.loanDate="";
    
    
  }
   

   private static int bookCount=0;

   
  public Book(String title,String author,String ISBN,String catalogue)
  {
      
    this.title=title;
    this.accessionNumber=bookCount++;
    this.author=author;
    this.ISBN=ISBN;
    this.catalogue=catalogue;
    this.borrower=null;
    this.isLoan=false;
    
  }
  
  ////////////////////////////////////////////////////////////
  
 public void setTitle(String title)
    {
       this.title=title; 
        
    }
    
    public  String getTitle()
    {
        return this.title;
    }
    
    
     public void setLoanDate(String date)
    {
       this.loanDate=date; 
        
    }
    
    public String getLoanDate()
    {
        return this.loanDate;
    }
    
    
     public void setAcceptDate(String date)
    {
       this.acceptDate=date; 
        
    }
    
    public String getAcceptDate()
    {
        return this.acceptDate;
    }
    
    
    public void setAccessionNumber(int accessionNumber)
    {
        this.accessionNumber=accessionNumber;
    }
    
    public int getsetAccessionNumber()
    {
        return this.accessionNumber;
    }
    
    public void setAuthor(String author)
    {
        this.author=author;
    }
    
    public String getAuthor()
    {
        return this.author;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN=ISBN;
    }
    
    public String getISBN()
    {
        return this.ISBN;
    }
    
    public void setCatalogue(String catalogue)
    {
        this.catalogue=catalogue;
    }
    
    public String getCatalogue()
    {
        return this.catalogue;
    }
    public void setBorrower(Member theBorrower) 
    {
       this.borrower=theBorrower;
    }

    public Member getBorrower() 
    {
       return this.borrower;
    }
    
    public boolean isOnLoan()
    {
        return this.isLoan;
    }
    
    public void setLoan(boolean isLoan )
    {
        this.isLoan=isLoan;
    }
    
    
    
    
    
    public String toString()
    {
        return "Acc Number = "+this.accessionNumber+" | Title = "+this.title+" |  Author = "+this.author+" | ISBN = "+this.ISBN+" | Catalogue = "+this.catalogue+"\n";
    }
    
    
}
