import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of Asylum patients who escaped: ");
        int numOfPatients = scanner.nextInt();
        
        System.out.print("Enter the number of steps taken by the first patient: ");
        int stepsOfFirstPatient = scanner.nextInt();
        
        int totalSteps = findNumOfStepsRequired(numOfPatients, stepsOfFirstPatient);
        System.out.println("Total steps required for Batman to catch all patients in one go: " + totalSteps);
    }

public static int findNumOfStepsRequired(int numOfPatients, int startStep) {
    return numOfPatients * startStep;       
}

}
