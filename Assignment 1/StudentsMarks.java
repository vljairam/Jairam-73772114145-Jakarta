import java.util.Scanner;
class Student{
    String name;
    int regNo;
    String dept;
    int year;
    String semester;
    int mark1,mark2,mark3,mark4,mark5,mark6,total;
    float average;
    void getDetails(){
        Scanner obj = new Scanner(System.in);
        this.name = obj.next();
        this.regNo = obj.nextInt();
        this.dept = obj.next();
        this.year = obj.nextInt();
        this.semester = obj.next();
        this.mark1 = obj.nextInt();
        this.mark2 = obj.nextInt();
        this.mark3 = obj.nextInt();
        this.mark4 = obj.nextInt();
        this.mark5 = obj.nextInt();
        this.mark6 = obj.nextInt();
        this.total = mark1+mark2+mark3+mark4+mark5+mark6;
        this.average = total/6;
    }
    void Display(){
        System.out.println("Name :"+name);
        System.out.println("Register Number :"+regNo);
        System.out.println("Department :"+dept);
        System.out.println("Year :"+year);
        System.out.println("Semester :"+semester);
        System.out.println("Total mark :"+total);
        System.out.println("Average mark :"+average+"%");
    }
}

public class StudentsMarks {
	public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.Display();
    }
}
