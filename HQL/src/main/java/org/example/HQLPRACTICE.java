package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HQLPRACTICE {
    @Id
    private int latopId;
    private String lName;
    private String lModel;

    public int getLatopId() {
        return latopId;
    }

    public void setLatopId(int latopId) {
        this.latopId = latopId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlModel() {
        return lModel;
    }

    public void setlModel(String lModel) {
        this.lModel = lModel;
    }

    @Override
    public String toString() {
        return "HQLPRACTICE{" +
                "latopId=" + latopId +
                ", lName='" + lName + '\'' +
                ", lModel='" + lModel + '\'' +
                '}';
    }
}
