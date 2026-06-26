package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Account {

    @Id
    private int accId;

    private String accType;

    @OneToOne
    @JoinColumn(name = "empid")
    private Emp emp;

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
}