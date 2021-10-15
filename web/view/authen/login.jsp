<%-- 
    Document   : login
    Created on : Oct 8, 2021, 12:14:03 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link rel="stylesheet" href="/style.css">
        <link href="../../css/login.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="container">
                <div class="row">
                    <div class="col-md-5">
                        <form role="form" method="post" action="signup">
                            <fieldset>							
                                <p class="text-uppercase pull-center">ĐĂNG KÍ</p>
                                <p class="text-danger">${error}</p>
                                <p class="text-danger">${success}</p>
                                <div class="form-group">
                                    <input type="text" name="username" id="username" class="form-control input-lg" placeholder="Tên người dùng">
                                </div>

                                <div class="form-group">
                                    <input type="password" name="password" id="password" class="form-control input-lg" placeholder="Mật khẩu">
                                </div>
                                <div class="form-group">
                                    <input type="password" name="repass" id="password2" class="form-control input-lg" placeholder="Xác nhận mật khẩu">
                                </div>
                               
                                <div>
                                    <input type="submit" class="btn btn-md"  value="Đăng kí">

                                </div>
                            </fieldset>
                        </form>
                    </div>

                    <div class="col-md-2">
                        <!-------null------>
                    </div>

                    <div class="col-md-5">
                        <form role="form" action="login" method="POST">
                            <fieldset>							
                                <p class="text-uppercase"> ĐĂNG NHẬP </p>
                                <p class="text-danger">${errorMess}</p>

                                <div class="form-group">
                                    <input type="text" name="username"  class="form-control input-lg" placeholder="Tên người dùng">
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" id="password" class="form-control input-lg" placeholder="Mật khẩu">
                                    <input type="checkbox" class="btn btn-md"/>Ghi nhớ mật khẩu
                                </div>
                                <div>
                                                                 
                                    <input type="submit" class="btn btn-md" value="Đăng nhập">
                                </div>

                            </fieldset>
                        </form>	
                    </div>
                </div>
            </div>
           
        </div>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="/script.js"></script>
    </body>
</html>
