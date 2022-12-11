package com.excercise;

public class Student {
    // Data member
    String studentName;
    String studentId;
    Gender gender;
    double studentValue;

    Student(String inputStudentName, String inputStudentId){
        this.studentName = inputStudentName;
        this.studentId = inputStudentId;
    
    }

    void fillGender(Gender gender) {
        this.gender = gender;
       
    }

    // Method / behaviour

    void calculateIPK(double firstSem, double secSem, double thirdSem,
            double fourthSem, double fifthSem, double sixSem,
        double sevenSem, double eightSem)   {  

        this.studentValue = (firstSem + secSem + thirdSem + fourthSem + fifthSem + sixSem + sevenSem + eightSem  ) / 8;


    }

   

    void showStudentData(){
        System.out.println("Name : " + this.studentName +
        "\n" + "id : "+ this.studentId + "\n" +
        "Gender : "+this.gender.humanGender + "\n" +
        "Value : "+this.studentValue);
    }

}