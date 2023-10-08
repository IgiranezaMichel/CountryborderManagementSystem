package Tables;

import java.io.Serializable;
import javax.persistence.*;
@Entity
public class penalities implements Serializable{
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
  private int number;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "PassengerNationalIdentity",insertable = true,unique = true)
  private Passengerdb PassengetNationalIdentity;
   private  int penalityAndDelay;
  private String GoingDate;
  private String Penalities;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Passengerdb getPassengetNationalIdentity() {
        return PassengetNationalIdentity;
    }

    public void setPassengetNationalIdentity(Passengerdb PassengetNationalIdentity) {
        this.PassengetNationalIdentity = PassengetNationalIdentity;
    }

    public int getPenalityAndDelay() {
        return penalityAndDelay;
    }

    public void setPenalityAndDelay(int penalityAndDelay) {
        this.penalityAndDelay = penalityAndDelay;
    }

    public String getGoingDate() {
        return GoingDate;
    }

    public void setGoingDate(String GoingDate) {
        this.GoingDate = GoingDate;
    }

    public String getPenalities() {
        return Penalities;
    }

    public void setPenalities(String Penalities) {
        this.Penalities = Penalities;
    }
}
