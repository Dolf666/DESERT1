package com.desrt.model;

import com.desrt.api.View;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import org.hibernate.criterion.Projections;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "resource_data")
public class Employee {
    @GeneratedValue
    @JsonIgnore
    @Column(name = "record_number")
    public int recordNumber;

    @JsonView({View.OveralView.class ,View.DetailView.class})
    @Column(name = "first_name")
    public String firstName;

    @JsonView({View.OveralView.class ,View.DetailView.class})
    @Column(name = "last_name")
    public String surname;

    @JsonView({View.DetailView.class,View.DetailPartialView.class})
    @Column(name = "resource_role")
    public String resourceRole;

    @JsonView(View.DetailView.class)
    @Column(name = "e_mail")
    public String email;

    @JsonView({View.DetailView.class,View.DetailPartialView.class})
    @Column(name = "resource_allocation")
    public String resourceAllocation;

    @JsonView(View.DetailView.class)
    @Column(name = "resource_grade")
    public String resourceGrade;

    @JsonView(View.DetailView.class)
    @Column(name = "primary_role")
    public String primaryRole;

    @JsonView(View.DetailView.class)
    @Column(name = "manager")
    public String manager;

    @JsonView(View.DetailView.class)
    @Column(name = "booking_manager")
    public String bookingManager;

    @JsonView(View.DetailView.class)
    @Column(name = "cost_centre")
    public String costCentre;

    @JsonView({View.DetailView.class,View.DetailPartialView.class})
    @Column(name = "location")
    public String location;
    @Id
    @JsonView({View.OveralView.class ,View.DetailView.class})
    @Column(name = "pid")
    public String PID;

    @JsonView(View.DetailView.class)
    @Column(name = "team_obs")
    public String teamOBS;

    @JsonView({View.DetailView.class,View.DetailPartialView.class})
    @Column(name = "date_of_hire")
    public Date dateOfHire;

    @JsonView(View.DetailView.class)
    @Column(name = "date_of_termination")
    public Date dateOfTermination;

    @JsonView({View.DetailView.class,View.DetailPartialView.class})
    @Column(name = "open_for_time_entry")
    public String openForTimeEntry;

    @JsonView(View.DetailView.class)
    @Column(name = "id")
    public String id;


    public Employee() {
    }

    public Employee(String firstName, String surname, String PID) {
        this.firstName = firstName;
        this.surname = surname;
        this.PID = PID;
    }
    public Employee(String firstName, String surname, String resourceRole,String PID,String location,String resourceAllocation,String openForTimeEntry, Date dateOfHire) {
        this.firstName = firstName;
        this.resourceRole=resourceRole;
        this.surname = surname;
        this.PID = PID;
        this.location=location;
        this.resourceAllocation=resourceAllocation;
        this.openForTimeEntry=openForTimeEntry;
        this.dateOfHire=dateOfHire;

    }




    public Employee(int recordNumber, String firstName, String surname, String resourceRole, String email, String resourceAllocation, String resourceGrade, String primaryRole,
                    String manager, String bookingManager, String costCentre, String location, String PID, String teamOBS, Date dateOfHire,
                    Date dateOfTermination, String openForTimeEntry, String id) {
        this.recordNumber=recordNumber;
        this.firstName = firstName;
        this.surname = surname;
        this.resourceRole = resourceRole;
        this.email = email;
        this. resourceAllocation= resourceAllocation;
        this.resourceGrade = resourceGrade;
        this.primaryRole = primaryRole;
        this.manager = manager;
        this.bookingManager = bookingManager;
        this.costCentre = costCentre;
        this.location = location;
        this.PID = PID;
        this.teamOBS = teamOBS;
        this.dateOfHire = dateOfHire;
        this.dateOfTermination = dateOfTermination;
        this.openForTimeEntry = openForTimeEntry;
        this.id = id;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getResourceAllocation() {
        return resourceAllocation;
    }

    public void setResourceAllocation(String resourceAllocation) {
        this.resourceAllocation = resourceAllocation;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getResourceRole() {
        return resourceRole;
    }

    public void setResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResourceGrade() {
        return resourceGrade;
    }

    public void setResourceGrade(String resourceGrade) {
        this.resourceGrade = resourceGrade;
    }

    public String getPrimaryRole() {
        return primaryRole;
    }

    public void setPrimaryRole(String primaryRole) {
        this.primaryRole = primaryRole;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getBookingManager() {
        return bookingManager;
    }

    public void setBookingManager(String bookingManager) {
        this.bookingManager = bookingManager;
    }

    public String getCostCentre() {
        return costCentre;
    }

    public void setCostCentre(String costCentre) {
        this.costCentre = costCentre;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getTeamOBS() {
        return teamOBS;
    }

    public void setTeamOBS(String teamOBS) {
        this.teamOBS = teamOBS;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public Date getDateOfTermination() {
        return dateOfTermination;
    }

    public void setDateOfTermination(Date dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    public String getOpenForTimeEntry() {
        return openForTimeEntry;
    }

    public void setOpenForTimeEntry(String openForTimeEntry) {
        this.openForTimeEntry = openForTimeEntry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.id + " " + this.getFirstName() + " " + this.getSurname() + " " +
                this.getResourceRole() + " " +
                this.getEmail() + " " +
                this.getResourceAllocation() + " " +
                this.getResourceGrade() + " " +
                this.getPrimaryRole() + " " +
                this.getManager() + " " +
                this.getBookingManager() + " " +
                this.getCostCentre() + " " +
                this.getLocation() + " " +
                this.getPID() + " " +
                this.getTeamOBS() + " " +
                this.getDateOfHire() + " " +
                this.getDateOfTermination() + " " +
                this.getOpenForTimeEntry() + " " +
                this.getId();
    }


}



