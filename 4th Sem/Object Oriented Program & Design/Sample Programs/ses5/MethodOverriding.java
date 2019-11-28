package wims_2017.ses5;

public class MethodOverriding extends Super {
	@Override
	   public void sampie(){
	      System.out.println("Method of the Sub class");
	   }
	   public static void main(String args[]){
	      MethodOverriding obj = new MethodOverriding();
	      Super sup = new Super();
	      sup.sample();
	      obj.sample();
	   }
	}