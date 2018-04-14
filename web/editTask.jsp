<%--
  Created by IntelliJ IDEA.
  User: JHQ
  Date: 2018/4/10
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>后台管理系统-HTML5后台管理系统</title>
    <meta name="keywords"  content="设置关键词..." />
    <meta name="description" content="设置描述..." />
    <meta name="author" content="DeathGhost" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <link rel="icon" href="images/icon/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="main/css/style.css" />
    <script src="main/javascript/jquery.js"></script>
    <script src="main/javascript/plug-ins/customScrollbar.min.js"></script>
    <script src="main/javascript/plug-ins/echarts.min.js"></script>
    <script src="main/javascript/plug-ins/layerUi/layer.js"></script>
    <script src="main/javascript/plug-ins/pagination.js"></script>
    <script src="main/javascript/public.js"></script>
</head>
<body>
<div class="main-wrap">

    <div class="page-wrap">
        <div class="form-group-col-2">
            <div class="form-label">任务名称：</div>
            <div class="form-cont">
                <input type="text" placeholder="任务名称" class="form-control form-boxed">
            </div>
        </div>
        <div class="form-group-col-2">
            <div class="form-label">任务url：</div>
            <div class="form-cont">
                <input type="tel" placeholder="任务url..." class="form-control form-boxed" style="width:300px;">
                <%--<button class="btn btn-secondary-outline">测试</button>--%>
                <%--<span class="word-aux"><i class="icon-warning-sign"></i>清正确输入11位手机号码</span>--%>
            </div>
        </div>
        <div class="form-group-col-2">
            <div class="form-label">任务类别：</div>
            <div class="form-cont">
                <select style="width:auto;">
                    <option>淘宝</option>
                    <option>天猫</option>
                    <option>知乎</option>
                    <option>百度</option>
                    <option>自定义</option>
                </select>
                <%--<select style="width:auto;">--%>
                <%--<option>子分类</option>--%>
                <%--<option>上装</option>--%>
                <%--<option>下装</option>--%>
                <%--</select>--%>
            </div>
        </div>
        <div class="form-group-col-2">
            <div class="form-label">任务规则：</div>
            <div class="form-cont">
                <textarea class="form-control form-boxed">任务规则</textarea>
            </div>
        </div>
        <%--<div class="form-group-col-2">--%>
        <%--<div class="form-label">兴趣爱好：</div>--%>
        <%--<div class="form-cont">--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" checked="checked" name="mmm">--%>
        <%--<span>读书</span>--%>
        <%--</label>--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" name="mmm">--%>
        <%--<span>听音乐</span>--%>
        <%--</label>--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" name="mmm">--%>
        <%--<span>羽毛球</span>--%>
        <%--</label>--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" name="mmm">--%>
        <%--<span>篮球</span>--%>
        <%--</label>--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" name="mmm">--%>
        <%--<span>足球</span>--%>
        <%--</label>--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" checked="checked" name="mmm">--%>
        <%--<span>读书</span>--%>
        <%--</label>--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" name="mmm">--%>
        <%--<span>听音乐</span>--%>
        <%--</label>--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" name="mmm">--%>
        <%--<span>羽毛球</span>--%>
        <%--</label>--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" name="mmm">--%>
        <%--<span>篮球</span>--%>
        <%--</label>--%>
        <%--<label class="check-box">--%>
        <%--<input type="checkbox" name="mmm">--%>
        <%--<span>足球</span>--%>
        <%--</label>--%>
        <%--</div>--%>
        <%--</div>--%>
        <%--<div class="form-group-col-2">--%>
        <%--<div class="form-label">性别：</div>--%>
        <%--<div class="form-cont">--%>
        <%--<label class="radio">--%>
        <%--<input type="radio" name="sex">--%>
        <%--<span>男士</span>--%>
        <%--</label>--%>
        <%--<label class="radio">--%>
        <%--<input type="radio" name="sex" checked="checked">--%>
        <%--<span>女士</span>--%>
        <%--</label>--%>
        <%--<label class="radio">--%>
        <%--<input type="radio" name="sex">--%>
        <%--<span>保密</span>--%>
        <%--</label>--%>
        <%--</div>--%>
        <%--</div>--%>
        <div class="form-group-col-2">
            <div class="form-label">备注：</div>
            <div class="form-cont">
                <textarea class="form-control form-boxed">备注信息</textarea>
            </div>
        </div>
        <div class="form-group-col-2">
            <div class="form-label"></div>
            <div class="form-cont">
                <input type="submit" class="btn btn-primary" value="提交任务">
                <%--<input type="reset" class="btn btn-disabled" value="禁止">--%>
            </div>
        </div>
        <!--开始::结束-->
    </div>

</div>



</div>

</body>
</html>
