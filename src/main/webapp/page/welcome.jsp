<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title></title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="shortcut icon" href="logo.ico" type="image/x-icon" />
        <link rel="stylesheet" href="css/font.css">
        <link rel="stylesheet" href="css/xadmin.css">
    </head>
    <body >
    <script>
        var currentDate = new Date(<%=new java.util.Date().getTime()%>);
        function run()
        {
            currentDate.setSeconds(currentDate.getSeconds()+1);
            document.getElementById("dt").innerHTML = currentDate.toLocaleString();
        }
        window.setInterval("run();", 1000);
    </script>
    <div class="x-body layui-anim layui-anim-up">
        <blockquote class="layui-elem-quote">欢迎管理员：
            <span class="x-red">${sessionScope.user_session.username}</span>！ 当前时间:<div id="dt"></div></blockquote>
        <fieldset class="layui-elem-field">
            <legend>数据统计</legend>
            <div class="layui-field-box">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body">
                            <div class="layui-carousel x-admin-carousel x-admin-backlog" lay-anim="" lay-indicator="inside" lay-arrow="none" style="width: 100%; height: 90px;">
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
                    <tbody>
                        <tr>
                            <td >
                                <a class="x-a" href="/" target="_blank">v0.0.1开始内测</a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <fieldset class="layui-elem-field">
            <legend>更新日志</legend>
            <div class="layui-field-box">
                <table class="layui-table" lay-skin="line">
                    <tbody>
                    <tr>
                        <td >
                            <a class="x-a" target="_blank">新增员工登录系统，鉴权，拦截器（2020.07.01）</a>
                            <a class="x-a" target="_blank">修复诸多问题，测试文档上传稳定性（2020.06.30）</a>
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
                            <td>v0.0.1</td></tr>
                        <tr>
                            <th>服务器地址</th>
                            <td>localhost:8080</td></tr>
                        <tr>
                            <th>操作系统</th>
                            <td>Windows/Linux</td></tr>
                        <tr>
                            <th>运行环境</th>
                            <td>jdk 1.8及以上</td></tr>
                        <tr>
                            <th>MYSQL版本</th>
                            <td>8.0</td></tr>
                        <tr>
                            <th>上传附件限制</th>
                            <td>2M</td></tr>
                        <tr>
                            <th>执行时间限制</th>
                            <td>30s</td></tr>
                        <tr>
                            <th>剩余空间</th>
                            <td>/</td></tr>
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
        var _hmt = _hmt || [];
        (function() {
          var hm = document.createElement("script");
          hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
          var s = document.getElementsByTagName("script")[0]; 
          s.parentNode.insertBefore(hm, s);
        })();
        </script>
    </body>
</html>