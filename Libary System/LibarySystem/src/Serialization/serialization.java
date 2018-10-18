/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import libarysystem.Book;
import libarysystem.Member;
import libarysystem.SetOfBooks;
import libarysystem.SetOfMembers;
/**
 *
 * @author Uthpala Jayawardena
 */
public class serialization {
    
     public static void serializeMember(SetOfMembers members) throws IOException {

        FileOutputStream fileOut = new FileOutputStream("Member.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(members);
        out.flush();
        out.close();
        fileOut.close();
        
        System.out.println("Serialized data is saved in to Member.ser");
    }

     
     
     
    public static SetOfMembers desirializeMember() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(new File("Member.ser"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        SetOfMembers members = (SetOfMembers) ois.readObject();
        ois.close();
        return members;
    }
    
    
    
    
    
     public static void serializeBook(SetOfBooks books) throws IOException {

        FileOutputStream fileOut = new FileOutputStream("Books.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(books);
        out.flush();
        out.close();
        fileOut.close();
        System.out.println("Serialized data is saved in to Books.ser");
    }

     
     
     
     
    public static SetOfBooks desirializeBook() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(new File("Books.ser"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        SetOfBooks Books = (SetOfBooks) ois.readObject();
        ois.close();
        return Books;
    }

    
    
    
    
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Member mem = new Member("Thilina", "Matara", "20-12-1993");
        Member mem1 = new Member("Uthpala", "colombo", "11-12-1994");
        Member mem2 = new Member("Malki", "Colombo", "12-1-1995");
        Member mem3 = new Member("Tinura", "galle", "12-12-1993");
        Member mem4 = new Member("Naduni", "Nugegoda", "12-12-1993");
        
        SetOfMembers stMem = new SetOfMembers();
        
        stMem.addMember(mem);
        stMem.addMember(mem1);
        stMem.addMember(mem2);
        stMem.addMember(mem3);
        stMem.addMember(mem4);

        
        
        
        try {
            serializeMember(stMem);
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        Book bk = new Book("Maths","AAA","ISBN01","catalogue1");
        Book bk1 = new Book("English","BBB","ISBN02","catalogue1");
        Book bk2 = new Book("Science","CCC","ISBN03","catalogue2");
        Book bk3 = new Book("SE","DDD","ISBN04","catalogue4");
        Book bk4 = new Book("DB","EEE","ISBN05","catalogue3");

        
        
        SetOfBooks stBook = new SetOfBooks();
        
        stBook.addBook(bk);
        stBook.addBook(bk1);
        stBook.addBook(bk2);
        stBook.addBook(bk3);
        stBook.addBook(bk4);

        
        
        try {
            serializeBook(stBook);
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
         

    }
    
    
    
}
