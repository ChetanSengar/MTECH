package wims_2017.ses5;

public class Parent extends GrandParent {

	public String lineage = "GrandParent + Parent ";
	public void Print()  
    { 
        super.Print();
		System.out.println("Parent's Print()" + lineage);  
    }
}
