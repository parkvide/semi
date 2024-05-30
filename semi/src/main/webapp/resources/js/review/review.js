function writeReview(x){
	
	const reviewValue = document.querySelector("input[name=reply-content]").value;
	document.querySelector("input[name=reply-content]").value = "";
	
	s.ajax({
		url  : "http://127.0.0.1:8888/app/movie/review/write",
		type : "post",
		data : {
			"movieNo" : x,
			"content" : reviewValue,
		},
		success : function(x){
			console.log(x);
			loadReplyList(refNo);
		} ,
		fail : function(x){
			console.log(x);
		}
	});
	
	
	
}