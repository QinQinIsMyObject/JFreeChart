package cn.asu.piechart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.junit.Test;

import java.awt.*;
import java.io.FileOutputStream;

/**
 * @author Shieh
 */
public class PieChartDemo {

    /**
     * 生成饼状图
     */
    @Test
    public void PieChart() throws Exception {
        // 1、声明数据集对象，添加对象
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue("java", 600);
        dpd.setValue("js", 500);
        dpd.setValue("python", 999);
        // 2、通过工厂对象生成图形
        JFreeChart jc = ChartFactory.createPieChart("lan", dpd, true, false, false);
        // 3、中文乱码
        // 4、构建输出流
        FileOutputStream fos=new FileOutputStream("img/PieChart.png");
        // 5、通过工具类进行输出写入
        ChartUtilities.writeChartAsPNG(fos, jc, 666, 666);
    }

    /**
     * 生成饼状图-3D
     */
    @Test
    public void PieChart3D() throws Exception {
        // 1、声明数据集对象，添加对象
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue("java", 600);
        dpd.setValue("js", 500);
        dpd.setValue("python", 999);
        // 2、通过工厂对象生成图形
        JFreeChart jc = ChartFactory.createPieChart3D("lan", dpd, true, false, false);
        // 3、中文乱码
        // 4、构建输出流
        FileOutputStream fos=new FileOutputStream("img/PieChart-3D.png");
        // 5、通过工具类进行输出写入
        ChartUtilities.writeChartAsPNG(fos, jc, 666, 666);
    }

    /**
     * 生成饼状图-3D-zh
     */
    @Test
    public void PieChart3D_zh() throws Exception {
        // 1、声明数据集对象，添加对象
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue("java", 600);
        dpd.setValue("js", 500);
        dpd.setValue("python", 999);
        // 2、通过工厂对象生成图形
        JFreeChart jc = ChartFactory.createPieChart3D("语言使用率", dpd, true, false, false);
        // 3、中文乱码
        PiePlot3D plot=(PiePlot3D)jc.getPlot();
        plot.setLabelFont(new Font("黑体", Font.PLAIN, 20));
        TextTitle textTitle=jc.getTitle();
        textTitle.setFont(new Font("黑体", Font.PLAIN, 20));
        // 4、构建输出流
        FileOutputStream fos=new FileOutputStream("img/PieChart-3D-zh.png");
        // 5、通过工具类进行输出写入
        ChartUtilities.writeChartAsPNG(fos, jc, 666, 666);
    }
}
