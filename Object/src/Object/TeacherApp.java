package Object;


public class TeacherApp {
	public static void main(String [] args) {
		
		Teacher t1=new Teacher();
			t1.id=120;
			t1.name="Chaithra";
			t1.subject="Biology";
			t1.teach();
			t1.motivate();
			t1.giveAssignment();
			
			System.out.println(t1.id);
			System.out.println(t1.name);
			System.out.println(t1.subject);
			
			
			
	}

}
