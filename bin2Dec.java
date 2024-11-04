import java.util.Scanner;


public class bin2Dec {


    public static void main(String[] args) throws BinaryFormatException {

        System.out.print("Enter binary string: ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String userBinaryString = myObj.nextLine();  // Ask user for binary string

        try {
            int decimalValue = Integer.parseInt(userBinaryString, 2);
            // Print decimal value
            System.out.println(decimalValue);

        }
        catch (NumberFormatException e) {
            throw new BinaryFormatException("This string is not a binary string.", e);
        }

    }
}