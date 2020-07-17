/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainassignmentjava;

import static java.lang.System.exit;
import java.time.*;
import java.util.*;

public class TrainAssignmentJava {

    TrainMenu trainMenu=new TrainMenu();
    public static Scanner scanner=new Scanner(System.in);
    
    public static void main(String args[]){
        boolean check=true;
        TrainAssignmentJava trainAssignment=new TrainAssignmentJava();
        while(check){
            String mainMenu="~~~~~~~~~~~~~Main Page~~~~~~~~~~~~~\n"+"1.Train Menu\n"+"2.Book Train\n"+"3.Exit";
            System.out.print(mainMenu+"\nEnter Your Choice(1-3) : ");
            switch(scanner.nextInt()){
                case 1: trainAssignment.trainMenu(); break;
                case 2: trainAssignment.bookingMenu();break;
                case 3: check=false; break;
                default: System.out.println("Error : Please Choose Correct Choice...!!");
            }
        }
        scanner.close();
    }
    void bookingMenu(){
        boolean booleanA=true; String PathSrc,DestStationString;
        while(booleanA){
            String menuBooking="~~~~~~~~~~~~~Booking~~~~~~~~~~~~~\n"+"1.Show All Trains\n"+"2.Show Trains Between Two Stations\n" + 
                   "3.Book Ticket\n"+"4.Show trains by Distance (longest to shortest distance)\n"+"5.Move to previous Menu(Exit)\n";
            System.out.println(menuBooking+"\nEnter Your Choice(1-5) : ");
            switch(scanner.nextInt()){
                    case 1: trainMenu.dispTrain(false); break;
                    case 2: System.out.print("\nEnter Source Station : "); PathSrc=scanner.next();
                                System.out.print("\nEnter Destination Station : "); DestStationString=scanner.next();
                                trainMenu.dispTrainBetween(PathSrc, DestStationString); break;
                    case 3: ArrayList<RailwayTrain> rt=trainMenu.getTrain();
                                System.out.print("\nEnter Train Number for this Booking : ");
                                int i=trainMenu.getIndex(scanner.nextInt());
                                if(i<0){
                                    System.out.println("No Trains with given number available, Please Try check !!");
                                    break;
                                }
                                System.out.print("\nEnter the booking date(Use Integer Values only).\n Date(DD) :");
                                int dd=scanner.nextInt(); 
                                if(dd > 31 ){ System.out.println("Date can not be more than 31, please try again."); exit(0);}
                                System.out.print("\nEnter Month(MM) : "); int mm=scanner.nextInt();
                                if(mm > 12 ){ System.out.println("Month can not be more than 12, please try again."); exit(0);}
                                System.out.print("\nEnter Year(YY) : ");  int yy=scanner.nextInt();
                                LocalDate dt=LocalDate.of(yy, mm, dd);
                                TrainTicket trainTicket=new TrainTicket();
                                trainTicket.setDestStn(rt.get(i).getDestStn()); trainTicket.setDistance(rt.get(i).getDistance());
                                trainTicket.setTrainname(rt.get(i).getTrainname()); trainTicket.setSourceStn(rt.get(i).getSourceStn());
                                trainTicket.setTrainNo(rt.get(i).getTrainNo()); trainTicket.setSchedule(rt.get(i).getSchedule());
                                if(trainTicket.isRunning(dt.getDayOfWeek().getValue())){
                                        System.out.println("Train is not available on mentioned date/day.");
                                        break;
                                }
                                trainTicket.accept(); trainTicket.Display(); break;
                    case 4:trainMenu.dispTrain(true);break;
                    case 5:booleanA=false; break;
                    default: System.out.println("Please choose the correct choice...!!");
            }
        }
    }
    void trainMenu(){
        boolean booleanA=true;
        while(booleanA){
            String menuBooking="~~~~~~~~~~~~~Train Menu~~~~~~~~~~~~~\n"+"1.Add Train\n"+"2.Delete Train\n" + 
                "3.Modify Train\n"+"4.Exit Booking\n";
            System.out.println(menuBooking+"\nEnter Your Choice(1-4) : ");
            int k=scanner.nextInt();
            switch(k){
                case 1: trainMenu.addTrain(); break;
                case 2:trainMenu.deleteTrain(); break;
                case 3:trainMenu.modifyTrain(); break;
                case 4:booleanA=false; break;
                default: System.out.println("Wrong Choice!! Retry");
            }
        }
    }
}
