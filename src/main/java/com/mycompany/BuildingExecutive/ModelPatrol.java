package com.mycompany.BuildingExecutive;

public class ModelPatrol implements ModelDescription {
    String checkpointRecordId;
    String userId;
    String blockNumber;
    String checkpointDate;
    String checkpointTime;

    public ModelPatrol(){}
    public ModelPatrol(String line) {
        fromString(line);
    }

    public String getCheckpointRecordId() {
        return this.checkpointRecordId;
    }

    public void setCheckpointRecordId(String checkpointRecordId) {
        this.checkpointRecordId = checkpointRecordId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBlockNumber() {
        return this.blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getCheckpointDate() {
        return this.checkpointDate;
    }

    public void setCheckpointDate(String checkpointDate) {
        this.checkpointDate = checkpointDate;
    }

    public String getCheckpointTime() {
        return this.checkpointTime;
    }

    public void setCheckpointTime(String checkpointTime) {
        this.checkpointTime = checkpointTime;
    }
    public void fromString(String line) {
        String[] data = line.split(",");
        setCheckpointRecordId(data[0]);
        setUserId(data[1]);
        setBlockNumber(data[2]);
        setCheckpointDate(data[3]);
        setCheckpointTime(data[4]);
    }

    @Override
    public String toString() {
        return  getCheckpointRecordId() + "," +
                getUserId() + "," +
                getBlockNumber() + "," +
                getCheckpointDate() + "," +
                getCheckpointTime() + ",";
    }
}
