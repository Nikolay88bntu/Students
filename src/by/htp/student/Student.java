package by.htp.student;

public class Student {
private String fio;
private double rating;

public Student(){
}
public Student(String fio, double rating){
	this.fio = fio;
	this.rating = rating;
}
public String getFio(){
	return fio;
}
public double getRating(){
	return rating;
}
public String toString(){ // mozhno bylo napisat' svoy metod tipa public String printInfo
	return "fio: " + fio +  " rating: " + rating;
}
}
