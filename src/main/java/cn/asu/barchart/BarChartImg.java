package cn.asu.barchart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.*;

/**
 * @author Shieh
 */
public class BarChartImg {

    public static void main(String[] args) throws Exception {

        String fiat = "FIAT";
        String audi = "AUDI";
        String ford = "FORD";
        String speed = "Speed";
        String millage = "Millage";
        String userrating = "User Rating";
        String safety = "safety";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(1.0, fiat, speed);
        dataset.addValue(3.0, fiat, userrating);
        dataset.addValue(5.0, fiat, millage);
        dataset.addValue(5.0, fiat, safety);

        dataset.addValue(5.0, audi, speed);
        dataset.addValue(6.0, audi, userrating);
        dataset.addValue(10.0, audi, millage);
        dataset.addValue(4.0, audi, safety);

        dataset.addValue(4.0, ford, speed);
        dataset.addValue(2.0, ford, userrating);
        dataset.addValue(3.0, ford, millage);
        dataset.addValue(6.0, ford, safety);

        JFreeChart barChart = ChartFactory.createBarChart(
                "CAR USAGE STATIStICS",
                "Category", "Score",
                dataset, PlotOrientation.VERTICAL,
                true, true, false);
//        File f = new File("E:\\Desktop\\JFreeChartDemo\\src\\main/q.png");//绝对路径
        File f = new File("q.png");
//        ChartUtilities.saveChartAsJPEG(f, barChart, 522, 60);
        ChartUtilities.saveChartAsPNG(f, barChart, 666, 999);
    }

}
