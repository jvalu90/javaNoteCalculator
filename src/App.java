import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner inputs = new Scanner(System.in).useLocale(Locale.US);
        float note, average, sum;
        int i, n;

        try {
            System.out.println("Please type the number of students");
            n = inputs.nextInt();
            sum = 0;

            for (i = 0; i < n; i++) {
                System.out.println("Type the student's grade" + Integer.toString(i + 1)); 
                note = inputs.nextFloat(); 
                sum += note;         
            }

            average = sum / n;

            System.out.println("The grade point average is: " + Double.toString(average));

        } catch(Exception ex) {

            System.out.println("An error has ocurred" + ex.getMessage());

        } finally {

            inputs.close();

        }

    }
}
