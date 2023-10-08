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
public class EmployeeTable implements Serializable{
    @Id
    @Column(insertable = true,nullable = false,unique = true,length = 19)
    private String EmployeeNationalIdentity;
    @Column(nullable = false)
    private String EmployeeNames;
   @Column(nullable = false)
    private String EmpNativeCountry;
    @Column(nullable = false)
    private String EmpTelephoneCountryCode;
    @Column(nullable = false)
    private String TelephoneNumber;
    @ManyToOne
   @JoinColumn(name = "EmployeeBorderId",nullable = false)
    private BorderTable EmpBorderId;
   @OneToMany(mappedBy = "EmployeeOnServiceId")
    private Set<EmployeeExploreBorder>PassengerExploreBorder;
    private String EmployeeGender;
    private String EmployeeuserName;
    private String EmployeePasswd;   
    private int ActiveOrDeactive;
    private String DateAtWork;
    private String PresenceValidation;
    public Set<EmployeeExploreBorder> getPassengerExploreBorder() {
        return PassengerExploreBorder;
    }

    public void setPassengerExploreBorder(Set<EmployeeExploreBorder> PassengerExploreBorder) {
        this.PassengerExploreBorder = PassengerExploreBorder;
    }
    private String EntranceValidationCode;
    
    
    public String getEntranceValidationCode() {
        return EntranceValidationCode;
    }

    public void setEntranceValidationCode(String EntranceValidationCode) {
        this.EntranceValidationCode = EntranceValidationCode;
    }

    public int getActiveOrDeactive() {
        return ActiveOrDeactive;
    }

    public void setActiveOrDeactive(int ActiveOrDeactive) {
        this.ActiveOrDeactive = ActiveOrDeactive;
    }

    public String getDateAtWork() {
        return DateAtWork;
    }

    public void setDateAtWork(String DateAtWork) {
        this.DateAtWork = DateAtWork;
    }

    public String getPresenceValidation() {
        return PresenceValidation;
    }

    public void setPresenceValidation(String PresenceValidation) {
        this.PresenceValidation = PresenceValidation;
    }

    public BorderTable getEmpBorderId() {
        return EmpBorderId;
    }

    public void setEmpBorderId(BorderTable EmpBorderId) {
        this.EmpBorderId = EmpBorderId;
    }

    public String getEmployeeNationalIdentity() {
        return EmployeeNationalIdentity;
    }

    public void setEmployeeNationalIdentity(String EmployeeNationalIdentity) {
        this.EmployeeNationalIdentity = EmployeeNationalIdentity;
    }

    public String getEmployeeNames() {
        return EmployeeNames;
    }

    public void setEmployeeNames(String EmployeeNames) {
        this.EmployeeNames = EmployeeNames;
    }

    public String getEmpNativeCountry() {
        return EmpNativeCountry;
    }

    public void setEmpNativeCountry(String EmpNativeCountry) {
        this.EmpNativeCountry = EmpNativeCountry;
    }

    public String getEmpTelephoneCountryCode() {
        return EmpTelephoneCountryCode;
    }

    public void setEmpTelephoneCountryCode(String EmpTelephoneCountryCode) {
        this.EmpTelephoneCountryCode = EmpTelephoneCountryCode;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }

    public String getEmployeeGender() {
        return EmployeeGender;
    }

    public void setEmployeeGender(String EmployeeGender) {
        this.EmployeeGender = EmployeeGender;
    }

    public String getEmployeeuserName() {
        return EmployeeuserName;
    }

    public void setEmployeeuserName(String EmployeeuserName) {
        this.EmployeeuserName = EmployeeuserName;
    }

    public String getEmployeePasswd() {
        return EmployeePasswd;
    }

    public void setEmployeePasswd(String EmployeePasswd) {
        this.EmployeePasswd = EmployeePasswd;
    }
}
