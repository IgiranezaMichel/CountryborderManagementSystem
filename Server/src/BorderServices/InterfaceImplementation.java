/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BorderServices;

import BorderDao.BorderDaos;
import Tables.BorderTable;
import Tables.EmployeeExploreBorder;
import Tables.EmployeeTable;
import Tables.Feedback;
import Tables.Passengerdb;
import Tables.StoreDetailOfPassenger;
import Tables.penalities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.jpa.boot.archive.internal.ExplodedArchiveDescriptor;

public class InterfaceImplementation extends UnicastRemoteObject implements BorderServiceInterface{
  BorderDaos dao=new BorderDaos();
    public  InterfaceImplementation() throws RemoteException{
        
    }

    @Override
    public String InsertNewBorder(BorderTable bt) throws RemoteException {
       return dao.AddNewBorder(bt);
    }

    @Override
    public String RemoveBorder(BorderTable bt) throws RemoteException {
 return dao.RemoveBorder(bt);
    }

    @Override
    public String UpdateBorder(BorderTable bt) throws RemoteException {
      return dao.UpdateBorder(bt);
    }

    @Override
    public String InsertNewPassenger(Passengerdb psg) throws RemoteException {
   return dao.InsertNewPassenger(psg);
    }

    @Override
    public String AddNewEmployee(EmployeeTable psg) throws RemoteException {
        return dao.AddNewEmployees(psg);
    }

    @Override
    public String SignUpEmployee(String NationalId, String username, String Password) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BorderTable> DisplayborderTable() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EmployeeTable> DisplayEmployeeTable() throws RemoteException {
       return dao.ListOfEmployees();
    }

    @Override
    public String ChaseEmployee(String NationalId) throws RemoteException {
      return dao.ChasingEmployee(NationalId);
    }

    @Override
    public List<EmployeeTable> SearchEmployee(String Search) throws RemoteException {
     return dao.SearchEmployee(Search);
    }

    @Override
    public List<BorderTable> ViewOnBorder() throws RemoteException {
      return dao.displayBorder();
    }

    @Override
    public String UpdatePassengerProfile(Passengerdb ps) throws RemoteException {
   return dao.UpdatePassengerDetail(ps);
    }

    @Override
    public List<Passengerdb> SearchPassenger(String search) throws RemoteException {
     return dao.PassengerProfileIngList(search);
    }

    @Override
    public List<EmployeeExploreBorder> PassengerPenaliries(int Penalities) throws RemoteException {
       return dao.PassengerPenaliries(Penalities);
    }

    @Override
    public String OpeneAllborder(int open) throws RemoteException {
       return dao.CloseOrOpenAllBorder(open);
    }

    @Override
    public String ChangeEmployeeWorkLocation(String Id,String borderId)throws RemoteException {
       return dao.ChangeEmployeeWorkLocation(Id,borderId);
    }

    @Override
    public List<Feedback> DisplayFeedback() throws RemoteException {
   return dao.DisplayFeedback();
    }

    @Override
    public List<EmployeeTable> OpenOrClosedBorderVerificaction(String username, String emppasswd) throws Exception {
     return dao.CheckBorderOpenOrClosed(username,emppasswd);
    }

    @Override
    public String EmployeeLogIn(String username, String Passwd, String EntranceCode, String validation, int ActiveorDeactive, String date) throws RemoteException {
     return dao.EmployeeLogIn(username,Passwd,EntranceCode,validation,ActiveorDeactive,date);
    }

    @Override
    public String EmployeeSignUp(String nationalId, String username, String Passwd) throws RemoteException {
       return dao.EmployeeSignUp(nationalId, username, Passwd);
    }

    @Override
    public List<EmployeeExploreBorder> PassengerOnExplore(String NationalId) throws RemoteException {
       return dao.PassengerOnExplore(NationalId);
    }

    @Override
    public List<Passengerdb> PassengerLogIn(String username, String password) throws RemoteException {
       return dao.LogInPassenger(username,password);
    }

    @Override
    public List<EmployeeTable> GetEntrancecode(String EntranceCode) throws RemoteException {
   return dao.GetEntranceCode(EntranceCode);
    }

    @Override
    public String ValidateIntranceExitChanges(String Id) throws RemoteException {
   return dao.ValidateIntranceExitChanges(Id);
    }

    @Override
    public String InsertPassenger(EmployeeExploreBorder empl) throws RemoteException {
return dao.InsertPassenger(empl);
    
}

    @Override
    public String Feedback(Feedback f) throws RemoteException {
  return dao.Feedback(f);
    }

    @Override
    public String RecoverPassword(String username, String nationalId, String telephone, String newpasswd) throws RemoteException {
       return dao.RecoverPassword(username,nationalId,telephone,newpasswd);
    }

    @Override
    public void Penalitise(int pay, String nationalId) {
  dao.Penalitise(pay,nationalId); 
    }

    @Override
    public String UpdatePassengerDate(String id, String date) throws RemoteException {
      return dao.UpdatePassengerGoingDate(id,date);
    }

    @Override
    public String StorePassengerDetail(StoreDetailOfPassenger st) throws RemoteException {
  return dao.StorePassengerDetail(st);
    }

    @Override
    public String DeleteExplorePassenger(String id) throws RemoteException {
    return dao.DeleteExplorePassenger(id);
    }
}
