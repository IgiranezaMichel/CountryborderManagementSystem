
package Tables;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
@Entity
public class BorderTable implements Serializable{
    @Id
    @Column(unique = true,nullable = false,updatable = true)
    private String BorderId;
       @Column(unique = false,nullable = false)
    private String BorderLocationName;
       @OneToMany(mappedBy = "EmpBorderId")
    private Set<EmployeeTable> employees;
        @OneToMany(mappedBy = "BorderLocationId")
    private  Set<EmployeeExploreBorder>PaBorderId;

    public Set<EmployeeExploreBorder> getPaBorderId() {
        return PaBorderId;
    }

    public void setPaBorderId(Set<EmployeeExploreBorder> PaBorderId) {
        this.PaBorderId = PaBorderId;
    }
    public Set<EmployeeTable> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<EmployeeTable> employees) {
        this.employees = employees;
    }
    public int getOpenClosed() {
        return OpenClosed;
    }

    public void setOpenClosed(int OpenClosed) {
        this.OpenClosed = OpenClosed;
    }
    private int OpenClosed;

    public String getBorderId() {
        return BorderId;
    }

    public void setBorderId(String BorderId) {
        this.BorderId = BorderId;
    }

    public String getBorderLocationName() {
        return BorderLocationName;
    }

    public void setBorderLocationName(String BorderLocationName) {
        this.BorderLocationName = BorderLocationName;
    }
}
