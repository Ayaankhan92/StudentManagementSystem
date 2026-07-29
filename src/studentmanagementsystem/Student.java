package studentmanagementsystem;

public abstract class Student
{
    protected int studentId;
    protected String studentName;
    protected double totalMarks;

    public Student()
    {
        this.studentId=0;
        this.studentName="Unknown";
        this.totalMarks=0.0;
    }

    public Student(int studentId,String studentName,double totalMarks) throws InvalidMarksException
    {
        if(totalMarks<0 || totalMarks >100){
            throw new InvalidMarksException("Marks cannot be negative and cannot be greater than 100");
        }
        this.studentId=studentId;
        this.studentName=studentName;
        this.totalMarks=totalMarks;
    }

    public abstract String calculateGrade();

    public void displaydetails()
    {
        System.out.println("Student ID : "+studentId);
        System.out.println("Student Name : "+studentName);
        System.out.println("Total Marks : "+totalMarks);
    }

}

