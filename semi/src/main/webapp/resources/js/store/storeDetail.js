
        
        var value = 1;
        var baseValue = document.getElementById("#prod-price").innerText;
        
        function increaseAndMultiply(price) {
  		 value += 1; // 값 증가
    var totalPrice = value * price; // 총 가격 계산
    // 결과를 화면에 표시
    document.getElementById("quantity").innerText = value;
    document.getElementById("price").innerText = price * value + "원";
    document.getElementById("total-price").innerText = totalPrice + "원";
  }
 	
    
    