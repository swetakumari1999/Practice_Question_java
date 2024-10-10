class Student {
    int rollno;
    String name;
    int marks;
}
public class OjectArray {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Sweta";
        s1.marks = 67;


        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Sweta kumari";
        s2.marks = 97;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Rohini kumari";
        s3.marks = 87;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name+" "+students[i].rollno);
        }

        for( Student stdu : students)
        {
            System.out.println(stdu.name+" "+stdu.rollno+" "+stdu.marks);
        }


    }
}

