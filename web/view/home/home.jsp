<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : home
    Created on : Oct 7, 2021, 5:21:16 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="../css/home.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <jsp:include page="header.jsp"></jsp:include>
            <div class="container">
                <div id="demo" class="carousel slide" data-ride="carousel">
                    <ul class="carousel-indicators">
                        <li data-target="#demo" data-slide-to="0"></li>
                        <li data-target="#demo" data-slide-to="1"></li>
                    </ul>
                    <div class="carousel-inner">
                        <div class="carousel-item">
                            <img src="../img/slider1.png" alt="New York" width="1100" height="500">
                            <div class="carousel-caption">
                                <a href="ShopControl">Shop Now</a>
                                <p>Rất nhiều ưu đãi đặc biệt</p>
                            </div>   
                        </div>
                        <div class="carousel-item active">

                            <img src="../img/slider_2.png" alt="Los Angeles" width="1100" height="500">
                            <div class="carousel-caption">
                                <h3>COMBO siêu tiết kiệm</h3>
                                <p>Mua sắm ngay đánh bay Covid</p>
                            </div>   
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#demo" data-slide="prev">
                        <span class="carousel-control-prev-icon"></span>
                    </a>
                    <a class="carousel-control-next" href="#demo" data-slide="next">
                        <span class="carousel-control-next-icon"></span>
                    </a>
                </div>

                <div class="section-center" id="search" >
                    <div class="container bg-warning d-flex justify-content-center">
                        <div class="row">
                            <div class="booking-form">
                                <form>
                                    <div class="row no-margin">
                                        <div class="col-md-2">
                                            <div class="form-header">
                                                <div class="form-group">
                                                    <span class="form-label">Tour</span>
                                                    <input class="form-control" type="text" placeholder="Tên tour..">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-7">
                                            <div class="row no-margin">
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <span class="form-label">Ngày khời hành</span>
                                                        <input class="form-control" type="date">
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <span class="form-label">Ngày kết thúc</span>
                                                        <input class="form-control" type="date">
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <span class="form-label">Khoảng giá</span>
                                                        <select class="form-control">
                                                            <option>1</option>
                                                            <option>2</option>
                                                            <option>3</option>
                                                        </select>
                                                        <span class="select-arrow"></span>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                        <div class="col-md-1">
                                            <div class="form-btn">
                                                <button class="submit-btn">Tìm kiếm</button>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

                <h4 class="">Tour nổi bật</h4>
                <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto bg-warning" style="width: 60px;">

                <div class= "row" >
                <c:forEach  var="th" items="${toursHot}">
                    <div class ="col-6 col-sm-6 col-md-3 image">
                        <img src="${th.img}" alt="New York" >                       
                        <p><a href="#">
                                ${th.tourName}
                            </a>
                        </p>
                        <p>Lich trinh: ${th.dateTime}</p>
                        <h5>Giá: ${th.priceVND()}</h5>
                    </div>
                </c:forEach>

            </div>



            <hr>

            <h4 class="">Tour khuyến mãi</h4>
            <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto bg-warning" style="width: 60px;">

            <div class= "row">
                <c:forEach  var="t" items="${tours}">
                    <div class ="col-6 col-sm-6 col-md-4 image">
                        <img src="${t.img}" alt="New York" >                       
                        <p><a href="#">
                                ${t.tourName}
                            </a>
                        </p>
                        <p>Lich trinh: ${t.dateTime}</p>
                        <h5>Giá khuyến mãi: ${t.priceVND()}</h5>
                    </div>
                </c:forEach>

            </div>

            <hr>
            <h4 class="">Tin tức</h4>
            <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto bg-warning" style="width: 60px;">

            <div class= "row">
                <c:forEach var="n" items="${news}">
                    <div class ="col-6 col-sm-6 col-md-3 image">
                        <img src="${n.image}" alt="New York" >                       
                        <p><a href="#">
                                ${n.title}
                            </a>
                        </p>
                        
                    </div>
                </c:forEach>

            </div>
        </div>


        <jsp:include page="footer.jsp"></jsp:include>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
