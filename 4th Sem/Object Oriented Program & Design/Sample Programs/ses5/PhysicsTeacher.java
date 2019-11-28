package wims_2017.ses5;

public class PhysicsTeacher extends Teacher {

	public PhysicsTeacher () {
		super("Arun Vadekkedhil", "Teacher OOPD");
	}
	
	String mainSubject ="Physics";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhysicsTeacher phy = new PhysicsTeacher();
		//System.out.println(phy.collegeName);
		//System.out.println(phy.designation);
		System.out.println(phy.mainSubject);
		
		phy.setCollegeName("MY College");
		phy.setDesignation("VP");
		
		phy.does();
	}

}
