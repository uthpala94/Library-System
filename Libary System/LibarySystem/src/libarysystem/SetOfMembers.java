/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libarysystem;
import libarysystem.Member;
import java.util.Vector;

/**
 *
 * @author Uthpala Jayawardena
 */
public class SetOfMembers  extends Vector<Member> 
    {
     public SetOfMembers()
     {
       super();
     }
     
     
     public void addMember(Member aMember) 
  {
    super.add(aMember);
  }
     
     
  public void removeMember(Member member )
  {
      super.remove(member);
  }
  
  
  
  
     public SetOfMembers getMemberFromNo(int number)
  {
      SetOfMembers stMem=new SetOfMembers();
      int totalElements=this.size();
      Member member=new Member();
      
      for(int index=0;index<totalElements;index++)
      {
          
          member=this.get(index);
          
          if(member.getMemberNumber()== number)
          {
             stMem.addMember(member); 
          }
          
      }
      return stMem;
  }
     
      public void deleteMem(Member mem)
   {
            this.remove(mem);     
   }
  
  public SetOfMembers getMemberFromName(String name)
  {
      SetOfMembers stMem=new SetOfMembers();
      int totalElements=this.size();
      Member member=new Member();
      
      for(int index=0;index<totalElements;index++)
      {
          
          member=this.get(index);
          
          if(member.getName().equals(name))
          {
              stMem.addMember(member); 
          }
          
      }
      return stMem;
  }
  
     
     
     
    }
