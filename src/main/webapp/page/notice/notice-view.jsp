<%--
  Created by IntelliJ IDEA.
  User: zhuba
  Date: 2020/7/1
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>公告信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a>
          <cite>公告信息</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="notice/list" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <div class="layui-row" style="" align="center">
        <form class="layui-form layui-col-md12 x-so" method="get" action="notice/list-view">
            <input type="text" name="content" style="width:50%;"  placeholder="请输入查找内容" autocomplete="off" class="layui-input">
            <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>ID</th>
            <th>标题</th>
            <th>内容</th>
            <th>发布日期</th>
            <th>发布用户</th>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.list}" var="dept" varStatus="stat">
            <tr>
                <td>
                    <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
                </td>
                <td>${dept.id}</td>
                <td>${dept.title }</td>
                <td>${dept.content }</td>
                <td>${dept.createDate }</td>
                <td>${dept.user.username }</td>
            </tr>

        </c:forEach>


        </tbody>
    </table>
    <div class="page">
        <div>
            <a class="prev" href="">&lt;&lt;</a>
            <span class="current">1</span>
            <a class="num" href="">2</a>
            <a class="num" href="">3</a>
            <a class="num" href="">..</a>
            <a class="next" href="">&gt;&gt;</a>
        </div>
    </div>
</div>
<body/>
<html/>
