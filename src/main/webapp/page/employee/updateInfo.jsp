<%--
  Created by IntelliJ IDEA.
  User: zhuba
  Date: 2020/7/3
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<html>
<head>
    <title>更新用户信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui/css/layui.css"  media="all">
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.all.js"></script>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>修改密码页面</legend>
    <div align="center">
        <span><span style="color: green; ">${sessionScope.msg}</span></span>
    </div>
</fieldset>
    <form  class="layui-form" method="post" action="/employee/updateInfo">
        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-block">
                <input type="text" name="name" autocomplete="off"
                       lay-verify="required" class="layui-input" value="${data.name}" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-block">
                <input type="text" name="phone" autocomplete="off"
                       lay-verify="phone" class="layui-input" value="${data.phone}" }>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">生日</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="birthday" name="birthday"
                       lay-verify="date" placeholder="yyyy-MM-dd" value="${data.birthday}">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">民族</label>
            <div class="layui-input-block">
                <input type="text" name="party" autocomplete="off"
                       lay-verify="required" class="layui-input" value="${data.party}">
            </div>
        </div>
        <div class="layui-form-item">
            <br/>
            <label class="layui-form-label">住址</label>
            <div class="layui-input-block">
                <input type="text" name="address" autocomplete="off" ]
                       lay-verify="required" class="layui-input" value="${data.address}">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">邮箱</label>
            <div class="layui-input-block">
                <input type="text" name="email" autocomplete="off"
                       lay-verify="email" class="layui-input" value="${data.email}">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">QQ</label>
            <div class="layui-input-block">
                <input type="text" name="qqNum" autocomplete="off" class="layui-input" value="${data.qqNum}">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">爱好</label>
            <div class="layui-input-block">
                <input type="text" name="hobby" autocomplete="off" class="layui-input" value="${data.hobby}" }>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">专业技能</label>
            <div class="layui-input-block">
                <textarea placeholder="请输入内容" class="layui-textarea"
                          lay-verify="required" name="speciality" >${data.speciality}</textarea>
            </div>
        </div>
        </div>
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </form>
<script type="text/javascript">
    layui.use('laydate', function() {
        var laydate = layui.laydate;
        //常规用法
        laydate.render({
            elem: '#birthday'
        });
    });
    layui.use(['form'], function() {
        var form = layui.form;
    })
</script>
</body>
</html>
