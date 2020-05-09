package cn.asu.piechart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;

/**
 * @author Shieh
 */
public class PieChartImg {

    public static void main(String[] args) throws Exception {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("IPhone 5s", new Double(20));
        dataset.setValue("SamSung Grand", new Double(20));
        dataset.setValue("MotoG", new Double(40));
        dataset.setValue("Nokia Lumia", new Double(10));

        JFreeChart chart = ChartFactory.createPieChart(
                "Mobile Sales", // chart title
                dataset, // data
                true, // include legend
                true,
                false);

        File pieChart = new File("PieChart.jpeg");
        ChartUtilities.saveChartAsJPEG(pieChart, chart, 999, 666);
    }

}
