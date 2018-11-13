import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Double> dataSet = new ArrayList<Double>();
        boolean x = false;
        double mean = 0, sum = 0, sd;
        String input = null;

        while (!x) {
            System.out.println("Enter next number or e to calculate");
            System.out.println("Input: ");
            input = reader.next();
            if (!input.contains("e")) {
                dataSet.add(Double.parseDouble(input));
            } else if (input.equals("e")) {
                x = true;
                reader.close();
            } else { System.out.println("You did a bad"); }
        }
        for (Double data: dataSet) {
            mean += data;
        }
        mean = mean/dataSet.size();
        for (Double data: dataSet) {
            sum += (mean-data)*(mean-data);
            System.out.println(sum);
        }
        sd = Math.sqrt(sum/(dataSet.size()-1));
        System.out.println("Standard Deviation: " + sd);
    }
}
