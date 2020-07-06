<%--
  Created by IntelliJ IDEA.
  User: zhuba
  Date: 2020/7/6
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看雇员信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui/css/layui.css" media="all">
</head>
<body>
<fieldset class="layui-elem-field">
    <legend>个人信息</legend>
    <div class="layui-field-box">
        <table class="layui-table">
            <tbody>
            <tr>
                <th>姓名</th>
                <td>${sessionScope.employee.name}</td>
            </tr>
            <tr>
                <th>工号</th>
                <td>${sessionScope.employee.id}</td>
            </tr>
            <tr>
                <th>性别</th>
                <td>${sessionScope.employee.sexStr}</td>
            </tr>
            <tr>
                <th>生日</th>
                <td>${sessionScope.employee.birthday}</td>
            </tr>
            <tr>
                <th>民族</th>
                <td>${sessionScope.employee.party}</td>
            </tr>
            <tr>
                <th>部门</th>
                <td>${sessionScope.deptName}</td>
            </tr>
            <tr>
                <th>职位</th>
                <td>${sessionScope.jobName}</td>
            </tr>
            <tr>
                <th>手机</th>
                <td>${sessionScope.employee.phone}</td>
            </tr>
            <tr>
                <th>QQ</th>
                <td>${sessionScope.employee.qqNum}</td>
            </tr>
            <tr>
                <th>邮箱</th>
                <td>${sessionScope.employee.email}</td>
            </tr>
            <tr>
                <th>学历</th>
                <td>${sessionScope.employee.education}</td>
            </tr>
            <tr>
                <th>入职时间</th>
                <td>${sessionScope.employee.createDate}</td>
            </tr>
            <tr>
                <th>住址</th>
                <td>${sessionScope.employee.address}</td>
            </tr>
            <tr>
                <th>爱好</th>
                <td>${sessionScope.employee.hobby}</td>
            </tr>
            <tr>
                <th>职业技能</th>
                <td>${sessionScope.employee.speciality}</td>
            </tr>
            </tbody>
        </table>
    </div>
</fieldset>

</body>
</html>
