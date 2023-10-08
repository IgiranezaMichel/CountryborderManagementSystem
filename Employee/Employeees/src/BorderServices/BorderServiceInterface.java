package BorderServices;

import Tables.BorderTable;
import Tables.EmployeeExploreBorder;
import Tables.EmployeeTable;
import Tables.Passengerdb;
import Tables.StoreDetailOfPassenger;
import Tables.penalities;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BorderServiceInterface extends Remote{
     public String EmployeeSignUp(String nationalId,String username,String Passwd) throws RemoteException;
     public String EmployeeLogIn(String username,String Passwd,String EntranceCode,String validation,int ActiveorDeactive,String date) throws RemoteException;
    public List<Passengerdb>SearchPassenger(String search)throws RemoteException;
    public List<EmployeeExploreBorder>PassengerOnExplore(String NationalId) throws RemoteException;
    public String UpdatePassengerDate(String id,String date) throws RemoteException;
    
    public String StorePassengerDetail(StoreDetailOfPassenger st)throws RemoteException;
    public String DeleteExplorePassenger(String id)throws RemoteException;
    public List<EmployeeTable>OpenOrClosedBorderVerificaction(String username,String emppasswd) throws Exception;
}
