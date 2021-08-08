package StudentLog;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static Scanner scanner=new Scanner(System.in);
    public static int classType;
    public static String subjectType;

    public static Classes checkClassType(int classType){
        if(classType==8)
        {return Classes.eight;}
        else if(classType==9)
        {return Classes.nine;}
        else if(classType==10)
        {return Classes.ten;}
        else
        {
            System.out.println("You have entered an invalid class number "+classType+", pls Enter form 8-10");
            classType=scanner.nextInt();
            return checkClassType(classType);
        }
    }

    public static Student classEightStudent(ClassEight classEight)
    {
        System.out.println("Enter the Student Name");
        classEight.setStudentName(scanner.next());
        System.out.println("Enter the Class Number");
        classType=scanner.nextInt();
        classEight.setClassType(checkClassType(classType));
        System.out.println("Enter Which Subject You Teach, English/ Bangla/ Math ?");
        subjectType=scanner.next();
        if(subjectType.equalsIgnoreCase("English") || subjectType.equalsIgnoreCase("Bangla") || subjectType.equalsIgnoreCase("Math"))
        {
            classEight.setSubjectType(subjectType);
        }
        else{
            System.out.println("You've Entered unknown type of SUBJECT pls Enter again");
            System.out.println();
            return classEight;
        }
        System.out.println("Enter Average Mark of the Student");
        classEight.setAvgMark(scanner.nextDouble());
        System.out.println("Enter Total Days taught");
        classEight.setTotalDaysTaught(scanner.nextInt());
        System.out.println("Enter Total Earnings");
        classEight.setTotalEarnings(scanner.nextInt());
        return classEight;
    }

    public static Student classNineStudent(ClassNine classNine)
    {
        System.out.println("Enter the Student Name");
        classNine.setStudentName(scanner.next());
        System.out.println("Enter the Class Number");
        classType=scanner.nextInt();
        classNine.setClassType(checkClassType(classType));
        System.out.println("Enter Average Mark of the Student");
        classNine.setAvgMark(scanner.nextDouble());
        System.out.println("Enter Total Days taught");
        classNine.setTotalDaysTaught(scanner.nextInt());
        System.out.println("Enter Total Earnings");
        classNine.setTotalEarnings(scanner.nextInt());
        return classNine;
    }

    public static Student classTenStudent(ClassTen classTen)
    {
        System.out.println("Enter the Student Name");
        classTen.setStudentName(scanner.next());
        System.out.println("Enter Average Mark of the Student");
        classTen.setAvgMark(scanner.nextDouble());
        System.out.println("Enter Total Days taught");
        classTen.setTotalDaysTaught(scanner.nextInt());
        System.out.println("Enter Total Earnings");
        classTen.setTotalEarnings(scanner.nextInt());
        return classTen;
    }

    public static void main(String []args)
    {
       boolean runProgram=true;
       boolean StudentNameFound=false;
       int inputValue;
       String removeStudentName;

       ArrayList<Student> studentArrayList=new ArrayList<>();

       while(runProgram)
       {
           System.out.println("""
                   Hello Teacher welcome to the Student Log System.\s
                   If you want to Add a New Student in your log, Enter: 1.\s
                   If you want to Edit any Specific Student, Enter: 2.\s
                   If you want to Delete any specific Student, Enter: 3.\s
                   If You want to Display a lists of Students, Enter: 4.\s
                   If you want to Display overall info about student log,Enter: 5.\s
                   If nothing you want pls, Exit immediately, Enter 6""");
           inputValue=scanner.nextInt();
           System.out.println();
           System.out.println();
           switch (inputValue)
           {
               //Adding A Student Details
               case 1:

                   System.out.println("Enter class no to add a student: Enter 8 for class-eight or 9 for class-nine or 10 for class ten \n");
                   classType=scanner.nextInt();
                   if(classType==8)
                   {
                       ClassEight classEight=new ClassEight();
                       studentArrayList.add(classEightStudent(classEight));
                   }
                   else if(classType==9)
                   {
                       ClassNine classNine=new ClassNine();
                       studentArrayList.add(classNineStudent(classNine));
                   }
                   else if(classType==10)
                   {
                       ClassTen classTen=new ClassTen();
                       studentArrayList.add(classTenStudent(classTen));
                   }
                   else{
                       System.out.println("Wrong type of Class Selection");
                   }
                   continue;

                   //Editing a specific Student Taught and Mark;
               case 2:

                   if(studentArrayList.isEmpty())
                   {
                       System.out.println("There ain't nay Student Data right now");
                   }
                   else {
                       System.out.println("Enter the name of the student");
                       removeStudentName = scanner.next();
                       System.out.println("Enter how many number of days you wanna ADD");
                       int addingDays = scanner.nextInt();
                       System.out.println("Enter how many Marks you want to add");
                       double addingMark = scanner.nextInt();
                       StudentNameFound = false;
                       for (Student studentNameCheck : studentArrayList) {
                           if (studentNameCheck.getStudentName().equalsIgnoreCase(removeStudentName)) {
                               StudentNameFound = true;
                               int currentDaysTaught = studentNameCheck.getTotalDaysTaught();
                               currentDaysTaught = currentDaysTaught + addingDays;
                               studentNameCheck.setTotalDaysTaught(currentDaysTaught);
                               double currentAvgMark = studentNameCheck.getAvgMark();
                               currentAvgMark = currentAvgMark + addingMark;
                               studentNameCheck.setAvgMark(currentAvgMark);
                           }
                           break;
                       }
                   }
                   if(!StudentNameFound)
                   {
                       System.out.println("Student is not in the LOG");
                       System.out.println();
                   }
                   break;


                   // Deleting a Specific Student
               case 3:
                   if(studentArrayList.isEmpty())
                   {
                       System.out.println("There ain't nay Student Data right now");
                       System.out.println();
                   }
                   else {
                       System.out.println("Enter the name of the student");
                       removeStudentName = scanner.next();
                       StudentNameFound = false;
                       for (Student studentNameCheck : studentArrayList) {
                           if (studentNameCheck.getStudentName().equalsIgnoreCase(removeStudentName)) {
                               StudentNameFound = true;
                               studentArrayList.remove(studentNameCheck);
                               System.out.println("Student of " + studentNameCheck + " has been removed");
                               System.out.println();
                               break;
                           }
                       }
                   }
                   if(!StudentNameFound)
                   {
                       System.out.println("The Name is not in the LOG");
                       System.out.println();
                   }
                   break;

                   //Display a list of Students Individual
               case 4:

                   if(studentArrayList.isEmpty())
                   {
                       System.out.println("There ain't nay Student Data right now");
                   }
                   else {
                       System.out.println("Enter 1 to see Specific class Log or Enter 2 to see particular Student details");
                       int i = scanner.nextInt();
                       if (i == 1) {
                           System.out.println("Which class Log you want ? Enter");
                           classType = scanner.nextInt();
                           boolean classTypeBoolean = false;
                           if (classType == 8) {
                               for (Student st : studentArrayList) {
                                   if (st instanceof ClassEight) {
                                       System.out.println(st);
                                   }
                               }
                               classTypeBoolean = true;
                           } else if (classType == 9) {
                               for (Student st : studentArrayList) {
                                   if (st instanceof ClassNine) {
                                       System.out.println(st);
                                   }
                               }
                               classTypeBoolean = true;
                           } else if (classType == 10) {
                               for (Student st : studentArrayList) {
                                   if (st instanceof ClassEight) {
                                       System.out.println(st);
                                   }
                               }
                               classTypeBoolean = true;
                           }
                           if (!classTypeBoolean) {
                               System.out.println("Pls enter the correct class Number");
                           }
                       } else if (i == 2)
                       {
                           System.out.println("Enter the name of the student you want details of");
                           removeStudentName = scanner.next();
                           StudentNameFound = false;
                           for (Student studentNameCheck : studentArrayList)
                           {
                               if (studentNameCheck.getStudentName().equalsIgnoreCase(removeStudentName))
                               {
                                   StudentNameFound = true;
                                   System.out.println(studentNameCheck);
                                   break;
                               }
                           }
                       }
                       else
                           System.out.println("invalid input number");
                   }
                       if (!StudentNameFound) {
                           System.out.println("Student is not in the LOG");
                           System.out.println();
                       }
                   System.out.println();
                   break;


                   //Display Overall info of Student LOG
               case 5:

                   if(studentArrayList.isEmpty())
                   {
                       System.out.println("There ain't nay Student Data right now");
                       System.out.println();
                       break;
                   }
                   else {
                       System.out.println("Total Days Taught Across all Classes: ");
                       System.out.println(ClassEight.getClassEightTotalDaysTaught + ClassNine.getClassNineTotalDaysTaught + ClassTen.getClassTenTotalDaysTaught);
                       System.out.println("Individual Days taught in Each Class");
                       System.out.println("class 8: " + ClassEight.getClassEightTotalDaysTaught + ", class 9: " + ClassNine.getClassNineTotalDaysTaught + ", In Class 10 :" + ClassTen.getClassTenTotalDaysTaught);
                       System.out.println("Total Earnings");
                       System.out.println(ClassEight.getClassEightTotalEarnings + ClassNine.getClassNineTotalEarnings + ClassTen.getClassTenTotalEarnings);
                       System.out.println("Individual Earning of Each classes are");
                       System.out.println("Class 8: " + ClassEight.getClassEightTotalEarnings + "Class 9: " + ClassNine.getClassNineTotalEarnings + " Class 10: " + ClassTen.getClassTenTotalEarnings);
                       System.out.println("Average marks of all Student");
                       System.out.println((ClassEight.getClassEightAvgMark + ClassNine.getClassNineAvgMark + ClassTen.getClassEightAvgMark) / 3);
                       System.out.println();
                   }
                   break;

               case 6:
                   System.out.println("Existing from the system");
                   runProgram=false;
                   break;

               default:
                   System.out.println("you do not have permission to see log..!!!!!!");
           }
       }
    }
}