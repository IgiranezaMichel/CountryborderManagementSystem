/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeserver;

import Services.ImplementInterface;
import java.rmi.AccessException;
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
public class EmployeeServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Registry rmi=LocateRegistry.createRegistry(1010);
            ImplementInterface im=new ImplementInterface();
            rmi.bind("insertandupdateEmployee", im);
        } catch (RemoteException ex) {
            Logger.getLogger(EmployeeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(EmployeeServer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
