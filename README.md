# 项目说明
## 1、主要功能
	基于JFreeChart完成柱状图和饼状图的生成。
## 2、主要知识点
### 常见的图表工具(报表组件)
	FineReport(帆软)、Sap(水晶报表)、用友华表、JFreeChart(开源免费)等。
### JFreeChart概述
#### 作用：
	主要用来生成各种各样的图表，包括：饼图、柱状图(普通柱状图以及堆栈柱状图)、线图、区域图、分布图、混合图、甘特图及一些仪表盘等。
#### 官网：http://www.jfree.org/
### JFreeChart生成常见图表步骤和常见API
#### 柱状图生成
##### 主要API
	DefaultCategoryDataset：数据集对象
	ChartFactory：图表工厂对象
		createBarChart()方法：常见柱状图
	ChartUtilities：工具类
		writeChartASPNG()方法：写入
##### 柱状图生成主要步骤
	(1)声明数据集对象，添加数据；
	(2)通过工厂对象创建图像并设置参数；
	(3)中文乱码问题【可选】；
	(4)构建文件输出流；
	(5)通过工具类输出写入。
#### 饼状图
##### 主要API
    DefaultPieDataset：饼状图数据集对象
    ChartFactory：图表工厂对象
    		createPieChart()方法：创建饼状图
    		createPieChart3D()方法：创建3D饼状图
    ChartUtilities：工具类
    		writeChartASPNG()方法：写入
##### 生成步骤和柱状图一致
#### 柱状图中文乱码
```
CategoryPlot categoryplot = (CategoryPlot) jc.getPlot();
NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
CategoryAxis domainAxis = categoryplot.getDomainAxis();
TextTitle textTitle = jc.getTitle();
textTitle.setFont(new Font("黑体", Font.PLAIN, 20));
domainAxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 11));
domainAxis.setLabelFont(new Font("宋体", Font.PLAIN, 12));
numberaxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 12));
numberaxis.setLabelFont(new Font("黑体", Font.PLAIN, 12));
```
#### 饼状图中文乱码
```
PiePlot3D plot=(PiePlot3D)jc.getPlot();
plot.setLabelFont(new Font("黑体", Font.PLAIN, 20));
TextTitle textTitle=jc.getTitle();
textTitle.setFont(new Font("黑体", Font.PLAIN, 20));
```
## 3、说明
    大部分代码来源【易百教程】
## 4、出错

## 附加
    易白教程之JFreeChart：https://www.yiibai.com/jfreechart