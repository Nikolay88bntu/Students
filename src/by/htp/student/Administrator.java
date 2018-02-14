package by.htp.student;

public class Administrator {
private String name;
public Administrator () {
	this.name = "Vasya";
}
public void enroleStudent (Student student, Group group) {
	
group.addStudent(student);
}
public Group createGroup(int groupNumber, int studentsCount){
	
	Group group = new Group(groupNumber, studentsCount);//vernet massiv studentov
	return group;
	
	}
public void printGroup(Group group){
	
	Student[] list = group.getStudents();
	
	for (int i = 0; i<list.length; i++){
	//System.out.println(group.getStudents()[i]);
		if(list[i]!=null){
		//System.out.println("fio: " + group.getStudents()[i].getFio() +  " rating: " + group.getStudents()[i].getRating());//odin variant
			System.out.println(list[i]);
	}
	}

}
}



