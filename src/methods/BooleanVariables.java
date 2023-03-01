package methods;

public class BooleanVariables {
    public static void main(String[] args) {

/*
    if (some_condition) {
    return true;
    }
    return false;

*/
        boolean passedDATS2300 = true;
        boolean passedDAFE2200 = true;
        boolean passedDAPE1300 = true;

        boolean passedX = false;

        int counter = 0;

        if (passedDATS2300) {
            System.out.println("You have passed DATS2300: Algorithms and Datastructures!");
            counter++;
        }
        if (passedDAFE2200) {
            System.out.println("You have passed DAFE2200: Software Engineering!");
            counter++;
        }
        if (passedDAPE1300) {
            System.out.println("You have passed DAPE1300: Discrete Mathematics!");
            counter++;
        }
        if(passedX){
            System.out.println("You dont take this class.");
        }
        if (counter == 3){
            System.out.println("Congrats!");
        }

    }
}
