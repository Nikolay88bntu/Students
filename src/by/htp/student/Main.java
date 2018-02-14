package by.htp.student;

public class Main {

	public static void main(String[] args) {
		
	//Group group = new Group(1);	// TODO Auto-generated method stub
	Administrator admin = new Administrator();
	
	Student student1 = new Student("Dima", 30);
	Student student2 = new Student("Vitaliy", 31);
	Student student3 = new Student("Olga", 32);
	
	Group group = admin.createGroup(5, 20);
	admin.enroleStudent(student1, group);
	admin.enroleStudent(student2, group);
	admin.enroleStudent(student3, group);
	admin.printGroup(group);
	//System.out.println(" " + admin);

	}

}
