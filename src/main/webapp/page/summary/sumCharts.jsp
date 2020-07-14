<%--
  Created by IntelliJ IDEA.
  User: zhuba
  Date: 2020/7/14
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据统计页面</title>
    <script src="../lib/layui/layui.js"></script>
    <link rel="stylesheet" href="../lib/layui/css/layui.css" media="all">
    <script type="text/javascript" src="../js/echarts.min.js"></script>
</head>
<body>
<div style="padding: 20px; background-color: #F2F2F2;">
    <div align="center">
        <div class="layui-card" style="text-align: center; display: inline-block; width: 45%;">
            <div class="layui-card-header">学历分布</div>
            <div class="layui-card-body">
                <center>
                    <div id="main" style="width: auto;height:400px;"></div>
                </center>
            </div>
        </div>
        <div class="layui-card" style="text-align: center; display: inline-block; width: 45%;">
            <div class="layui-card-header">地址分布</div>
            <div class="layui-card-body">
                <center>
                    <div id="pieCharts" style="width: auto;height:400px;"></div>
                </center>
            </div>
        </div>
    </div>
</div>
<div style="padding-left: 15px; padding-right: 15px; background-color: #F2F2F2;">
    <center>
        <div class="layui-card" style="text-align: center; display: inline-block; width: 90%;">
            <div class="layui-card-header"> 运营统计</div>
            <div class="layui-card-body">
                <center>
                    <div id="datasetCharts" style="width: 100%;height:400px;"></div>
                </center>
            </div>
        </div>
    </center>
</div>
<div style="padding-top: 20px; padding-left: 15px; padding-right: 15px; background-color: #F2F2F2;">
    <center>
        <div class="layui-card" style="text-align: center; display: inline-block; width: 90%;">
            <div class="layui-card-header">营收额统计</div>
            <div class="layui-card-body">
                <center>
                    <div id="lineCharts" style="width: 100%;height:400px;"></div>
                </center>
            </div>
        </div>
    </center>
</div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
    var pieCharts = echarts.init(document.getElementById("pieCharts"));
    var datasetCharts = echarts.init(document.getElementById("datasetCharts"));
    var lineCharts=echarts.init(document.getElementById("lineCharts"));
    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '学历'
        },
        tooltip: {},
        legend: {
            data: ['销量']
        },
        xAxis: {
            data: ["本科", "硕士", "博士", "其他"]
        },
        yAxis: {},
        series: [{
            name: '人数',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20]
        }]
    };
    var optionPie = {
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b}: {c} ({d}%)'
        },
        legend: {
            orient: 'vertical',
            left: 10,
            data: ['江苏省', '浙江省', '重庆市', '湖南省', '河北省']
        },
        series: [{
            name: '雇员地址',
            type: 'pie',
            radius: ['50%', '70%'],
            avoidLabelOverlap: false,
            label: {
                show: false,
                position: 'center'
            },
            emphasis: {
                label: {
                    show: true,
                    fontSize: '30',
                    fontWeight: 'bold'
                }
            },
            labelLine: {
                show: false
            },
            data: [{
                value: 335,
                name: '江苏省'
            },
                {
                    value: 310,
                    name: '浙江省'
                },
                {
                    value: 234,
                    name: '重庆市'
                },
                {
                    value: 135,
                    name: '湖南省'
                },
                {
                    value: 154,
                    name: '河北省'
                }
            ]
        }]
    };
    var datasetOption = {
        legend: {},
        tooltip: {},
        dataset: {
            source: [
                ['product', '2018', '2019', '2020'],
                ['运营成本', 74.3, 85.8, 93.7],
                ['人力成本', 83.1, 73.4, 55.1],
                ['营收额', 86.4, 65.2, 82.5],
                ['业务数', 72.4, 53.9, 47.6]
            ]
        },
        xAxis: {
            type: 'category'
        },
        yAxis: {},
        // Declare several bar series, each will be mapped
        // to a column of dataset.source by default.
        series: [{
            type: 'bar'
        },
            {
                type: 'bar'
            },
            {
                type: 'bar'
            }
        ]
    };
    var lineOption ={
        xAxis: {
            type: 'category',
            data: ['2014', '2015', '2016', '2017', '2018', '2019', '2020']
        },
        yAxis: {
            type: 'value'
        },
        series: [{
            data: [820.3, 932.8, 901.1, 934.2, 1290, 1330.2, 689.4],
            type: 'line'
        }]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
    pieCharts.setOption(optionPie);
    datasetCharts.setOption(datasetOption);
    lineCharts.setOption(lineOption);
</script>
</body>
</html>
