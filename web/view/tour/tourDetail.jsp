<%-- 
    Document   : tourDetail
    Created on : Oct 8, 2021, 12:38:46 AM
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
        <link href="../../css/home.css" rel="stylesheet" type="text/css"/>
        <link href="../css/tourDetail.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="../home/header.jsp"></jsp:include>  
            <div class="container">
                <h3>Tour Du Lịch: Vịnh Hạ Long | Cố Đô Hoa Lư | Bái Đính | Hà Nội | Sapa | Gồm VMB (4N3Đ)</h3>
                <div class="row">
                    <div class="product-img col-md-7">
                        <img src="../img/1.jpg" height="420" width="500">
                    </div>

                    <div class="product-info col-md-5">
                        <div class="product-text">
                            <h1>Harvest Vase</h1>
                            <h2>by studio and friends</h2>
                            <p>Harvest Vases are a reinterpretation<br> of peeled fruits and vegetables as<br> functional objects. The surfaces<br> appear to be sliced and pulled aside,<br> allowing room for growth. </p>
                        </div>
                        <div class="product-price-btn">
                            <p>1.200.000 VNĐ</p>
                            <button type="button">Đặt Tour</button>
                        </div>
                    </div>
                </div> 
            </div>

            <hr>

            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <!-- List group-->
                        <ul class="list-group shadow">
                            <!-- list group item-->
                            <li class="list-group-item">
                                <!-- Custom content-->
                                <div class="media align-items-lg-center flex-column flex-lg-row p-3">
                                    <div class="media-body order-2 order-lg-1">
                                        <h5 class="mt-0 font-weight-bold mb-2">Điểm nhấn hành trình</h5>
                                        <p class="font-italic text-muted mb-0 small">
                                            HANG ĐẦU GỖ là nơi gắn liền với câu chuyện lịch sử chống quân
                                            Nguyên Mông năm 1228 của Trần Hưng Đạo. hải trình du thuyền đi giữa 
                                            Hạ Long với hàng ngàn đảo đá sừng sững du khách sẽ có dịp chiêm ngưỡng
                                            bức tranh thiên tạo khổng lồ như Hòn Đỉnh Hương, Hòn Gà Chọi, hòn Chó Đá,….
                                        </p>
                                        <div class="d-flex align-items-center justify-content-between mt-1">
                                            <h6 class="font-weight-bold my-2"></h6>
                                            <ul class="list-inline small">
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star-o text-gray"></i></li>
                                            </ul>
                                        </div>
                                    </div>

                                </div> <!-- End -->
                            </li> <!-- End -->
                            <!-- list group item-->
                            <li class="list-group-item">
                                <!-- Custom content-->
                                <div class="media align-items-lg-center flex-column flex-lg-row p-3">
                                    <div class="media-body order-2 order-lg-1">
                                        <h5 class="mt-0 font-weight-bold mb-2">Lịch trình</h5>
                                        <div class="font-italic text-muted mb-0 small">
                                            <p>
                                                Sáng: Đại diện của Đất Việt Tour đón khách tại điểm hẹn, cảng nội địa sân bay Tân Sơn làm
                                                thủ tục đáp chuyến bay đi Vân Đồn lúc 07h00.
                                            </p>
                                            <p>
                                                08h30: Đến sân bay, xe đón quý khách về nhà hàng dùng bữa sáng. Khởi hành du lịch Hạ Long.
                                            </p>
                                            <p>
                                                11h30: Đến Hạ Long, đoàn ăn trưa tại nhà hàng Hạ Long.
                                            </p>
                                            <p>
                                                13h00: Nhận phòng tại khách sạn, nghỉ ngơi.
                                            </p>
                                            <p>
                                                14h00: Xe đưa đoàn đến bến thuyền thăm Vịnh Hạ Long -
                                                Kỳ quan của thế giới, tàu đón quý khách, bắt đầu hành trình khám phá vịnh Hạ Long: du khách dừng thuyền để lên thăm
                                            </p>
                                            <p>
                                                18h30: Về lại nhà hàng ăn tối tại nhà hàng. Sau đó quý khách tự do dạo phố đêm Hạ Long hoặc tự do tham quan ngắm cầu Bãi Cháy.
                                            </p>
                                        </div>
                                        <div class="d-flex align-items-center justify-content-between mt-1">
                                            <h6 class="font-weight-bold my-2"></h6>
                                            <ul class="list-inline small">
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                            </ul>
                                        </div>
                                    </div>

                                </div> <!-- End -->
                            </li> <!-- End -->
                            <!-- list group item -->
                            <li class="list-group-item">
                                <!-- Custom content-->
                                <div class="media align-items-lg-center flex-column flex-lg-row p-3">
                                    <div class="media-body order-2 order-lg-1">
                                        <h5 class="mt-0 font-weight-bold mb-2">GIÁ TOUR BAO GỒM</h5>
                                        <p class="font-italic text-muted mb-0 small">
                                            VẬN CHUYỂN: Xe du lịch từ 16 chỗ đến 45 chỗ đời mới máy lạnh, tivi, ghế bật.
                                            <br>
                                            VÉ MÁY BAY KHỨ HỒI: HCM – VÂN ĐỒN, HÀ NỘI – HCM: Hãng Vietjet Air (bao gồm 7kg hành lý xách tay và 20kg hành lý ký gửi)<br>
                                            KHÁCH SẠN: Tiêu chuẩn 2, 3 khách/phòng. Tiện nghi: tivi, nước nóng, vệ sinh...<br>
                                            + HẠ LONG: SEASTAR, NEWSTAR…<br>
                                            + HÀ NỘI: MOON VIEW…<br>
                                            + SAPA: GOLDEN SUN… Hoặc các khách sạn tương đương.<br>
                                            ĂN UỐNG:<br>
                                            + Ăn sáng ngày 01: Tô ly + Ngày 02, 03,04: Buffet (nếu ở khách sạn 3 sao)<br>
                                            + Ăn trưa, chiều: ăn tại nhà hàng ẩm thực địa phương.<br>
                                            HDV: Đoàn có HDV tiếng Việt thuyết minh và phục vụ  tham quan suốt tuyến.<br>
                                            BẢO HIỂM: Bảo hiểm du lịch theo quy định 100.000.000 VND/vụ<br>
                                            THAM QUAN: Giá tour đã bao gồm phí vào cổng tại các điểm tham quan theo chương trình<br>
                                            QUÀ TẶNG: Nón du lịch  Đất Việt, Khăn ướt và Nước đóng chai
                                        </p>
                                        <div class="d-flex align-items-center justify-content-between mt-1">
                                            <h6 class="font-weight-bold my-2"></h6>
                                            <ul class="list-inline small">
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star-o text-gray"></i></li>
                                            </ul>
                                        </div>
                                    </div>

                                </div> <!-- End -->
                            </li> <!-- End -->
                            <!-- list group item -->
                            <li class="list-group-item">
                                <!-- Custom content-->
                                <div class="media align-items-lg-center flex-column flex-lg-row p-3">
                                    <div class="media-body order-2 order-lg-1">
                                        <h5 class="mt-0 font-weight-bold mb-2">QUÝ KHÁCH VUI LÒNG CHUẨN BỊ GIẤY TỜ TÙY THÂN ĐỂ ĐI MÁY BAY
                                        </h5>
                                        <p class="font-italic text-muted mb-0 small">
                                            Người từ 14 tuổi trở lên phải có: Chứng minh nhân dân gốc hoặc hộ chiếu gốc hoăc bằng lái xe gốc, còn mới, còn hạn sử dụng<br>
                                            Trẻ em dưới 14 tuổi phải có: giấy khai sinh bản gốc hoặc hộ chiếu gốc<br>
                                            Những giấy tờ cá nhân của khách hàng (CMND hoặc Passport) thuộc về trách nhiệm của khách hàng. 
                                            Mọi vấn đề như hình ảnh, thông tin giấy tờ trong bản gốc bị mờ, không rõ ràng; Passport, CMND hết hạn,… không đúng quy định của pháp luật Việt Nam, Du Lịch Đất Việt sẽ không chịu trách nhiệm và sẽ không hoàn trả bất cứ chi phí phát sinh nào.</p>
                                        <div class="d-flex align-items-center justify-content-between mt-1">
                                            <h6 class="font-weight-bold my-2"></h6>
                                            <ul class="list-inline small">
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                                <li class="list-inline-item m-0"><i class="fa fa-star text-success"></i></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div> <!-- End -->
                            </li> <!-- End -->
                        </ul> <!-- End -->
                    </div>
                    <div class="col-md-4">

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
