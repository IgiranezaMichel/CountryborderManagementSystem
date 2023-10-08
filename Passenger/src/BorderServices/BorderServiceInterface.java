package BorderServices;

import Tables.BorderTable;
import Tables.EmployeeExploreBorder;
import Tables.EmployeeTable;
import Tables.Feedback;
import Tables.Passengerdb;
import Tables.penalities;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BorderServiceInterface extends Remote{

   public void InsertNewBorder(BorderTable bt) throws RemoteException;
    public void RemoveBorder(BorderTable bt) throws RemoteException;
     public String UpdateBorder(BorderTable bt) throws RemoteException;
    public String  InsertNewPassenger(Passengerdb psg) throws RemoteException;
      public void  AddNewEmployee(EmployeeTable psg) throws RemoteException;
      public String SignUpEmployee(String NationalId,String username,String Password) throws RemoteException;
       public List<BorderTable> DisplayborderTable() throws RemoteException;
       public List<EmployeeTable>DisplayEmployeeTable() throws RemoteException;
     public String ChaseEmployee(String NationalId) throws RemoteException;
     public List<EmployeeTable> SearchEmployee(String Search) throws RemoteException;
     
     public  String OpenOrCloseBorder(String BorderId,int openorclose)throws RemoteException;
     public List<BorderTable> ViewOnBorder()throws RemoteException;
     public  String UpdatePassengerProfile(Passengerdb ps)throws RemoteException;
     
     public List<Passengerdb>SearchPassenger(String search)throws RemoteException;
      public List<penalities>PassengerPenaliries()throws RemoteException;
      public String RecoverPassword(String username,String nationalId,String telephone,String newpasswd) throws RemoteException;
      
      public List<Passengerdb> PassengerLogIn(String username,String password) throws  RemoteException;
      public List<EmployeeTable>GetEntrancecode(String EntranceCode) throws  RemoteException;
      public String InsertPassenger(EmployeeExploreBorder empl) throws  RemoteException;
       public List<EmployeeExploreBorder>PassengerOnExplore(String NationalId) throws RemoteException;
      public String ValidateIntranceExitChanges(String Id) throws RemoteException;
      public String Feedback(Feedback f)throws RemoteException;
public void Penalitise(int pay, String nationalId) throws RemoteException;
}
