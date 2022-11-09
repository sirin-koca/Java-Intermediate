package ControlStructures;

public class CompareStringsWithEquals {
    public static void main(String[] args) {
        String course1 = "Algorithms and Data Structures";
        String course2 = "Software Engineering";

        if(course1.equals(course2)){
            System.out.println("Same course");
        }
        else{
            System.out.println("Not same course");
        }

        boolean check = course1.equals(course2);
        if (check){
            System.out.println("If true show this: " + check);
        }
        else {
            System.out.println("If false show this: " + check);
        }

        int flag = course1.compareTo(course2);
        if(flag == 0){
            System.out.println("They are same");
        }
        else if(flag < 0){
            System.out.println(course1 + " starts with a letter that comes before " + course2);
        }
        else {
            System.out.println(course2 + " comes before " + course1);
        }
    }
}
