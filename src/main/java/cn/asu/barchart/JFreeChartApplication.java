package cn.asu.barchart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.awt.*;

/**
 * @author Shieh
 */
public class JFreeChartApplication extends ApplicationFrame {

    /**
     * Constructs a new application frame.
     *
     * @param title the frame title.
     */
    public JFreeChartApplication(String applicationTitle, String title) {
        super(applicationTitle);
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        // dcd.addValue(指具体数据，只对应的语言，指对应语言的分类)
        dcd.addValue(500, "java", "oho");
        dcd.addValue(666, "jav", "oh");
        dcd.addValue(222, "ja", "o");
        JFreeChart jc = ChartFactory.createBarChart(title, "x", "y", dcd,
                PlotOrientation.VERTICAL,
                true,
                true, false);
        ChartPanel cp = new ChartPanel(jc);
        cp.setPreferredSize(new Dimension(500, 600));
        setContentPane(cp);
    }

    public static void main(String[] args) {
        JFreeChartApplication chart = new JFreeChartApplication("条形图", "Which car do you like?");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }
}
//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/jfreechart/jfreechart_bar_chart.html