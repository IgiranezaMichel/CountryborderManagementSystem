/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class EmployeeExploreBorder implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Number;
    @ManyToOne
    @JoinColumn(name = "PassengerNationalId")
    private Passengerdb PassengerId;
    private String Reason;
    private String Destination;
    private String GoingDateandTime;
    private  int Punishment;
    private  int EntranceOrExit;

    public int getEntranceOrExit() {
        return EntranceOrExit;
    }

    public void setEntranceOrExit(int EntranceOrExit) {
        this.EntranceOrExit = EntranceOrExit;
    }
    public int getPunishment() {
        return Punishment;
    }

    public void setPunishment(int Punishment) {
        this.Punishment = Punishment;
    }
    @ManyToOne
     @JoinColumn(name = "EmployeeOnServiceId")
    private EmployeeTable EmployeeOnServiceId;
    @ManyToOne
     @JoinColumn(name = "BorderLocationId")
    private BorderTable BorderLocationId;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public Passengerdb getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(Passengerdb PassengerId) {
        this.PassengerId = PassengerId;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getGoingDateandTime() {
        return GoingDateandTime;
    }

    public void setGoingDateandTime(String GoingDateandTime) {
        this.GoingDateandTime = GoingDateandTime;
    }
  public EmployeeTable getEmployeeOnServiceId() {
        return EmployeeOnServiceId;
    }

    public void setEmployeeOnServiceId(EmployeeTable EmployeeOnServiceId) {
        this.EmployeeOnServiceId = EmployeeOnServiceId;
    }

    public BorderTable getBorderLocationId() {
        return BorderLocationId;
    }

    public void setBorderLocationId(BorderTable BorderLocationId) {
        this.BorderLocationId = BorderLocationId;
    }
}
