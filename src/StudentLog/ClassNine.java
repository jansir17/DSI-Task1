package StudentLog;

public class ClassNine extends Student {

    static int getClassNineTotalDaysTaught=0;
    static double getClassNineTotalEarnings=0;
    static double getClassNineAvgMark=0;

    public ClassNine(String studentName, double avgMark,int totalDaysTaught, int totalEarnings)
    {
        super(studentName,avgMark,totalDaysTaught,totalEarnings);
    }
    public ClassNine(){}

    public String getStudentName(){
        return super.getStudentName();
    }
    public String getSubjectType(){
        return super.getSubjectType();
    }
    public Classes getClassType(){
        return super.getClassType();
    }
    public double getAvgMark(){
        return super.getAvgMark();
    }
    public int getTotalDaysTaught(){
        return super.getTotalDaysTaught();
    }
    public double getTotalEarnings(){
        return super.getTotalEarnings();
    }



    public void setStudentName(String studentName){
        super.setStudentName(studentName);
    }
    public void setSubjectType(String subjectType)
    {
        super.setSubjectType(subjectType);
    }
    public void setClassType(Classes classType){
        super.setClassType(classType);
    }
    public void setAvgMark(double avgMark){
        getClassNineAvgMark=getClassNineAvgMark+avgMark;
        super.setAvgMark(avgMark);
    }
    public void setTotalDaysTaught(int totalDaysTaught){
        getClassNineTotalDaysTaught++;
        super.setTotalDaysTaught(totalDaysTaught);
    }
    public void setTotalEarnings(int totalEarnings){
        getClassNineTotalEarnings=getClassNineTotalEarnings+totalEarnings;
        super.setTotalEarnings(totalEarnings);
    }

    public String toString(){
        return "Student Name: "+this.getStudentName()+", Average Mark: "+this.getAvgMark()+", Total days Taught: "+this.getTotalDaysTaught()+", Total Earnings: "+this.getTotalEarnings()+".";
    }
}
