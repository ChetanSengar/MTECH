package wims_2017.ses5;

public class Child extends Parent {

	public String lineage = "GrandParent + Parent + Child";
	public void Print()    
    { 
        super.Print(); 
        System.out.println("Child's Print()" + lineage); 
        
    }  
	public static void main(String args[]){
		Child c = new Child(); 
        c.Print(); 
		
				
	}
}
