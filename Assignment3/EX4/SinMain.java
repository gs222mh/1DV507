package GS222MH_assign3.EX4;


import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;
import java.util.ArrayList;



public class SinMain {
    public static void main(String[] args) {
        // Create and Customize Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).build();
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
        chart.getStyler().setChartTitleVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSW);
        chart.getStyler().setMarkerSize(5);
        chart.setXAxisTitle("X-axis");
        chart.setYAxisTitle("Y-axis");


        //Add all point which match the funktion to the arraylist
        ArrayList<Double> yData = new ArrayList<Double>();
        for (double x = 0; x <= 2 * Math.PI; x = x + 0.001) {
            yData.add((1 + x / Math.PI) * Math.cos(x) * Math.cos(40 * x));
        }

        // Display scatter plot
        chart.addSeries("point", yData);
        new SwingWrapper(chart).displayChart();
    }
}
