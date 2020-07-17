/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainassignmentjava;

import java.time.LocalDate;


public class TrainTicket extends RailwayTrain implements HasPantry,RunSchedule{


    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //
	private String name; private String coach; 
	private long mobno;  private int amt; 
	private int totalamt;private LocalDate dt;
	public String getName(){ return name; }
	public void setName(String name){ this.name = name;}
	public String getCoach(){  return coach; }
	public void setCoach(String coach){ this.coach = coach;	}
	public long getMobileNo(){	return mobno; }
	public void setMobileNo(long mobno){ this.mobno = mobno; }
	public int getAmmount(){ return amt; }
	public void setAmmount(int amt){ this.amt = amt; }
	public int getTotalamt(){ return totalamt; }
	public void setTotalamt(int Amt, String coach){
            int add=0;
            switch (coach){
                case "First_AC": add=750; break;
                case "Second_AC": add=500; break;
                case "Third_Ac": add=250; break;
            }
            this.totalamt = Amt+add;
	}
	void accept(){
            System.out.println("Enter Customer name");
            this.setName(TrainAssignmentJava.scanner.next());
            String menu="\n~~//~~First_AC : Rs.700"+"~~//~~Second_AC : Rs.500 "
                    +"~~//~~Third_AC : Rs.250"+"~~//~~Sleeper None\n\nChoose Your coach from above :";
            boolean f=false;
            while(!f){
                System.out.println(menu);
                String s=TrainAssignmentJava.scanner.next();
                if(s.equals("First_AC") || s.equals("Second_AC")|| s.equals("Third_AC") || s.equals("Sleeper")){
                    this.setCoach(s);
                    f=true;
                }else{
                    System.out.print("\nEnter the options only from menu as it is.(  ");
                    System.out.print("Ex: If want to slect First_AC, please type 'First_AC'.)");
                }
            }
            System.out.print("Enter Your Mobile Number : "); this.setMobileNo(TrainAssignmentJava.scanner.nextLong());
            System.out.print("Enter the basic ticket amount : "); this.setAmmount(TrainAssignmentJava.scanner.nextInt());
            this.setTotalamt(this.amt, this.coach);
	}
	void Display(){
            System.out.println("~~~~Tcket Details~~~~");
            System.out.println("Passenger Name : "+this.getName()); System.out.println("Coach : "+this.getCoach());
            System.out.println("Mobile No : "+this.getMobileNo());  System.out.println("Train Number : "+this.getTrainNo());
            System.out.println("Train Name: "+this.getTrainname()); System.out.println("Source : "+this.getSourceStn());
            System.out.println("Destination : "+this.getDestStn()); System.out.println("Distance : "+this.getDistance());
            System.out.println("Total Amount : "+this.getTotalamt());
            System.out.println("~~~~*********~~~~");
	}
        @Override
	public boolean isRunning(int i){
            if(this.getSchedule().contains(8)) return true;
            return this.getSchedule().contains(i);
	}
}
interface HasPantry{
}
interface RunSchedule{
    boolean isRunning(int i);
}
