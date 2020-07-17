/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainassignmentjava;

import java.io.*;
import java.util.*;

public class TrainMenu {
    String strFilePath = "src\\trainassignmentjava\\TrainDataBase";
    void write_train(ArrayList<RailwayTrain> railwayTrain){
        try{       
            FileOutputStream fileoutputStream=new FileOutputStream(strFilePath);
            ObjectOutputStream objectOutpurStream=new ObjectOutputStream(fileoutputStream);
            for(int i=0;i<railwayTrain.size();i++)
                    objectOutpurStream.writeObject(railwayTrain.get(i));
            objectOutpurStream.close();
            fileoutputStream.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    void dispTrain(boolean check){
        ArrayList<RailwayTrain>railwayTrain=this.getTrain();
        if(check==true){Collections.sort(railwayTrain);}
        for(int i=0;i<railwayTrain.size();i++){
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            System.out.println("Train Name : "+railwayTrain.get(i).getTrainname()); 
            System.out.println("Number\t*\tSource\t*\tDestination\t*\tDistance"); 
            System.out.println(railwayTrain.get(i).getTrainNo()+"\t*\t"+railwayTrain.get(i).getSourceStn()
                    +"\t*\t"+railwayTrain.get(i).getDestStn()+"\t*\t\t"+railwayTrain.get(i).getDistance()); 
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n");
            if(railwayTrain.get(i).getSchedule().contains(8)){ System.out.println("Train runs on Daily basis..."); }
            else{
                String run="";
                if( railwayTrain.get(i).getSchedule().contains(1))     run+="Monday ";
                if( railwayTrain.get(i).getSchedule().contains(2))     run+="Tuesday ";
                if( railwayTrain.get(i).getSchedule().contains(3))     run+="Wednesday ";
                if( railwayTrain.get(i).getSchedule().contains(4))     run+="Thursday ";
                if( railwayTrain.get(i).getSchedule().contains(5))     run+="Friday ";
                if( railwayTrain.get(i).getSchedule().contains(6))     run+="Saturday ";
                if( railwayTrain.get(i).getSchedule().contains(7))     run+="Sunday ";
                System.out.println(run);
            }
            System.out.println("\n--------------------------------------------\n");
        }	
    }
    void dispTrainBetween(String src,String dst){
        ArrayList<RailwayTrain>rt=this.getTrain();
        boolean flag=false;
        for(int i=0;i<rt.size();i++){
                if(src.equalsIgnoreCase(rt.get(i).getSourceStn()) && dst.equalsIgnoreCase(rt.get(i).getDestStn())){
                    flag=true;
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                    System.out.println("Train Name : "+rt.get(i).getTrainname()); 
                    System.out.println("Number\t*\tSource\t*\tDestination\t*\tDistance"); 
                    System.out.println(rt.get(i).getTrainNo()+"\t*\t"+rt.get(i).getSourceStn()
                    +"\t*\t"+rt.get(i).getDestStn()+"\t*\t\t"+rt.get(i).getDistance());
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n");
                }
        }
        if(!flag){ System.out.println("No Trains found between the given source and destination\n"); }
    }
    void addTrain(){ 
        RailwayTrain t=new RailwayTrain();
        ArrayList<RailwayTrain> rt=new ArrayList<RailwayTrain>();
        //if(this.getTrain()!=null) 
        rt=this.getTrain();
        System.out.print("\nEnter train number : ");  t.setTrainNo(TrainAssignmentJava.scanner.nextInt());
        System.out.print("\nEnter train name : ");     t.setTrainname(TrainAssignmentJava.scanner.next());
        System.out.print("\nEnter Source of train : ");  t.setSourceStn(TrainAssignmentJava.scanner.next());
        System.out.print("\nEnter Destination of train : "); t.setDestStn(TrainAssignmentJava.scanner.next());
        System.out.print("\nEnter total distance : "); t.setDistance(TrainAssignmentJava.scanner.nextInt());
        System.out.print("\nEnter Train Schedule : "); t.setSchedule(getSchedule());
        rt.add(t); this.write_train(rt);
    }
    ArrayList<Integer> getSchedule(){
        ArrayList<Integer> s=new ArrayList<Integer>();
        System.out.println("Does Train runs Daily(y/n)?");
        if(TrainAssignmentJava.scanner.next().equalsIgnoreCase("y")) s.add(8);
        else{
            System.out.println("Enter 'y' if trains runs on specified day else press 'n'......");
            System.out.println("Monday");
            if(TrainAssignmentJava.scanner.next().equalsIgnoreCase("y"))      s.add(1);
            System.out.println("Tuesday");
            if(TrainAssignmentJava.scanner.next().equalsIgnoreCase("y"))      s.add(2);
            System.out.println("Wednesday");
            if(TrainAssignmentJava.scanner.next().equalsIgnoreCase("y"))      s.add(3);
            System.out.println("Thursday");
            if(TrainAssignmentJava.scanner.next().equalsIgnoreCase("y"))      s.add(4);
            System.out.println("Friday");
            if(TrainAssignmentJava.scanner.next().equalsIgnoreCase("y"))      s.add(5);
            System.out.println("Saturday");
            if(TrainAssignmentJava.scanner.next().equalsIgnoreCase("y"))      s.add(6);
            System.out.println("Sunday");
            if(TrainAssignmentJava.scanner.next().equalsIgnoreCase("y"))      s.add(7);
        }
        return s;
    }
    int getIndex(int num){
        ArrayList<RailwayTrain> rt=this.getTrain();
        for(int i=0;i<rt.size();i++)
            if(rt.get(i).getTrainNo()==num)
                return i;
        return -1;
    }
    void deleteTrain(){
        //RailwayTrain trainMenu=new RailwayTrain();
        ArrayList<RailwayTrain> rt=this.getTrain();
        System.out.print("\nEnter The Train number you want to Delete : ");
        int num=TrainAssignmentJava.scanner.nextInt();
        int i=this.getIndex(num); rt.remove(i);  this.write_train(rt);
    }
    void modifyTrain(){
        RailwayTrain t=new RailwayTrain();
        ArrayList<RailwayTrain> rt=this.getTrain();
        System.out.print("\nEnter the train number whose details are to be modified : ");
        int index=this.getIndex(TrainAssignmentJava.scanner.nextInt());
        System.out.println("Enter the new details if changed otherwise enter the old details");
        System.out.print("\nEnter the train number : ");	t.setTrainNo(TrainAssignmentJava.scanner.nextInt());
        System.out.print("\nEnter the train name : ");	t.setTrainname(TrainAssignmentJava.scanner.next());
        System.out.print("\nEnter the Source of train : ");t.setSourceStn(TrainAssignmentJava.scanner.next());
        System.out.print("\nEnter the Destination of train : ");	t.setDestStn(TrainAssignmentJava.scanner.next());
        System.out.print("\nEnter the toltal distance travlled by train : ");t.setDistance(TrainAssignmentJava.scanner.nextInt());
        rt.set(index,t); this.write_train(rt);
    }
    ArrayList<RailwayTrain> getTrain(){
        ArrayList<RailwayTrain> rt=new ArrayList<RailwayTrain>(); 
        try{
            RailwayTrain t=new RailwayTrain();
            FileInputStream fi=new FileInputStream(strFilePath);
            ObjectInputStream i=new ObjectInputStream(fi);  boolean cont=true;
            while(cont){
                t=null;
                try{
                    t=(RailwayTrain)i.readObject();
                    rt.add(t);
                }catch(IOException | ClassNotFoundException e){
                    break;
                }
            }
            i.close(); fi.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return rt;
    }
}
