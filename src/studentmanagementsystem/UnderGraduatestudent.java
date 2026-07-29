package studentmanagementsystem;

public class UnderGraduatestudent extends Student implements scholarship
{
    private int creditHours;

    public UnderGraduatestudent()
    {
        super();
        this.creditHours=0;
    }

    public UnderGraduatestudent(int studentId,String studentName,double totalMarks,int creditHour) throws InvalidMarksException
    {
        super(studentId,studentName,totalMarks);
        this.creditHours=creditHours;
    }

    public String calculateGrade()
    {
        if(totalMarks > 80) return "A";
        else if(totalMarks > 70) return "B";
        else if (totalMarks>60) return "C";
        else return "F";
    }
    public double calculatedScholarshipamount()
    {
        return totalMarks * creditHours;
    }

    public void printScholarshipdetail()
    {
        System.out.println("Credit Hours :"+creditHours);
    }

    public void displaydetials()
    {
        super.displaydetails();
        System.out.println("Credit Hours :"+creditHours);
    }


}
