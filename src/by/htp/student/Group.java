package by.htp.student;

public class Group {
	
private Student[] students;
private int number;
private int lastIndex;
public Group(int number, int size){
	lastIndex = 0;
	this.number = number;
	students = new Student[size];//sozdali massive, razmernost'u, kotoruu my peradadim v size
}
public void addStudent(Student student){
	students[lastIndex] = student; 
	lastIndex++;
}
public Student[] getStudents(){
	return students;
}
}
