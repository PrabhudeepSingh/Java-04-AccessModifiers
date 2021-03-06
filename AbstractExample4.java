abstract class Person
{
  String name;
  int age;
}

class Student extends Person
{ 
  int rollno;
  int marks;

  Student(String name,int age,int rollno,int marks)
  {
     this.name=name;
     this.age=age;
     this.rollno=rollno;
     this.marks=marks;
     System.out.println(name+"   "+age+"    "+rollno+"   "+marks);
   }
}

class Teacher extends Person
{ 
  double salary;
  String subject;
 
  Teacher(String name,int age,double salary,String subject)
  {
     this.name=name;
     this.age=age;
     this.salary=salary;
     this.subject=subject;
     System.out.println(name+"   "+age+"    "+salary+"    "+"     "+subject);
  }
}

public class AbstractExample4
{

  public static void main(String[] args)
  {
    Teacher t=new Teacher("Durga",45,34000,"java");
    Student s=new Student("Durga",45,105,90);
  }
} //abstract class without constructor