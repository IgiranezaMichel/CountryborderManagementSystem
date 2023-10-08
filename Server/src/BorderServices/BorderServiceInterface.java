package BorderServices;

import Tables.BorderTable;
import Tables.EmployeeExploreBorder;
import Tables.EmployeeTable;
import Tables.Feedback;
import Tables.Passengerdb;
import Tables.StoreDetailOfPassenger;
import Tables.penalities;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BorderServiceInterface extends Remote{

   public String InsertNewBorder(BorderTable bt) throws RemoteException;
    public String RemoveBorder(BorderTable bt) throws RemoteException;
     public String UpdateBorder(BorderTable bt) throws RemoteException;
    public String  InsertNewPassenger(Passengerdb psg) throws RemoteException;
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
      public String ChangeEmployeeWorkLocation(String Id,String borderId)throws RemoteException;
       public  List<Feedback>DisplayFeedback()throws RemoteException;
       //verify Whether Border Is closed or opened
        public List<EmployeeTable>OpenOrClosedBorderVerificaction(String username,String emppasswd) throws Exception;
        public String EmployeeLogIn(String username,String Passwd,String EntranceCode,String validation,int ActiveorDeactive,String date) throws RemoteException;
 public String EmployeeSignUp(String nationalId,String username,String Passwd) throws RemoteException;
  public List<EmployeeExploreBorder>PassengerOnExplore(String NationalId) throws RemoteException;
  List<Passengerdb> PassengerLogIn(String username,String password) throws  RemoteException;
   public List<EmployeeTable>GetEntrancecode(String EntranceCode) throws  RemoteException;
    public String ValidateIntranceExitChanges(String Id) throws RemoteException;
     public String InsertPassenger(EmployeeExploreBorder empl) throws  RemoteException;
      public String Feedback(Feedback f)throws RemoteException;
       public String RecoverPassword(String username,String nationalId,String telephone,String newpasswd) throws RemoteException;
        public void Penalitise(int pay, String nationalId) throws RemoteException;
         public String UpdatePassengerDate(String id,String date) throws RemoteException;
         public String StorePassengerDetail(StoreDetailOfPassenger st)throws RemoteException;
         public String DeleteExplorePassenger(String id)throws RemoteException;
}
