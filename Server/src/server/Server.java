package server;
import BorderServices.InterfaceImplementation;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eng Michael
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registry rmi;
        try {
            rmi = LocateRegistry.createRegistry(5000);
             InterfaceImplementation ee=new InterfaceImplementation();
        rmi.bind("AddNewEmployee", ee);
        rmi.bind("insertborder", ee);
        rmi.bind("deleteBorder", ee);
        rmi.bind("updateSingleborder", ee);
        rmi.bind("viewborderInformation", ee);
        rmi.bind("updateOpenCloseborder", ee);
        rmi.bind("OpenAllborder", ee);
        rmi.bind("SearchPassenger", ee);
        rmi.bind("DisplayAllEmployee", ee);
        rmi.bind("ShiftEmployeeOnotherborder", ee);
        rmi.bind("SearchEmployee", ee);
        rmi.bind("PassengerPenarities", ee);
        rmi.bind("Feedback", ee);
        rmi.bind("borderCloseOpenOperation", ee);
        rmi.bind("EmployeeSignUp", ee);
        rmi.bind("EmployeeLogIn", ee);
        rmi.bind("PassengerLogIn", ee);
        rmi.bind("GetEmployeeDetailtoPassenger", ee);
        rmi.bind("SearchExploreBorder", ee);
        rmi.bind("UpdatePassengerEntranceOrExit", ee);
        rmi.bind("InsertNewPassenger", ee);
        rmi.bind("Feedbacks", ee);
        rmi.bind("RecoverPasswd", ee);
        rmi.bind("Addpenality", ee);
        rmi.bind("InsertPassenger", ee);
        rmi.bind("UpdateGoingDate", ee);
        rmi.bind("StoredetailOfPassenger", ee);
        rmi.bind("DeletePassengerWhoExploreCountry", ee);
        rmi.bind("ChaseEmployee", ee);
        rmi.bind("UpdatePassenger", ee);
         System.out.println("Server is running At port 5000");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}