import java.util.Scanner;
class StudentInfo{
    String name;
    int roll;
    double marks;
    void display(){
        System.out.println("#-----Student Details----#");
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+roll);
        System.out.println("Marks:"+marks);
    }
}
public class Student{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        StudentInfo s1=new StudentInfo();
        System.out.println("#----Student One----#");
        System.out.print("Enter student one name:");
        s1.name=sc.nextLine();
        System.out.print("Enter Student one roll number:");
        s1.roll=sc.nextInt();
        System.out.print("Enter student one marks:");
        s1.marks=sc.nextDouble();
        sc.nextLine();
        StudentInfo s2=new StudentInfo();
        System.out.println("#----Student Two----#");
        System.out.print("Enter student two name:");
        s2.name=sc.nextLine();
        System.out.print("Enter Student two roll number:");
        s2.roll=sc.nextInt();
        System.out.print("Enter student two marks:");
        s2.marks=sc.nextDouble();
        s1.display();
        s2.display();
        sc.close();
    }

}