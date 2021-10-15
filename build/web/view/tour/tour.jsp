<%-- 
    Document   : tour
    Created on : Oct 7, 2021, 10:36:36 PM
    Author     : ADMIN
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
        <jsp:include page="../home/header.jsp"></jsp:include>     
                <div class="container">
                    <h4 class="">Tour hot</h4>
                    <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto bg-warning" style="width: 60px;">
                    <div class="row">
                        <div class="col">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                                    <li class="breadcrumb-item"><a href="category.html">Category</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Sub-category</li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-12 col-sm-3">
                            <div class="card bg-light mb-3">
                                <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i>Thương hiệu</div>
                                <ul class="list-group category_block">
                                    <li class="list-group-item"><a href="category.html">Cras justo odio</a></li>
                                    <li class="list-group-item"><a href="category.html">Dapibus ac facilisis in</a></li>
                                    <li class="list-group-item"><a href="category.html">Morbi leo risus</a></li>
                                    <li class="list-group-item"><a href="category.html">Porta ac consectetur ac</a></li>
                                    <li class="list-group-item"><a href="category.html">Vestibulum at eros</a></li>
                                </ul>
                            </div>
                            <div class="card bg-light mb-3">
                                <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i>Giá</div>
                                <div class="filter-box">
                                    <ul>
                                        <c:forEach begin="1" end="4">

                                            <li>
                                                <label>
                                                    <input type="radio"  />
                                                    <span>Nhỏ hơn 500.000₫</span>
                                                </label>
                                            </li>
                                        </c:forEach>
                                    </ul>

                                </div>
                            </div>
                            <div class="card bg-light mb-3">
                                <div class="card-header bg-success text-white text-uppercase">Kích thước</div>
                                <div class="filter-box" id="filter-size">
                                    <ul class="filter-size clearfix">
                                        <c:forEach  begin="1" end="10">

                                            <li>
                                                <label data-filter="35" class="35">
                                                    <input type="checkbox" value="(35)">
                                                    <span>35</span>
                                                </label>
                                            </li>
                                        </c:forEach>		
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="row">
                               <c:forEach  begin="1" end="6">
                                <div class="col-12 col-md-6 col-lg-4">
                                    <div class="card">
                                        <img class="card-img-top" src="../img/1.jpg" alt=""/>             
                                        <div class="card-body">
                                            <h4 class="card-title"><a href="tourdetail">Tour du lich</a></h4>                  
                                            <div class="row">
                                                <div class="col">
                                                    <p class="btn btn-danger btn-block">1.200.000</p>
                                                </div>
                                                <div class="col">
                                                    <a href="#" class="btn btn-success btn-block">Đặt Tour</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>

                            <div class="col-12">
                                <nav aria-label="...">
                                    <ul class="pagination">
                                        <li class="page-item disabled">
                                            <a class="page-link" href="#" tabindex="-1">Previous</a>
                                        </li>
                                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                                        <li class="page-item active">
                                            <a class="page-link" href="#">2 <span class="sr-only">(current)</span></a>
                                        </li>
                                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                                        <li class="page-item">
                                            <a class="page-link" href="#">Next</a>
                                        </li>
                                    </ul>
                                </nav>
                            </div>

                        </div>
                    </div>
                </div>
                    


            <jsp:include page="../home/footer.jsp"></jsp:include>
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
