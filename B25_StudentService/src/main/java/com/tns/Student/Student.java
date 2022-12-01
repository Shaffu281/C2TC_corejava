package com.tns.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student
{
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private Long Roll;
private String College;
private String qualification;
private  String course;
private Integer year;
private String certificate;
private Long HallTicket;
public Student(Integer id, String name,Long Roll ,String College, String qualification, String course, Integer year
		, String certificate, Long HallTicket)
{
this.id = id;
this.name = name;
this.Roll=Roll;
this.College=College;
this.qualification=qualification;
this.course=course;
this.year=year;
this.certificate=certificate;
this.HallTicket=HallTicket;

}
public Student()
{
super();
}
public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Long getRoll() {
return Roll;
}
public void setRoll(Long Roll) {
this.Roll= Roll;
}
public String getCollege() {
return College;
}
public void setCollege(String password) {
this.College = College;
}
public String getcourse() {
return course;
}
public void setcourse(String course) {
this.course= course;
}
public String getqualification() {
return qualification;
}
public void setqualification(String qualification) {
this.qualification = qualification;
}
public Integer getyear() {
return year;
}
public void setyear(Integer year) {
this.year= year;
}
public String getcertificate() {
return certificate;
}
public void setcertificate(String certificate) {
this.certificate= certificate;
}
public Long getHallTicket() {
return HallTicket;
}
public void setHallTicket(Long HallTicket) {
this.HallTicket= HallTicket;
}

@Override
public String toString() {
return "Student [id=" + id + ", name=" + name + ", Roll=" + Roll +", College=" + College +" , qualification=" + qualification+ ", course=" + course+", year="+ year +
		"certificate=" + certificate + ", HallTicket=" + HallTicket +" ]";
}
}