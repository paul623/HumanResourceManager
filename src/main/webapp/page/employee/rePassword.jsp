<%--
  Created by IntelliJ IDEA.
  User: zhuba
  Date: 2020/7/1
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>员工列表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" href="../css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>修改密码页面</legend>
</fieldset>
<div align="center">
    <span><span style="color: red; ">${sessionScope.msg}</span></span>
</div>
<div align="center">
    <span><span style="color: green; ">${sessionScope.msg_s}</span></span>
</div>
<form class="layui-form" action="/employee/rePassword" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">旧密码</label>
        <div class="layui-input-block">
            <input type="password" name="old_pass" lay-verify="pass" autocomplete="off" placeholder="请输入旧密码" class="layui-input">
        </div>
        <br/>
        <label class="layui-form-label">新密码</label>
        <div class="layui-input-block">
            <input type="password" name="password" lay-verify="required" autocomplete="off" placeholder="请输入新密码" class="layui-input">
        </div>
        <br />
        <label class="layui-form-label">确认密码</label>
        <div class="layui-input-block">
            <input type="password" name="c_password" lay-verify="required|confirmPass" autocomplete="off" placeholder="请输入新密码" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script type="text/javascript">
    layui.use(['form'], function() {
        var form = layui.form;
        var $ = layui.$;
        form.verify({
            confirmPass:function(value){
                if($('input[name = password]').val() !== value)
                    return 'Oopps!!!!两次密码输入不一致哦！';
            }
        });
    })
</script>
</body>
</html>
