package GS222MH_assign3.EX4;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BarpiaChart {
    public static void main(String[] args) throws FileNotFoundException {
        // Create Chart
        PieChart chart = new PieChartBuilder().width(800).height(600).title(BarpiaChart.class.getSimpleName()).build();

        // Customize Chart
        Color[] sliceColors = new Color[]{new Color(10, 68, 14), new Color(40, 105, 62), new Color(70, 143, 110), new Color(110, 180, 159), new Color(130, 199, 182),
                new Color(170, 68, 14), new Color(200, 68, 14), new Color(39, 68, 14), new Color(133, 68, 14), new Color(66, 68, 14)};
        chart.getStyler().setSeriesColors(sliceColors);

        //ArrayList, read the file and add all integer to arrayList

        ArrayList<Integer> num = new ArrayList<Integer>();
        File integer = new File("/home/ghayth/Desktop/integers.dat");
        Scanner text = new Scanner(integer);
        while (text.hasNextLine()) {
            int word = Integer.parseInt(text.nextLine());
            num.add(word);
        }
        double one = 0;
        double two = 0;
        double three = 0;
        double four = 0;
        double five = 0;
        double six = 0;
        double seven = 0;
        double eight = 0;
        double nine = 0;
        double ten = 0;

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

        // Series
        chart.addSeries("<10", one / 100);
        chart.addSeries("<20", two / 100);
        chart.addSeries("<30", three / 100);
        chart.addSeries("<40", four / 100);
        chart.addSeries("<50", five / 100);
        chart.addSeries("<60", six / 100);
        chart.addSeries("<70", seven / 100);
        chart.addSeries("<80", eight / 100);
        chart.addSeries("<90", nine / 100);
        chart.addSeries("<100", ten / 100);
        new SwingWrapper<PieChart>(chart).displayChart();
    }

}
