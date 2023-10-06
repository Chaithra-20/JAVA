package com.kodnest.objectorientation.inheritance;

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsTeacher physicsTeacher=new PhysicsTeacher();
		ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
		BiologyTeacher biologyTeacher = new BiologyTeacher();
		
		physicsTeacher.name="Shashikumar";
		physicsTeacher.subject="Physics";
		physicsTeacher.markAttedence();
		physicsTeacher.teach();
		physicsTeacher.doLawsExperiment();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		
		chemistryTeacher.name="Rudresh";
		chemistryTeacher.subject="Chemistry";
		chemistryTeacher.markAttedence();
		chemistryTeacher.teach();
		chemistryTeacher.doChemistryExperiments();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		
		biologyTeacher.name="Nagashree";
		biologyTeacher.subject="Biology";
		biologyTeacher.markAttedence();
		biologyTeacher.teach();
		biologyTeacher.doDisectionExperiment();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
				

	}

}
