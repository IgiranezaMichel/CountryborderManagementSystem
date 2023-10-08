/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BorderDao;

import Tables.BorderTable;
import Tables.EmployeeExploreBorder;
import Tables.EmployeeTable;
import Tables.Feedback;
import Tables.Passengerdb;
import Tables.StoreDetailOfPassenger;
import java.util.List;
import org.hibernate.*;
public class BorderDaos {
    //Add New Employee 
public  String  AddNewEmployees(EmployeeTable e)
{
    try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=ss.beginTransaction();
        ss.save(e);
        tx.commit();
        ss.close();
    }catch(Exception ex){
        return  ex+"";
    }
    return "New Employee Is Added Sucessfully";
}
//Add new Border
public String AddNewBorder(BorderTable bt){
    try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=ss.beginTransaction();
        ss.save(bt);
        tx.commit();
        ss.close();
    }catch(Exception ex){
        return  ex+"";
    }
    return "New Border Added Sucessfully";
}
//Remove Border
public  String RemoveBorder(BorderTable bt)
{try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=ss.beginTransaction();
        ss.delete(bt);
        tx.commit();
        ss.close();
    }catch(Exception ex){
        return  ex+"";
    }
    return "Border Remove";
}
//update Borders
public  String UpdateBorder(BorderTable bt)
{
    try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=ss.beginTransaction();
        ss.update(bt);
        tx.commit();
        ss.close();
    }catch(Exception ex){
        return  ex+"";
    }
    return "Border Update Sucessfully";
}
public List<BorderTable>displayBorder(){
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=ss.beginTransaction();
        Query q=ss.createQuery("from BorderTable");
        List<BorderTable>list=q.list();
     return list;
}
//close or open all border
public  String CloseOrOpenAllBorder(int open)
{String result="All Borders Are now Opened";
    try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=ss.beginTransaction();
         Query q=ss.createQuery("update BorderTable set OpenClosed=:i");
         q.setParameter("i", open);
         q.executeUpdate();
         tx.commit();
         ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
    if(open==1)
        return result;
    return "All Borders Are now Closed";
}
//search all Passenger
public List<Passengerdb> PassengerProfileIngList(String search)
{
     Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=ss.beginTransaction();
         Query q=ss.createQuery("from  Passengerdb where PassengerId=:i or PassengerNames=:i or TelephoneNumber=:i");
         q.setParameter("i",search);
     List<Passengerdb>ps=q.list();
     return ps;
}
//update passengeer
public  String UpdatePassengerDetail(Passengerdb p)
{
    try{Session ss=HibernateUtil.getSessionFactory().openSession();
 Transaction tx=ss.beginTransaction();
 ss.save(p);
 ss.close();
    }
    catch(Exception e){
        return e+"";
    }
    return "Passenger Information Is now Updated Sucessfully";
}
//Display All List of Employees
public List<EmployeeTable> ListOfEmployees()
{
     Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=ss.beginTransaction();
         Query q=ss.createQuery("from EmployeeTable");
     List<EmployeeTable>ps=q.list();
     return ps;
}
//change Employee border Location
public  String ChangeEmployeeWorkLocation(String Id,String borderId)
{ try{Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("update EmployeeTable set EmployeeBorderId=:b where EmployeeNationalIdentity=:p");
            q.setParameter("b", borderId);
            q.setParameter("p", Id);
            int res=q.executeUpdate();
            tx.commit();
            ss.close();          
  }catch(Exception e)
  {
      return e+"";
  }
  return "Employee Shifted Sucessfully";
}

public  String ChasingEmployee(String NationalId)
{
 try{   Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tx=ss.beginTransaction();
  Query q=ss.createQuery("delete from EmployeeTable where EmployeeNationalIdentity=:i");
  q.setParameter("i",NationalId);
   int res=q.executeUpdate();
            tx.commit();
            ss.close();
            if(res>0)
                return "Employee Chased Successfully";
 }catch(Exception e)
 {
     return e+"";
 }
 return "Wrong National Id try with right NAtional Id";
}
//Searching Employee
public List<EmployeeTable> SearchEmployee(String Search){
    Session ss=HibernateUtil.getSessionFactory().openSession();
 
  Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("from EmployeeTable where EmployeeBorderId=:b or EmployeeNationalIdentity=:b or EmpNativeCountry=:b or EmployeeNames=:b or  TelephoneNumber=:b");
            q.setParameter("b", Search);
           List<EmployeeTable>lp=q.list();
           return lp;
}
 public List<EmployeeExploreBorder> PassengerPenaliries(int Penalities){
      Session ss=HibernateUtil.getSessionFactory().openSession(); 
  Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("from EmployeeExploreBorder where Punishment=:p");
    q.setParameter("p", Penalities);
           List<EmployeeExploreBorder>lp=q.list();
           return lp;
 }
 //display Feedback
 public List<Feedback>DisplayFeedback(){
      Session ss=HibernateUtil.getSessionFactory().openSession();
 
  Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("from Feedback");
           List<Feedback>lp=q.list();
           return lp;
 }
 public  List<EmployeeTable>CheckBorderOpenOrClosed(String username,String emppasswd)
 {
      Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("from EmployeeTable");
           List<EmployeeTable>lp=q.list();
           return lp;
 }
 public  String EmployeeLogIn(String username, String Passwd, String EntranceCode, String validation, int ActiveorDeactive, String date)
 {if(username.equals("border")||Passwd.equals("border"))
 {
    return "Wrong username or Password";
 }
 else{
     try{Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tx=ss.beginTransaction();
  Query q=ss.createQuery("update EmployeeTable set DateAtWork=:dw, EntranceValidationCode=:ec,PresenceValidation=:pv,ActiveOrDeactive=:ad where EmployeeuserName=:un and EmployeePasswd=:p");
  q.setParameter("ec",EntranceCode);
  q.setParameter("pv",validation);
  q.setParameter("ad",ActiveorDeactive);
  q.setParameter("un",username);
    q.setParameter("p",Passwd);
     q.setParameter("dw",date);
   int n= q.executeUpdate();
    tx.commit();
    ss.close();
    if(n>0)
    {
        return "LogIn Sucessfull";
    }
 }
 catch(Exception e)
 {
     return e+"";
 }
 }
 return "Credential doen't match";
 }
 public String EmployeeSignUp(String nationalId, String username, String Passwd)
 {
    Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tx=ss.beginTransaction();
  Query q=ss.createQuery("update EmployeeTable set EmployeeuserName=:u, EmployeePasswd=:p where EmployeeNationalIdentity=:n");
  q.setParameter("u",username);
  q.setParameter("p",Passwd);
  q.setParameter("n",nationalId);
   int n= q.executeUpdate();
    tx.commit();
    ss.close();
    if(n>0)
    {
        return "Account created Sucessfully";
    }
return "Wrong Username or passwd";
 }
  public List<EmployeeExploreBorder> PassengerOnExplore(String NationalId)
  {
       Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tx=ss.beginTransaction();
  Query q=ss.createQuery("from EmployeeExploreBorder where PassengerNationalId=:n");
  q.setParameter("n",NationalId);
   List<EmployeeExploreBorder>v=q.list();
   return v;
  }
//    public static void main(String[] args) {
//        BorderDaos bd=new BorderDaos();
//       bd.PassengerOnExplore("8945 6894 5689 5624");
//        System.out.println();
//    }
    public List<Passengerdb> LogInPassenger(String username, String password) {
    Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tx=ss.beginTransaction();
  Query q=ss.createQuery("from Passengerdb where PassengeruserName=:n and Password=:p");
  q.setParameter("n",username);
  q.setParameter("p",password);
   List<Passengerdb>validate=q.list();
   return validate;
    }

    public List<EmployeeTable> GetEntranceCode(String EntranceCode) {
    Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tx=ss.beginTransaction();
  Query q=ss.createQuery("from EmployeeTable where EntranceValidationCode=:e");
  q.setParameter("e",EntranceCode);
   List<EmployeeTable>validate=q.list();
   return validate;
    }

    public String ValidateIntranceExitChanges(String Id) {
        Session ss=HibernateUtil.getSessionFactory().openSession();
  try{Transaction tx=ss.beginTransaction();
  Query q=ss.createQuery("update EmployeeExploreBorder set EntranceOrExit=:e where PassengerNationalId=:i");
        q.setParameter("e", 0);
        q.setParameter("i", Id);
        q.executeUpdate();
        tx.commit();
        ss.close();
  }catch(Exception e)
  {
      return e+"";
  }
  return "Done";
    }

    public String InsertPassenger(EmployeeExploreBorder empl) {
      try{Session ss=HibernateUtil.getSessionFactory().openSession();
 Transaction tx=ss.beginTransaction();
 ss.save(empl);
 tx.commit();
 ss.close();
    }
    catch(Exception e){
        return e+"";
    }
    return "Now You Are Able to explore Coury By Passing on Border Employee";
    }

    public String InsertNewPassenger(Passengerdb psg) {
     try{Session ss=HibernateUtil.getSessionFactory().openSession();
 Transaction tx=ss.beginTransaction();
 ss.save(psg);
 tx.commit();
 ss.close();
    }
    catch(Exception e){
        return e+"";
    }
    return "Insert Sucessfully";
    }

    public String Feedback(Feedback f) {
       try{Session ss=HibernateUtil.getSessionFactory().openSession();
 Transaction tx=ss.beginTransaction();
 ss.save(f);
 tx.commit();
 ss.close();
    }
    catch(Exception e){
        return e+"";
    }
    return "Feedback Sent Sucessfully";
    }

    public String RecoverPassword(String username, String nationalId, String telephone, String newpasswd) {
   //(changepusername.getText(), changepOldpass.getText(), "none", changepOldpNewp.getText())
        try{ 
            int n;
            Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tx=ss.beginTransaction();
  if(telephone.equals("none")){
     Query q=ss.createQuery("update Passengerdb set Password=:p where PassengeruserName=:n and Password=:t"); 
   q.setParameter("p",newpasswd);
  q.setParameter("t",nationalId);
   q.setParameter("n",username);
    n=q.executeUpdate();
  }
  else{
  Query q=ss.createQuery("update Passengerdb set Password=:p where PassengeruserName=:n and  PassengerId=:i and TelephoneNumber=:t");
  q.setParameter("n",username);
  q.setParameter("i",nationalId);
 q.setParameter("t",telephone);
  q.setParameter("p",newpasswd);
   n=q.executeUpdate();
  }
 tx.commit();
 ss.close();
    }
    catch(Exception e)
    {
        return e+"";
    }
    return "Password Changed Successfully";
    }

    public void Penalitise(int pay, String nationalId) {
Session ss=HibernateUtil.getSessionFactory().openSession(); 
  Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("update EmployeeExploreBorder set Punishment=:t where PassengerNationalId=:p");
    q.setParameter("p", nationalId);
    q.setParameter("t", pay);
    q.executeUpdate();
    tx.commit();
    ss.close();
    }

    public String UpdatePassengerGoingDate(String id, String date) {
   try{ Session ss=HibernateUtil.getSessionFactory().openSession(); 
  Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("update EmployeeExploreBorder set GoingDateandTime=:t where PassengerNationalId=:p");
    q.setParameter("p",id);
    q.setParameter("t", date);
    q.executeUpdate();
    tx.commit();
    ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
   return "Done";
}

    public String StorePassengerDetail(StoreDetailOfPassenger st) {
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
           Transaction tx=ss.beginTransaction();
           ss.save(st);
           tx.commit();
        } catch (Exception e) {
            return e+"";
        }
  return "Done";
    }

    public String DeleteExplorePassenger(String id) {
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
  Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("Delete from EmployeeExploreBorder where PassengerNationalId=:i");        
    q.setParameter("i",id);
    q.executeUpdate();
    tx.commit();
    ss.close();
        } catch (Exception e) {
            return e+"";
        }
        return "Done";
    }
}
