/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
@Entity
public class Passengerdb implements Serializable {
 @Id
 private String PassengerId;
 @Column(nullable = false)
 private String PassengerNames;
  @Column(nullable = false,length = 10)
 private String PassengerGender;
   @Column(nullable = false,length = 60)
 private String PassengerCountryOfBirth;
    @Column(nullable = false,length = 4)
 private String TelephoneCountryCode;
     @Column(nullable = false,length = 11)
 private String TelephoneNumber;
      @Column(nullable = false)
 private String PassengeruserName;
       @Column(nullable = false)
 private String Password;
 @Column(nullable = false,columnDefinition = "mediumblob")
 private byte[] ProfilePicture;
 @OneToMany(mappedBy = "PassengerId")
  private Set<EmployeeExploreBorder> PassengerExploration;
 
 @OneToMany(mappedBy = "PassengetNationalIdentity")
  private Set<penalities> Passengerpenalities;

    public Set<EmployeeExploreBorder> getPassengerExploration() {
        return PassengerExploration;
    }

    public void setPassengerExploration(Set<EmployeeExploreBorder> PassengerExploration) {
        this.PassengerExploration = PassengerExploration;
    }

    public Set<penalities> getPassengerpenalities() {
        return Passengerpenalities;
    }

    public void setPassengerpenalities(Set<penalities> Passengerpenalities) {
        this.Passengerpenalities = Passengerpenalities;
    }
    public String getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(String PassengerId) {
        this.PassengerId = PassengerId;
    }

    public String getPassengerNames() {
        return PassengerNames;
    }

    public void setPassengerNames(String PassengerNames) {
        this.PassengerNames = PassengerNames;
    }

    public String getPassengerGender() {
        return PassengerGender;
    }

    public void setPassengerGender(String PassengerGender) {
        this.PassengerGender = PassengerGender;
    }

    public String getPassengerCountryOfBirth() {
        return PassengerCountryOfBirth;
    }

    public void setPassengerCountryOfBirth(String PassengerCountryOfBirth) {
        this.PassengerCountryOfBirth = PassengerCountryOfBirth;
    }

    public String getTelephoneCountryCode() {
        return TelephoneCountryCode;
    }

    public void setTelephoneCountryCode(String TelephoneCountryCode) {
        this.TelephoneCountryCode = TelephoneCountryCode;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }

    public String getPassengeruserName() {
        return PassengeruserName;
    }

    public void setPassengeruserName(String PassengeruserName) {
        this.PassengeruserName = PassengeruserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public byte[] getProfilePicture() {
        return ProfilePicture;
    }

    public void setProfilePicture(byte[] ProfilePicture) {
        this.ProfilePicture = ProfilePicture;
    }
 
}
