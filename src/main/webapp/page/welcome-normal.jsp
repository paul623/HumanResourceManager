<%--
  Created by IntelliJ IDEA.
  User: zhuba
  Date: 2020/7/1
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
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
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
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
    <blockquote class="layui-elem-quote">欢迎用户：
        <span class="x-red">${sessionScope.user_session.name}</span>！ 当前时间:<div id="dt"></div></blockquote>
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
                        <a class="x-a" href="/" target="_blank">v0.0.4开始内测</a><br/><br/>
                        <a class="x-a" href="/" target="_blank">绑定手机后就可以使用手机登录啦！</a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </fieldset>
    <fieldset class="layui-elem-field">
        <legend>个人信息</legend>
        <div class="layui-field-box">
            <table class="layui-table">
                <tbody>
                <tr>
                    <th>工号</th>
                    <td>${sessionScope.user_session.id}</td></tr>
                <tr>
                    <th>部门</th>
                    <td>${sessionScope.deptName}</td></tr>
                <tr>
                    <th>职位</th>
                    <td>${sessionScope.jobName}</td></tr>
                <tr>
                    <th>姓名</th>
                    <td>${sessionScope.user_session.name}</td></tr>
                <tr>
                    <th>生日</th>
                    <td>${sessionScope.user_session.birthday}</td></tr>
                <tr>
                    <th>民族</th>
                    <td>${sessionScope.user_session.party}</td></tr>
                <tr>
                    <th>住址</th>
                    <td>${sessionScope.user_session.address}</td></tr>
                <tr>
                    <th>通信邮箱</th>
                    <td>${sessionScope.user_session.email}</td></tr>
                <tr>
                    <th>QQ</th>
                    <td>${sessionScope.user_session.qqNum}</td></tr>
                <tr>
                    <th>爱好</th>
                    <td>${sessionScope.user_session.hobby}</td></tr>
                <tr>
                    <th>特长</th>
                    <td>${sessionScope.user_session.speciality}</td></tr>
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
                    <td><a href="https://github.com/paul623" class='x-a' target="_blank">Paul623</a></td>
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
</body>
</html>
