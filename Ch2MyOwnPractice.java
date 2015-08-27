
package ch2myownpractice;

/**
 *
 * @author Zachary
 */
public class Ch2MyOwnPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hoursWorked;
        byte payRate;
        int grossPay;
        long paidTimeOff;
        
        hoursWorked = 32;
        payRate = (byte) 8.25;
        grossPay = hoursWorked * payRate;
        paidTimeOff = 20;
        System.out.println("You have worked  " + hoursWorked +
                " hours for a pay rate of $ " + payRate + "  per hour.");
        System.out.println("Your gorss pay is $ " + grossPay);
        System.out.println("Your PTO Balance is " + paidTimeOff + " hours");
        System.out.println("You will receive another email regarding your net pay.");
   }
    
}
