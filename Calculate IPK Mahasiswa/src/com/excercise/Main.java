package com.excercise;

public class Main {
    public static void main(String[] args) {
            Student firstStudent = new Student("Budiman",   "1612000004");
            Gender men = new Gender("Men");
            Gender women = new Gender("Women");
            

            // Use gender object from Gender class
            firstStudent.calculateIPK(3.50, 3.25, 3.4, 3.2, 3.8, 3.5, 3.4, 3.7);
            firstStudent.fillGender(men);

            if(firstStudent.studentValue >= 3.8) {
                System.out.println("Congratulation " + firstStudent.studentName + "\n" +
                "Value : "+firstStudent.studentValue + "\n" + 
                "You got : A");
            } else {
                System.out.println("Sorry " + firstStudent.studentName + "\n" + 
                "Your value : "+ firstStudent.studentValue);
            }

      
    }
}