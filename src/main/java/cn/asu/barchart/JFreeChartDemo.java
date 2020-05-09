package cn.asu.barchart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Test;

import java.awt.Font;
import java.io.FileOutputStream;

/**
 * @author Shieh
 */
public class JFreeChartDemo {

    /**
     * 生成柱状图
     *
     * @throws Exception
     */
    @Test
    public void barChart() throws Exception {
        // 1、声明数据集对象，添加对象
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        // dcd.addValue(指具体数据，只对应的语言，指对应语言的分类)
        dcd.addValue(500, "c", "language");
        dcd.addValue(666, "java", "language");
        dcd.addValue(222, "python", "language");
        // 2、通过工厂对象生成图形
        // ChartFactory.createBarChart(图表的名称，横轴名称x，纵轴名称y，数据集，图表方向，是否生成图例，是否生成工具，是否生成url连接)
        // PlotOrientation.VERTICAL图表垂直方向，PlotOrientation.HORIZONTAL水平方向
        JFreeChart jc = ChartFactory.createBarChart("title", "x", "y", dcd,
                PlotOrientation.VERTICAL,
                true,
                false, false);
        // 3、中文乱码
        // 4、构建输出流
        FileOutputStream fos = new FileOutputStream("img/BarChart.png");
        // 5、通过工具类进行输出写入
        //ChartUtilities.writeChartAsPNG(输出流，JFreeChart，宽，高)
        ChartUtilities.writeChartAsPNG(fos, jc, 500, 500);
    }

    /**
     * 生成柱状图-3D
     *
     * @throws Exception
     */
    @Test
    public void barChart3D() throws Exception {
        // 1、声明数据集对象，添加对象
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        // dcd.addValue(指具体数据，只对应的语言，指对应语言的分类)
        dcd.addValue(500, "c", "language");
        dcd.addValue(666, "java", "language");
        dcd.addValue(222, "python", "language");
        // 2、通过工厂对象生成图形
        // ChartFactory.createBarChart(图表的名称，横轴名称x，纵轴名称y，数据集，图表方向，是否生成图例，是否生成工具，是否生成url连接)
        // PlotOrientation.VERTICAL图表垂直方向，PlotOrientation.HORIZONTAL水平方向
        JFreeChart jc = ChartFactory.createBarChart3D("title", "x", "y", dcd,
                PlotOrientation.VERTICAL,
                true,
                false, false);
        // 3、中文乱码
        // 4、构建输出流
        FileOutputStream fos = new FileOutputStream("img/BarChart-3D.png");
        // 5、通过工具类进行输出写入
        //ChartUtilities.writeChartAsPNG(输出流，JFreeChart，宽，高)
        ChartUtilities.writeChartAsPNG(fos, jc, 500, 500);
    }

    /**
     * 生成柱状图-3D-中文处理
     *
     * @throws Exception
     */
    @Test
    public void barChart3D_zh() throws Exception {
        // 1、声明数据集对象，添加对象
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        // dcd.addValue(指具体数据，只对应的语言，指对应语言的分类)
        dcd.addValue(500, "c语言", "语言");
        dcd.addValue(666, "java", "language");
        dcd.addValue(222, "python", "language");
        // 2、通过工厂对象生成图形
        // ChartFactory.createBarChart(图表的名称，横轴名称x，纵轴名称y，数据集，图表方向，是否生成图例，是否生成工具，是否生成url连接)
        // PlotOrientation.VERTICAL图表垂直方向，PlotOrientation.HORIZONTAL水平方向
        JFreeChart jc = ChartFactory.createBarChart3D("标题", "x横轴", "y纵轴", dcd,
                PlotOrientation.VERTICAL,
                true,
                false, false);
        // 3、中文乱码
        CategoryPlot categoryplot = (CategoryPlot) jc.getPlot();
        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        CategoryAxis domainAxis = categoryplot.getDomainAxis();
        TextTitle textTitle = jc.getTitle();
        textTitle.setFont(new Font("黑体", Font.PLAIN, 20));
        domainAxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 11));
        domainAxis.setLabelFont(new Font("宋体", Font.PLAIN, 12));
        numberaxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 12));
        numberaxis.setLabelFont(new Font("黑体", Font.PLAIN, 12));
        // 4、构建输出流
        FileOutputStream fos = new FileOutputStream("img/BarChart-3D-zh.png");
        // 5、通过工具类进行输出写入
        //ChartUtilities.writeChartAsPNG(输出流，JFreeChart，宽，高)
        ChartUtilities.writeChartAsPNG(fos, jc, 500, 500);
    }

}
