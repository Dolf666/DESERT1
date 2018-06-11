package com.desrt.model;

import java.util.Date;

public class Projects {
    String programm;
    String projectName;
    String projectID;
    String iTProjectCode;
    String isMasterProject;
    String  subprojects;
    String statusReports;
    String Manager;
    Date startDate;
    Date finishDate;
    String HMRCDemand;
    String HMRCSupply;
    String DeliveryGroups;
    String Department;
    String DepartmentName;
    String DepartmentOBS;
    String DTODataEngineering;

    public Projects(String programm, String projectName, String projectID, String iTProjectCode,
                    String isMasterProject,  String  subprojects, String statusReports,String manager, Date startDate,
                    Date finishDate, String HMRCDemand, String HMRCSupply,
                    String deliveryGroups, String department, String departmentName,
                    String departmentOBS, String DTODataEngineering) {
        this.programm = programm;
        this.projectName=  projectName;
        this.projectID = projectID;
        this.iTProjectCode = iTProjectCode;
        this.isMasterProject = isMasterProject;
        this.    subprojects=    subprojects;
        this.  statusReports=  statusReports;
        this.Manager = manager;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.HMRCDemand = HMRCDemand;
        this.HMRCSupply = HMRCSupply;
        this.DeliveryGroups = deliveryGroups;
        this.Department = department;
        this.DepartmentName = departmentName;
        this.DepartmentOBS = departmentOBS;
        this.DTODataEngineering = DTODataEngineering;
    }

    public String getSubprojects() {
        return subprojects;
    }

    public void setSubprojects(String subprojects) {
        this.subprojects = subprojects;
    }

    public String getStatusReports() {
        return statusReports;
    }

    public void setStatusReports(String statusReports) {
        this.statusReports = statusReports;
    }

    public Projects() { }

    public String getProgramm() {
        return programm;
    }

    public void setProgramm(String programm) {
        this.programm = programm;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getiTProjectCode() {
        return iTProjectCode;
    }

    public void setiTProjectCode(String iTProjectCode) {
        this.iTProjectCode = iTProjectCode;
    }

    public String getIsMasterProject() {
        return isMasterProject;
    }

    public void setIsMasterProject(String isMasterProject) {
        this.isMasterProject = isMasterProject;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String manager) {
        Manager = manager;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getHMRCDemand() {
        return HMRCDemand;
    }

    public void setHMRCDemand(String HMRCDemand) {
        this.HMRCDemand = HMRCDemand;
    }

    public String getHMRCSupply() {
        return HMRCSupply;
    }

    public void setHMRCSupply(String HMRCSupply) {
        this.HMRCSupply = HMRCSupply;
    }

    public String getDeliveryGroups() {
        return DeliveryGroups;
    }

    public void setDeliveryGroups(String deliveryGroups) {
        DeliveryGroups = deliveryGroups;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDepartmentOBS() {
        return DepartmentOBS;
    }

    public void setDepartmentOBS(String departmentOBS) {
        DepartmentOBS = departmentOBS;
    }

    public String getDTODataEngineering() {
        return DTODataEngineering;
    }

    public void setDTODataEngineering(String DTODataEngineering) {
        this.DTODataEngineering = DTODataEngineering;
    }
}
