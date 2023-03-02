package com.mycompany.BuildingExecutive;

public class ModelJob  implements ModelDescription {
    String jobId;
    String employeeName;
    String employeeJob;

    public ModelJob(){}
    public ModelJob(String line) {
        fromString(line);
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeJob() {
        return this.employeeJob;
    }

    public void setEmployeeJob(String employeeJob) {
        this.employeeJob = employeeJob;
    }


    public void fromString(String line) {
        String[] data = line.split(",");
        setJobId(data[0]);
        setEmployeeName(data[1]);
        setEmployeeJob(data[2]);
    }

    @Override
    public String toString() {
        return  getJobId() + "," +
                getEmployeeName() + "," +
                getEmployeeJob() + ",";
    }
}
