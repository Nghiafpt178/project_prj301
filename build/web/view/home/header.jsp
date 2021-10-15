<%-- 
    Document   : header
    Created on : Oct 7, 2021, 5:20:13 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                <a class="navbar-brand" href="#">Booking Tour</a>
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <li class="nav-item active">
                        <a class="nav-link" href="trangchu">Trang chủ<span class="sr-only">(current)</span></a>
                    </li>
                    
                    <li class="nav-item">
                        <a class="nav-link " href="tour">Tours</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="tintuc">Tin tức</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="#">Liên hệ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="#">Xin chào:${user} </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="#">Thoát </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="login">Đăng nhập/Đăng kí</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Bạn muốn tìm..." aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>

            </div>
        </nav>
        
        
    </body>
</html>
