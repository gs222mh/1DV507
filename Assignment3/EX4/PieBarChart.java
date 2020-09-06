package GS222MH_assign3.EX4;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PieBarChart {
    public static void main(String[] args) throws FileNotFoundException {
        //Create the windows and the title
        CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Integer Bar Chart").xAxisTitle("Intervals").yAxisTitle("Count").build();
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.getStyler().setHasAnnotations(true);

        //ArrayList, read the file and add all integer to arrayList
        ArrayList<Integer> num = new ArrayList<Integer>();
        File integer = new File("/home/ghayth/Desktop/integers.dat");
        Scanner text = new Scanner(integer);
        while (text.hasNextLine()) {
            int word = Integer.parseInt(text.nextLine());
            num.add(word);
        }
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;

        //look for each element and set if it is smaller than 10 or 20 ..
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) < 10) {
                one++;
            } else if (num.get(i) < 20) {
                two++;
            } else if (num.get(i) < 30) {
                three++;
            } else if (num.get(i) < 40) {
                four++;
            } else if (num.get(i) < 50) {
                five++;
            } else if (num.get(i) < 60) {
                six++;
            } else if (num.get(i) < 70) {
                seven++;
            } else if (num.get(i) < 80) {
                eight++;
            } else if (num.get(i) < 90) {
                nine++;
            } else if (num.get(i) < 100) {
                ten++;
            }
        }

        //Set the name and x & y.
        chart.addSeries("Integer Intervals", Arrays.asList(new String[]{"<10", "<20", "<30", "<40", "<50", "<60", "<70", "<80", "<90", "<100",}), Arrays.asList(new Integer[]{one, two, three, four, five, six, seven, eight, nine, ten}));
        new SwingWrapper<CategoryChart>(chart).displayChart();
    }
}
