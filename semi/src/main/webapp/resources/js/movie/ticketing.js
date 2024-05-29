        
$(document).ready(function() {
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






