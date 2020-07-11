<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="css/font.css">
    <link rel="stylesheet" href="css/xadmin.css">
    <script type="text/javascript" src="lib/layui/layui.js"></script>
    <style type="text/css">
        .updateTitle {
            color: blue;
            font-style: italic;
        }
    </style>
</head>
<body>
<script>
    var currentDate = new Date(<%=new java.util.Date().getTime()%>);

    function run() {
        currentDate.setSeconds(currentDate.getSeconds() + 1);
        document.getElementById("dt").innerHTML = currentDate.toLocaleString();
    }

    window.setInterval("run();", 1000);
</script>
<div class="x-body layui-anim layui-anim-up">
    <blockquote class="layui-elem-quote">欢迎管理员：
        <span class="x-red">${sessionScope.user_session.username}</span>！ 当前时间:
        <div id="dt"></div>
    </blockquote>
    <fieldset class="layui-elem-field">
        <legend>数据统计</legend>
        <div class="layui-field-box">
            <div class="layui-col-md12">
                <div class="layui-card">
                    <div class="layui-card-body">
                        <div class="layui-carousel x-admin-carousel x-admin-backlog" lay-anim="" lay-indicator="inside"
                             lay-arrow="none" style="width: 100%; height: 90px;">
                            <div carousel-item="">
                                <ul class="layui-row layui-col-space10 layui-this">
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>管理员</h3>
                                            <p>
                                                <cite>${sessionScope.sumData.rootUserNum}</cite></p>
                                        </a>
                                    </li>
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>部门数</h3>
                                            <p>
                                                <cite>${sessionScope.sumData.deptNum}</cite></p>
                                        </a>
                                    </li>
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>职位数</h3>
                                            <p>
                                                <cite>${sessionScope.sumData.jobNum}</cite></p>
                                        </a>
                                    </li>
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>员工数</h3>
                                            <p>
                                                <cite>${sessionScope.sumData.employeeNum}</cite></p>
                                        </a>
                                    </li>
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>公告数</h3>
                                            <p>
                                                <cite>${sessionScope.sumData.noticeNum}</cite></p>
                                        </a>
                                    </li>
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>文档数</h3>
                                            <p>
                                                <cite>${sessionScope.sumData.documentNum}</cite></p>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </fieldset>
    <fieldset class="layui-elem-field">
        <legend>系统通知</legend>
        <div class="layui-field-box">
            <table class="layui-table" lay-skin="line">


                <div class="site-demo-button" id="layerDemo" style="margin-bottom: 0;">

                    <button data-method="notice" class="layui-btn">更新说明</button>
                </div>

            </table>
        </div>
    </fieldset>
    <fieldset class="layui-elem-field">
        <legend>更新日志</legend>
        <div class="layui-field-box">
            <table class="layui-table" lay-skin="line">
                <tbody>
                <tr>
                    <td>
                        <h4 class="updateTitle">2020.07.10 v0.0.3-release</h4>
                        <p>新增首页特效，Duang<br/>新增表单校验，检验数据的有效性</p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <h4 class="updateTitle">2020.07.06 v0.0.3</h4>
                        <p>新增用户个人信息修改<br/>调整拦截器配置，修复css、js等资源获取不到的问题<br/>主页可以查看个人信息了<br/>
                            管理员可以查看雇员的完整信息<br/>雇员支持手机登录了<br/>配色调整及动画优化
                        </p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <h4 class="updateTitle">2020.07.01 v0.0.2</h4>
                        <p>新增员工登录系统，鉴权，拦截器</p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <h4 class="updateTitle">2020.06.30 v0.0.1</h4>
                        <p>修复诸多问题，测试文档上传稳定性</p>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </fieldset>
    <fieldset class="layui-elem-field">
        <legend>系统信息</legend>
        <div class="layui-field-box">
            <table class="layui-table">
                <tbody>
                <tr>
                    <th>系统版本号</th>
                    <td>v0.0.3</td>
                </tr>
                <tr>
                    <th>服务器地址</th>
                    <td>http://47.98.249.115:8080/</td>
                </tr>
                <tr>
                    <th>操作系统</th>
                    <td>Ubuntu 16.0 LTS</td>
                </tr>
                <tr>
                    <th>运行环境</th>
                    <td>jdk 1.8及以上</td>
                </tr>
                <tr>
                    <th>MYSQL版本</th>
                    <td>8.0</td>
                </tr>
                <tr>
                    <th>上传附件限制</th>
                    <td>2M</td>
                </tr>
                <tr>
                    <th>执行时间限制</th>
                    <td>30s</td>
                </tr>
                <tr>
                    <th>剩余空间</th>
                    <td>/</td>
                </tr>
                </tbody>
            </table>
        </div>
    </fieldset>
    <fieldset class="layui-elem-field">
        <legend>开发团队</legend>
        <div class="layui-field-box">
            <table class="layui-table">
                <tbody>
                <tr>
                    <th>开发者</th>
                    <td><a href="https://github.com/paul623" class='x-a' target="_blank">paul623</a></td>
                </tr>
                <tr>
                    <th>组员</th>
                    <td>刘缘</td>
                </tr>
                <tr>
                    <th>组员</th>
                    <td>姜文</td>
                </tr>
                </tbody>
            </table>
        </div>
    </fieldset>
    <blockquote class="layui-elem-quote layui-quote-nm">感谢layui,jquery,本系统由paul623提供技术支持。</blockquote>
</div>
<script>
    layui.use('layer', function () { //独立版的layer无需执行这一句
        var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
        //触发事件
        var active = {
            notice: function () {
                //示范一个公告层
                layer.open({
                    type: 1
                    ,
                    title: false //不显示标题栏
                    ,
                    closeBtn: false
                    ,
                    area: '300px;'
                    ,
                    shade: 0.8
                    ,
                    id: 'LAY_layuipro' //设定一个id，防止重复弹出
                    ,
                    btn: ['火速围观', '残忍拒绝']
                    ,
                    btnAlign: 'c'
                    ,
                    moveType: 1 //拖拽模式，0或者1
                    ,
                    content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">本系统由paul623开发<br>前端框架采用Layui+JQuery<br>后台使用Spring+MYSQL<br>本系统还在不断完善中。。。本次更新主要是针对于界面动画以及表单数据校验进行了重点优化<br><br>我们的征途是星辰大海 ^_^</div>'
                    ,
                    success: function (layero) {
                        var btn = layero.find('.layui-layer-btn');
                        btn.find('.layui-layer-btn0').attr({
                            href: 'https://github.com/paul623/HumanResourceManager'
                            , target: '_blank'
                        });
                    }
                });
            }
        };

        $('#layerDemo .layui-btn').on('click', function () {
            var othis = $(this), method = othis.data('method');
            active[method] ? active[method].call(this, othis) : '';
        });

    });
</script>
</body>
</html>