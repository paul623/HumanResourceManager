<%--
  Created by IntelliJ IDEA.
  User: zhuba
  Date: 2020/7/14
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>xxx公司首页</title>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <!-- 移动端适配 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- 地址栏显示 -->
    <link rel="shortcut icon" href="./favicon.ico"/>
    <!-- 收藏栏也显示 -->
    <link rel="bookmark" href="./favicon.ico"/>
    <!-- Bootstrap -->
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- font-awesome -->
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- owl carousel -->
    <link rel="stylesheet" href="../static/css/owl.carousel.min.css">
    <link rel="stylesheet" href="../static/css/owl.theme.default.min.css">
    <!-- 自定义css -->
    <link rel="stylesheet" href="../css/common.css">
    <link rel="stylesheet" href="../css/home-index.css">
</head>
<body>
<!-- 头部开始 -->
<div class="pageheader">
    <div class="header clearfix">
        <a href="index.html">
            <div class="logo fl">
                <span>企业集团</span>
            </div>
        </a>
        <div class="menu fl">
            <ul class="clearfix">
                <a href="#">
                    <li class="fl active"><span>首页</span><i></i></li>
                </a>
                <a href="#">
                    <li class="fl"><span>产品</span><i></i></li>
                </a>
                <a href="#">
                    <li class="fl"><span>服务</span><i></i></li>
                </a>
                <a href="#">
                    <li class="fl"><span>案例</span><i></i></li>
                </a>
                <a href="#">
                    <li class="fl"><span>新闻</span><i></i></li>
                </a>
                <a href="#">
                    <li class="fl"><span>关于</span><i></i></li>
                </a>
            </ul>
        </div>
        <a href="/loginForm">
            <div class="contactus fr">
                后台系统登录
            </div>
        </a>
    </div>
</div>
<!-- 头部结束 -->


<!-- 轮播图 -->
<div class="banner">
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- 指示器 -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
        </ol>
        <!-- 轮播图片及说明文字 -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <a href="#" class="pc_imgBox"><img src="../images/indexBanner.png" alt=""></a>
            </div>
            <div class="item">
                <a href="#" class="pc_imgBox"><img src="../images/indexBanner2.jpg" alt=""></a>
            </div>
            <div class="item">
                <a href="#" class="pc_imgBox"><img src="../images/indexBanner3.jpg" alt=""></a>
            </div>
            <div class="item">
                <a href="#" class="pc_imgBox"><img src="../images/indexBanner4.jpg" alt=""></a>
            </div>
        </div>
    </div>
    <span>开启未来智能生活新体验</span>
    <i>了解更多</i>

</div>

<!-- 栏目 -->
<div class="program">
    <div class="main">
        <ul class="clearfix">
            <li><img src="../images/program1.png" alt="">
                <div class="dsc"><em>服务方向</em><i>提供多种机型满足不同业务需求</i></div>
            </li>
            <li><img src="../images/program2.png" alt="">
                <div class="dsc"><em>通用计算</em><i>可提供十万核级的并发计算能力</i></div>
            </li>
            <li><img src="../images/program3.png" alt="">
                <div class="dsc"><em>服务方向</em><i>提供多种机型满足不同业务需求</i></div>
            </li>
            <li class="mr0"><img src="../images/program4.png" alt="">
                <div class="dsc"><em>通用计算</em><i>可提供十万核级的并发计算能力</i></div>
            </li>
        </ul>
    </div>
</div>

<!-- 产品详情 -->
<div class="product">
    <div class="main">
        <div class="title">产品方案</div>

        <ul class="clearfix">
            <a href="#">
                <li><img src="../images/product1.png"
                         alt=""><em>工业系统能源互联</em><i>物联通信模块使各类终端设备具备联网信息传输能力，是各类智能终端得以接入物联网的信息入口。它是连接物联网感...</i></li>
            </a>
            <a href="#">
                <li><img src="../images/product2.png"
                         alt=""><em>校园人员管理系统</em><i>物联通信模块使各类终端设备具备联网信息传输能力，是各类智能终端得以接入物联网的信息入口。它是连接物联网感...</i></li>
            </a>
            <a href="#">
                <li class="mr0"><img src="../images/product3.png"
                                     alt=""><em>全屋智能家居</em><i>物联通信模块使各类终端设备具备联网信息传输能力，是各类智能终端得以接入物联网的信息入口。它是连接物联网感...</i>
                </li>
            </a>
            <a href="#">
                <li><img src="../images/product4.png"
                         alt=""><em>工业系统能源互联</em><i>物联通信模块使各类终端设备具备联网信息传输能力，是各类智能终端得以接入物联网的信息入口。它是连接物联网感...</i></li>
            </a>
            <a href="#">
                <li><img src="../images/product5.png"
                         alt=""><em>智慧门锁</em><i>物联通信模块使各类终端设备具备联网信息传输能力，是各类智能终端得以接入物联网的信息入口。它是连接物联网感...</i></li>
            </a>
            <a href="#">
                <li class="mr0"><img src="../images/product6.png"
                                     alt=""><em>全屋智能家居</em><i>物联通信模块使各类终端设备具备联网信息传输能力，是各类智能终端得以接入物联网的信息入口。它是连接物联网感...</i>
                </li>
            </a>

        </ul>
        <a href="#">
            <div class="more">
                更多
            </div>
        </a>
    </div>
</div>

<!-- 案例展示 -->
<div class="caseshow">
    <div class="title">
        案例展示
    </div>

    <ul class="clearfix">
        <a href="./casedetails.html">
            <li><img src="../images/caseshow1.png" alt=""><em>北京国际机场T3航站楼</em></li>
        </a>
        <a href="./casedetails.html">
            <li><img src="../images/caseshow2.png" alt=""><em>上海浦东国际机场</em></li>
        </a>
        <a href="./casedetails.html">
            <li class="mr0"><img src="../images/caseshow3.png" alt=""><em>香港国际机场</em></li>
        </a>
        <a href="./casedetails.html">
            <li><img src="../images/caseshow4.png" alt=""><em>北京国际机场T3航站楼</em></li>
        </a>
        <a href="./casedetails.html">
            <li><img src="../images/caseshow5.png" alt=""><em>上海浦东国际机场</em></li>
        </a>
        <a href="./casedetails.html">
            <li class="mr0"><img src="../images/caseshow6.png" alt=""><em>香港国际机场</em></li>
        </a>

    </ul>
    <a href="./case.html">
        <div class="more">
            更多
        </div>
    </a>

</div>

<!-- 关于我们 -->
<div class="about">
    <div class="aboutus">
        <div class="main">

            <span>关于我们</span>
            <em>某某某是一家品牌设计机构，一直努力建立自己的工作方式与思维模式，形成了多维视野、独立观点、系统方法。
                <br>
                <br>
                我们的简唯设计秉承全球化设计定位，室内设计、软装设计及项目顾问服务。设计产业类型包含:精品酒店、商业办公综合体、售楼处与会所、高端住宅地产、住宅产业标准化等，致力于设计实现品质空间。
            </em>
            <a href="#">
                <div class="more">
                    更多
                </div>
            </a>
        </div>
        <div class="img"><img src="../images/aboutus.png" alt=""></div>
    </div>
</div>

<!-- 新闻动态 -->
<div class="news">
    <div class="title">
        新闻动态
    </div>
    <div class="clearfix">
        <div class="left">
            <img src="../images/news.png" alt="">
            <ul>
                <li class="clearfix">
                    <div class="dsc1">
                        <em class="em1">07-14</em>
                        <em class="em2">2020</em>
                    </div>

                    <div class="dsc2">
                        <span>xxx公司与xxx达成企业战略合作...</span>
                        <em></em>
                        <i>2020年7月1日，公司在江苏淮安与xxx签订企业战略合作协议，旨在建立互利共生的良好企业新生态，鼓励...</i>
                    </div>

                </li>
            </ul>
        </div>
        <div class="right">
            <a href="#">
                <div class="box">
                    <ul>
                        <li class="clearfix">
                            <div class="dsc1">
                                <em class="em1">05-11</em>
                                <em class="em2">2020</em>
                            </div>

                            <div class="dsc2">
                                <span>企业进行员工评估...</span>
                                <em></em>
                                <i>2020年5月10日，企业使用人力资源管理系统对雇员进行综合考量评估，为企业发展打下良好基础...</i>
                            </div>

                        </li>
                    </ul>
                </div>
            </a>
            <a href="#">
                <div class="box">
                    <ul>
                        <li class="clearfix">
                            <div class="dsc1">
                                <em class="em1">06-11</em>
                                <em class="em2">2019</em>
                            </div>

                            <div class="dsc2">
                                <span>xxx公司与工信智创生态创新会议在上海城方创新中心圆...</span>
                                <em></em>
                                <i>2019年6月10日，xxx公司与工信智创生态创新会议在上海城方创新中心圆满结束，会议旨在助力企业生态创新，通过终端用户计算技术为业务持续...</i>
                            </div>

                        </li>
                    </ul>
                </div>
            </a><a href="#">
            <div class="box">
                <ul>
                    <li class="clearfix">
                        <div class="dsc1">
                            <em class="em1">05-11</em>
                            <em class="em2">2019</em>
                        </div>

                        <div class="dsc2">
                            <span>xxx公司与工信智创生态创新会议在上海城方创新中心圆...</span>
                            <em></em>
                            <i>2019年4月12日，xxx公司与工信智创生态创新会议在上海城方创新中心圆满结束，会议旨在助力企业生态创新，通过终端用户计算技术为业务持续...</i>
                        </div>

                    </li>
                </ul>
            </div>
        </a>
        </div>
    </div>


    <div class="more">
        更多
    </div>
</div>


<!-- 联系我们 -->
<div class="cons">
    <div class="contact">
        <a href="#">
            <div class="title">
                联系我们
            </div>
        </a>
        <div class="clearfix">
            <ul>
                <em>某某某公司</em>
                <li>地址： 淮安市清江浦区淮阴工学院(枚乘路1号) <img src="../images/qq.png" alt=""></li>
                <li>电话：012-1234567<img src="../images/vx.png" alt=""></li>
                <li>邮箱：website@qq.com <img src="../images/weibo.png" alt=""></li>
            </ul>
            <img src="../images/map.png" class="map" alt="">
        </div>
    </div>
</div>

<!-- 合作商 -->
<div class="company">
    <div class="box"><img src="../images/company1.png" alt=""></div>
    <div class="box"><img src="../images/company2.png" alt=""></div>
    <div class="box"><img src="../images/company3.png" alt=""></div>
    <div class="box"><img src="../images/company4.png" alt=""></div>
    <div class="box"><img src="../images/company1.png" alt=""></div>
    <div class="box mr0"><img src="../images/company2.png" alt=""></div>
</div>


<!-- 底部 -->
<div class="bottom">
    <a href="#">
        <div class="join">加入我们</div>
    </a>
    <div class="copy">Copyright © 2020 - 企业集团类网站.</div>
</div>

<!-- jQuery -->
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<!-- Bootstrap -->
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

<!-- 自定义js -->


</body>
</html>
