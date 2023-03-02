package com.mycompany.BuildingExecutive;

public class ModelComplaint  implements ModelDescription {
    String complaintId;
    String complaintDetails; 
    String complaintReply;
    String residentId;


    public ModelComplaint() {
    }

    public ModelComplaint(String line) {
        fromString(line);
    }

    public String getComplaintId() {
        return this.complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getComplaintDetails() {
        return this.complaintDetails;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }

    public String getComplaintReply() {
        return this.complaintReply;
    }

    public void setComplaintReply(String complaintReply) {
        this.complaintReply = complaintReply;
    }

    public String getResidentId() {
        return this.residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public void fromString(String line) {
        String[] data = line.split(",");
        setComplaintId(data[0]);
        setComplaintDetails(data[1]);
        setComplaintReply(data[2]);
        setResidentId(data[3]);
    }

    @Override
    public String toString() {
        return  getComplaintId() + "," +
                getComplaintDetails() + "," +
                getComplaintReply() + "," +
                getResidentId() + ",";
    }
}
