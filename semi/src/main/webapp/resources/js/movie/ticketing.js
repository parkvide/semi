      
/*$(document).ready(function() {
    $(".titlebtn").click(function() {
        var movietitle = $(this).text();
        console.log(movietitle);
        $.ajax({
            url: "http://127.0.0.1:8888/app/cinemas",
            type: "GET",
            data: { "movietitle": movietitle },
            success: function(response) {
				 console.log(response);
                var cinemas = response.cinemas;
                
                var tableHtml = "";
                cinemas.forEach(function(cinema) {
                    tableHtml += "<tr class='loc'><td class='mtd'><button onclick='theaterList();' class='cinemabtn' data-cinematitle='${vo.cinemaName}'" + cinema.cinemaName + "'>" + cinema.cinemaName + "</button></td></tr>";
                });
                $("#cinemaNameSelect").html(tableHtml);
            },
            error: function(error) {
                console.log("Error:", error);
            }
            
        });
    });
});

function theaterList() {
    $(".cinemabtn").click(function() {
		
        var cinemaName = $(this).text();
        console.log(cinemaName);
        $.ajax({
            url: "http://127.0.0.1:8888/app/cinemas",
            type: "GET",
            data: { "cinemaName": cinemaName },
            success: function(response) {
				 console.log(response);
                var theaters = response.theaters;
                
                var tableHtml = "";
                theaters.forEach(function(theater) {
                    tableHtml += "<tr class='loc'><td class='mtd'><button onclick='dateList();' class='theaterbtn' data-theaterName='${vo.theater}'" + theater.theaterName + "'>" + theater.theaterName + "</button></td></tr>";
                });
                $("#theaterNameSelect").html(tableHtml);
            },
            error: function(error) {
                console.log("Error:", error);
            }
            
        });
    });
}
function dateList() {
    $(".theaterbtn").click(function() {
        var today = new Date();
        var tableHtml = "";
		console.log(today);
        for (var i = 0; i < 7; i++) {
            var date = new Date();
            date.setDate(today.getDate() + i);
            var day = date.getDate();
            var dateStr = day +' day';
            tableHtml += "<tr><td><button onclick='timeList();' class='datebtn' date-screeningDate='${vo.screeninDate}'>" + dateStr + "</button></td></tr>";
        }
     

        $("#movieDateSelect").html(tableHtml);
    });
}
function timeList() {
    $(".datebtn").click(function() {
		
        var cinemaName = $(this).text();
        console.log(cinemaName);
        $.ajax({
            url: "http://127.0.0.1:8888/app/cinemas",
            type: "GET",
            data: { "cinemaName": cinemaName },
            success: function(response) {
				 console.log(response);
                var times = response.times;
                
                var tableHtml = "";
                times.forEach(function(time) {
                    tableHtml += "<tr class='loc'><td class='mtd'><button class='timebtn'" + time.screeningDate + "'>" + time.screeningDate + "</button></td></tr>";
                });
                $("#movieTimeSelect").html(tableHtml);
            },
            error: function(error) {
                console.log("Error:", error);
            }
            
        });
    });
}
*/
$(document).ready(function() {
    $(".titlebtn").click(function() {
        var movietitle = $(this).text();
        console.log(movietitle);
        localStorage.setItem('movietitle', movietitle); // 영화 제목 저장
        $.ajax({
            url: "http://127.0.0.1:8888/app/cinemas",
            type: "GET",
            data: { "movietitle": movietitle },
            success: function(response) {
                console.log(response);
                var cinemas = response.cinemas;
                
                var tableHtml = "";
                cinemas.forEach(function(cinema) {
                    tableHtml += "<tr class='loc'><td class='mtd'><button onclick='theaterList();' class='cinemabtn' data-cinematitle='" + cinema.cinemaName + "'>" + cinema.cinemaName + "</button></td></tr>";
                });
                $("#cinemaNameSelect").html(tableHtml);
            },
            error: function(error) {
                console.log("Error:", error);
            }
        });
    });
});

function theaterList() {
    $(".cinemabtn").click(function() {
        var cinemaName = $(this).text();
        console.log(cinemaName);
        localStorage.setItem('cinemaName', cinemaName); // 영화관 이름 저장
        $.ajax({
            url: "http://127.0.0.1:8888/app/cinemas",
            type: "GET",
            data: { "cinemaName": cinemaName },
            success: function(response) {
                console.log(response);
                var theaters = response.theaters;
                
                var tableHtml = "";
                theaters.forEach(function(theater) {
                    tableHtml += "<tr class='loc'><td class='mtd'><button onclick='dateList();' class='theaterbtn' data-theatername='" + theater.theaterName + "'>" + theater.theaterName + "</button></td></tr>";
                });
                $("#theaterNameSelect").html(tableHtml);
            },
            error: function(error) {
                console.log("Error:", error);
            }
        });
    });
}

function dateList() {
    $(".theaterbtn").click(function() {
        var theaterName = $(this).text();
        console.log(theaterName);
        localStorage.setItem('theaterName', theaterName); // 상영관 이름 저장

        var today = new Date();
        var tableHtml = "";
        console.log(today);
        for (var i = 0; i < 7; i++) {
            var date = new Date();
            date.setDate(today.getDate() + i);
            var day = date.getDate();
            var dateStr = day + ' day';
            tableHtml += "<tr><td><button onclick='timeList();' class='datebtn' data-screeningdate='" + dateStr + "'>" + dateStr + "</button></td></tr>";
        }
        $("#movieDateSelect").html(tableHtml);
    });
}

function timeList() {
    $(".datebtn").click(function() {
        var screeningDate = $(this).text();
        console.log(screeningDate);
        localStorage.setItem('screeningDate', screeningDate); // 날짜 저장
        $.ajax({
            url: "http://127.0.0.1:8888/app/cinemas",
            type: "GET",
            data: { "screeningDate": screeningDate },
            success: function(response) {
                console.log(response);
                var times = response.times;
                
                var tableHtml = "";
                times.forEach(function(time) {
                    tableHtml += "<tr class='loc'><td class='mtd'><button class='timebtn' data-screeningtime='" + time.screeningTime + "'>" + time.screeningTime + "</button></td></tr>";
                });
                $("#movieTimeSelect").html(tableHtml);
            },
            error: function(error) {
                console.log("Error:", error);
            }
        });
    });
}

$(document).on('click', '.timebtn', function() {
    var screeningTime = $(this).text();
    console.log(screeningTime);
    localStorage.setItem('screeningTime', screeningTime); // 시간 저장
});

$("#submitbtn").click(function(e) {
    e.preventDefault();
    $("#selectedMovieTitle").val(localStorage.getItem('movietitle'));
    $("#selectedCinemaName").val(localStorage.getItem('cinemaName'));
    $("#selectedTheaterName").val(localStorage.getItem('theaterName'));
    $("#selectedScreeningDate").val(localStorage.getItem('screeningDate'));
    $("#selectedScreeningTime").val(localStorage.getItem('screeningTime'));
    $("#frm").submit();
});