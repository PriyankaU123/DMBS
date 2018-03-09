/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmsproj;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Vikram
 */
@Entity
@Table(name = "Appointment", catalog = "pudapu1db", schema = "")
@NamedQueries({
    @NamedQuery(name = "Appointment.findAll", query = "SELECT a FROM Appointment a")
    , @NamedQuery(name = "Appointment.findByAppID", query = "SELECT a FROM Appointment a WHERE a.appID = :appID")
    , @NamedQuery(name = "Appointment.findByDate", query = "SELECT a FROM Appointment a WHERE a.date = :date")
    , @NamedQuery(name = "Appointment.findByTime", query = "SELECT a FROM Appointment a WHERE a.time = :time")
    , @NamedQuery(name = "Appointment.findByDoctor", query = "SELECT a FROM Appointment a WHERE a.doctor = :doctor")
    , @NamedQuery(name = "Appointment.findByStatus", query = "SELECT a FROM Appointment a WHERE a.status = :status")})
public class Appointment implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AppID")
    private Integer appID;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "Time")
    private String time;
    @Column(name = "Doctor")
    private String doctor;
    @Column(name = "Status")
    private String status;

    public Appointment() {
    }

    public Appointment(Integer appID) {
        this.appID = appID;
    }

    public Integer getAppID() {
        return appID;
    }

    public void setAppID(Integer appID) {
        Integer oldAppID = this.appID;
        this.appID = appID;
        changeSupport.firePropertyChange("appID", oldAppID, appID);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        String oldDoctor = this.doctor;
        this.doctor = doctor;
        changeSupport.firePropertyChange("doctor", oldDoctor, doctor);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appID != null ? appID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.appID == null && other.appID != null) || (this.appID != null && !this.appID.equals(other.appID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbmsproj.Appointment[ appID=" + appID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
