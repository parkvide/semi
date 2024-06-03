function loadCinemaList(cinemaLocation){
	
	$.ajax({
		url : "http://127.0.0.1:8888/app/cinema/detail",
		method : "GET" ,
		data:{"cinemaLocation": cinemaLocation},
		success:function(data){
			const cinemaNameList = JSON.parse(data);
			console.log(cinemaNameList);
			
			let str = "";
				str += "<ul>";
			for(let i = 0; i < cinemaNameList.length; i++){
				str += `<li><button onclick="loadCinemaDetail(`+ cinemaNameList[i].cinemaName+`);">`+cinemaNameList[i].cinemaName+"</button></li>";
			}
				str += "</ul>";
				
				
			const cinemaList = document.querySelector(".cinema_name");
			cinemaList.innerHTML = str;
		},
		error:function(error){
			console.log(error);
		},
	});
}


function loadCinemaDetail(cinemaName){
	
	$.ajax({
		url : "http://127.0.0.1:8888/app/cinema/detail",
		method : "POST",
		data:{"cinemaName":cinemaName},
		seccess : function(data){
			const CinemaVo = JSON.parse(data);
			console.log(CinemaVo);
			
			let str = "";
			str += `<span class="name">`+ CinemaVo.cinemaName +"</span>";
			str += `<div class="cinema_img">`;
			str += "<img src="+CinemaVo.cinemaImg+">";
			str += "</div>";
			str +=	   `<div class="cinema_detail">`;
			str += `<div class="address">`;
			str += "<pre>";
	        str +=     "<h3>";
	        str +=     CinemaVo.cinemaAddress;
	        str +=     CinemaVo.cinemaTel;
	        str +=     "4관 / 400석";
	        str +=     "</h3>";
            str += "</pre>";
			str += "</div>";
			str += `<div class="parking_detail">`;
			str += "<pre>";
			str +=     CinemaVo.cinemaContent;
           	str += "</pre>";
			str += "</div>";
			str += "</div>";
			str += "</div>";
			
			
			const cinemaDetail = document.querySelector(".detail_area");
			cinemaDetail.innerHTML = str;
		},
		error : function(){
			console.log(error);
		}
	});
}