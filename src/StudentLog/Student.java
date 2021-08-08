package StudentLog;

public abstract class Student {
    private String studentName;
    private Classes classType;
    private String subjectType;
    private double avgMark=0;
    private int totalDaysTaught=0;
    private double totalEarnings=0;

    public Student(String studentName, double avgMark,int totalDaysTaught,double totalEarnings)
    {
        this.studentName=studentName;
        this.avgMark=avgMark;
        this.totalDaysTaught=totalDaysTaught;
        this.totalEarnings=totalEarnings;
    }

    public Student(){}

    public String getStudentName(){
        return this.studentName;
    }
    public String getSubjectType(){
        return this.subjectType;
    }
    public Classes getClassType(){
        return this.classType;
    }
    public double getAvgMark(){
        return this.avgMark;
    }
    public int getTotalDaysTaught(){

        return this.totalDaysTaught;
    }
    public double getTotalEarnings(){
        return this.totalEarnings;
    }



    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setSubjectType(String subjectType)
    {
        this.subjectType=subjectType;
    }
    public void setClassType(Classes classType){
        this.classType=classType;
    }
    public void setAvgMark(double avgMark){
        this.avgMark=avgMark;
    }
    public void setTotalDaysTaught(int totalDaysTaught){
        this.totalDaysTaught=totalDaysTaught;
    }
    public void setTotalEarnings(int totalEarnings){
        this.totalEarnings=totalEarnings;
    }



    public String toString(){
        return "Student Name: "+this.getStudentName()+" ,Average Mark "+this.getAvgMark()+" , Total days Taught "+this.getTotalDaysTaught()+" total Earnings "+this.getTotalEarnings()+" ";
    }
}
