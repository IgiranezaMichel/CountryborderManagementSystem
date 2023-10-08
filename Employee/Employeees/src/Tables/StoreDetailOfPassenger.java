package Tables;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class StoreDetailOfPassenger implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Number;
     private String PassengerId;
    private String Reason;
    private String Destination;
    private String GoingandreturningDateandTime;
    private String EmployeeOnServiceId;
     private String BorderLocationId;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(String PassengerId) {
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

    public String getGoingandreturningDateandTime() {
        return GoingandreturningDateandTime;
    }

    public void setGoingandreturningDateandTime(String GoingandreturningDateandTime) {
        this.GoingandreturningDateandTime = GoingandreturningDateandTime;
    }

    public String getEmployeeOnServiceId() {
        return EmployeeOnServiceId;
    }

    public void setEmployeeOnServiceId(String EmployeeOnServiceId) {
        this.EmployeeOnServiceId = EmployeeOnServiceId;
    }

    public String getBorderLocationId() {
        return BorderLocationId;
    }

    public void setBorderLocationId(String BorderLocationId) {
        this.BorderLocationId = BorderLocationId;
    }

}
