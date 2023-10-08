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

   public String InsertNewBorder(BorderTable bt) throws RemoteException;
    public String RemoveBorder (BorderTable bt) throws RemoteException;
     public String UpdateBorder(BorderTable bt) throws RemoteException;
    public void  InsertNewPassenger(Passengerdb psg) throws RemoteException;
      public String  AddNewEmployee(EmployeeTable psg) throws RemoteException;
      public String SignUpEmployee(String NationalId,String username,String Password) throws RemoteException;
       public List<BorderTable> DisplayborderTable() throws RemoteException;
       public List<EmployeeTable>DisplayEmployeeTable() throws RemoteException;
     public String ChaseEmployee(String NationalId) throws RemoteException;
     public List<EmployeeTable> SearchEmployee(String Search) throws RemoteException;
     public List<BorderTable> ViewOnBorder()throws RemoteException;
     public  String UpdatePassengerProfile(Passengerdb ps)throws RemoteException;
     
     public List<Passengerdb>SearchPassenger(String search)throws RemoteException;
      public List<EmployeeExploreBorder>PassengerPenaliries(int Penalities)throws RemoteException;
      public String OpeneAllborder(int open) throws RemoteException;
     // UpdateBorderOnOpenClose
     public String ChangeEmployeeWorkLocation(String Id,String borderId)throws RemoteException;
     public  List<Feedback>DisplayFeedback()throws RemoteException;
}
