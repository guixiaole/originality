<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登陆</title>
<link type="text/css" rel="stylesheet" href="style/reset.css" />
<link type="text/css" rel="stylesheet" href="style/main.css" />
</head>

   
<body>
<div class="headerBar">
    <div class="logoBar login_logo">
      <div class="comWidth">
         <div class="logo fl">
          <a href="#"><img src="images/logo1.png" width="50px" height="50px"alt="乐租网" /></a>
         </div>
        <h3 class="welcom_title">管理员登录</h3>
   </div>
      </div>
     </div> 
     <div class="loginBox">
        <div class="login_cont">
        <form action="${pageContext.request.contextPath }/adminLogin.action" name="search" method="post">
        <ul class="login">
          <li class="l_tit">账户</li>
          <li class="mb_10"><input name="adusername" type="text" class="login_input user_icon" /></li>
          <li class="l_tit">密码</li>
          <li class="mb_10"><input type="adpassword" name="admin.adminPassword" class="login_input passworder_icon"/></li>
          <ul class="cheak_list clearfix">
          <li ><input type="checkbox" id="a1" class="cheaked"/><label for="a1">记住密码</label></li>
          <li><input type="checkbox" id="a2" class="cheaked" /><label for="a2">自动登陆</label></li>
        
          </ul>
          <li><input type="submit" value="登陆" class="login_btn" /></li>
        </ul>
     </form>
        
   
      
     </div>

      </div>
      
      
      
      
      
      
      
      
      <div class="footer">
<p> <a href="#">关于乐租</a>  <a href="#">帮助中心</a>  <a href="#">开放平台</a>  <a href="#">诚聘英才</a>  <a href="#">网站合作</a>  <a href="#">法律声明</a>  <a href="#">知识产权</a>  客服热线：110-120-119  
<p>增值电信业务经营许可证: 浙B2-20110446&nbsp&nbsp&nbsp网络文化经营许可证：赣网文[2015]0295-065号&nbsp&nbsp&nbsp<br>互联网医疗保健信息服务 审核同意书 赣卫网审【2014】6号
互联网药品信息服务资质证书编号：赣-（经营性）-2012-0005 </p>
<p><a href="#"><img src="images/icon/a.jpg" alt="logo" /></a><a href="#"><img src="images/icon/b.jpg" alt="logo" /></a></p>
</div>
</body>
</html>
