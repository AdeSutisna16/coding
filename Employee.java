public class Employee
{
public String getName() 
{
Systerr.out.println("Employee Name:" +name);
return name;
}
public static void main(string[] args)
{
person ref;
Student Studentobject = new Student();
Employee Employeeobject = new Employee();

ref = studentObject; //Person menunjuk kepada object Student
String temp = ref.getName(); //qetName dari Student class
//dipanggil

System.out.println(temp);
ref = employeeObject; //Person menunjuk kepada object Employee
temp = ref.getName(); //qetName dari Employee class dipanggil
System . out . println(temp) ;
}
}
