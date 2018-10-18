/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libarysystem;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Uthpala Jayawardena
 */
public class Member implements java.io.Serializable{
     
    private int memberNumber;
    private String name;
    private String address;
    private String dateOfBirth;
    private SetOfBooks currentLoans;

    

      public Member() {
          
        this.name = "";
        this.memberNumber = 0;
        this.currentLoans = new SetOfBooks();
        this.address = "";
        this.dateOfBirth = "";

    }
      
      private static int memberCount = 0;
      
      
    public Member(String name, String address, String DateOfBirth) {
        
        this.name = name;
        this.address = address;
        this.dateOfBirth = DateOfBirth;
        this.currentLoans = new SetOfBooks();

        this.memberNumber = ++memberCount;

    }
    
    
    
    public boolean borrowBook(Book book) {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        Date date = new Date();
        
        String Date = dateFormat.format(date);
        
        if (this.currentLoans.size() < 3) {
            currentLoans.addBook(book);
            book.setBorrower(this);
            book.setLoan(true);
            book.setLoanDate(Date);
            return true;
        } else {

            return false;
        }

    }
    

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public int getMemberNumber() {
        return this.memberNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SetOfBooks getCurrentLoans() {
        return this.currentLoans;
    }

    public void setCurrentLoans(SetOfBooks currentLoans) {
        this.currentLoans = currentLoans;
    }

    public String getAddress() {
        return this.address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    
    
   
    

    public void returnBook(Book book) {
        currentLoans.removeBook(book);
    }
    
    

   public String toString() {
        return "Member No = " + this.memberNumber + " | Name = " + name + " | Address = " + address + " |  Data of Birth = " + this.dateOfBirth + "\n";
    }
    
    
    
}
