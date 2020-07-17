/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainassignmentjava;

import java.io.Serializable;
import java.util.ArrayList;


public class RailwayTrain implements Comparable<RailwayTrain>,Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String trainName;
    private String sourceStation;
    private String destStation;    private long TrainNo;
    private int distance;
    private ArrayList<Integer>scheduleArray=new ArrayList();
    public ArrayList<Integer> getSchedule() {
        return scheduleArray;
    }
    public void setSchedule(ArrayList<Integer> schedule) {
        this.scheduleArray = schedule;
    }
    public String getTrainname() {
        return trainName;
    }
    public void setTrainname(String trainname) {
        this.trainName = trainname;
    }
    public String getSourceStn() {
        return sourceStation;
    }
    public void setSourceStn(String sourceStn) {
        this.sourceStation = sourceStn;
    }
    public String getDestStn() {
        return destStation;
    }
    public void setDestStn(String destStn) {
        this.destStation = destStn;
    }
    public long getTrainNo() {
        return TrainNo;
    }
    public void setTrainNo(long trainNo) {
        this.TrainNo = trainNo;
    }
    public int getDistance(){
        return distance;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }
    @Override
    public int compareTo(RailwayTrain rt){
        return this.distance-rt.distance;

    }
}
