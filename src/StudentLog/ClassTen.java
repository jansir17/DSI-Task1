package StudentLog;

public class ClassTen extends Student {

    static int getClassTenTotalDaysTaught=0;
    static double getClassTenTotalEarnings=0;
    static double getClassEightAvgMark=0;

    public ClassTen(String studentName, double avgMark,int totalDaysTaught, int totalEarnings)
    {
        super(studentName,avgMark,totalDaysTaught,totalEarnings);
    }
    public ClassTen(){}

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
        getClassEightAvgMark=getClassEightAvgMark+avgMark;
        super.setAvgMark(avgMark);
    }
    public void setTotalDaysTaught(int totalDaysTaught){
        getClassTenTotalDaysTaught++;
        super.setTotalDaysTaught(totalDaysTaught);
    }
    public void setTotalEarnings(int totalEarnings){
        getClassTenTotalEarnings=getClassTenTotalEarnings+totalEarnings;
        super.setTotalEarnings(totalEarnings);
    }

    public String toString(){
        return "Student Name: "+this.getStudentName()+", Average Mark: "+this.getAvgMark()+", Total days Taught: "+this.getTotalDaysTaught()+", Total Earnings: "+this.getTotalEarnings()+".";
    }
}
