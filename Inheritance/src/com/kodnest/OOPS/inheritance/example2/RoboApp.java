package com.kodnest.OOPS.inheritance.example2;

public class RoboApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherRobo teacherRobo = new TeacherRobo();
		ChefRobo chefRobo = new ChefRobo();
		DriverRobo driverRobo = new DriverRobo();
		
		teacherRobo.name="CHITTI";
		teacherRobo.type="Humanoid";
		teacherRobo.talk();
		teacherRobo.walk();
		teacherRobo.charge();
		teacherRobo.teach();
		System.out.println("++++++++++++++++++++++++++");
		
		chefRobo.name="AMY JACKSON";
		chefRobo.type="HumanFenoid";
		chefRobo.talk();
		chefRobo.walk();
		chefRobo.charge();
		chefRobo.cook();
		System.out.println("++++++++++++++++++++++++++++");
		
		driverRobo.name="WILL SMITH";
		driverRobo.type="ANDROBRAINOID";
		driverRobo.talk();
		driverRobo.walk();
		driverRobo.charge();
		driverRobo.drive();

	}

}
