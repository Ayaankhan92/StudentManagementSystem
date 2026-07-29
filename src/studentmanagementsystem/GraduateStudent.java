package studentmanagementsystem;

public class GraduateStudent extends Student implements scholarship
{
    private int researchScore;

    public GraduateStudent()
    {
        super();
        this.researchScore=0;
    }

    public GraduateStudent(int studentId,String studentName,double totalMarks,int researchScore) throws InvalidMarksException
    {
        super(studentId,studentName,totalMarks);
        this.researchScore=researchScore;
    }

    public String calculateGrade()
    {
        if(totalMarks + researchScore > 150) return "A";
        else if(totalMarks + researchScore > 100) return "B";
        else if(totalMarks + researchScore > 50) return "C";
        else return "F";
    }

    public double calculatedScholarshipamount()
    {
        return (totalMarks + researchScore)*10;
    }

    public void printScholarshipdetail()
    {
        System.out.println("Research Score :"+researchScore);
    }

    public void displaydetails()
    {
        super.displaydetails();
        System.out.println("Research Score :"+researchScore);
    }
}

