const seatingChart = document.querySelector(".seating-chart");
seatingChart.addEventListener("click" , function(evt){
	
	if(evt.target.classList.contains("seat")){
		evt.target.classList.toggle("highlighted");
	}
	console.log(evt.target);
	
});


const generalSelect = document.getElementById("general");
const teenSelect = document.getElementById("teen");
const priceDisplay = document.querySelector(".price h2");
const seats = document.querySelectorAll(".seat");

 function calculatePrice() {
        const generalCount = parseInt(generalSelect.value);
        const teenCount = parseInt(teenSelect.value);
        const totalPrice = (generalCount * 10000) + (teenCount * 8000);
        priceDisplay.textContent = `total ${totalPrice.toLocaleString()} won`;
    }
    
 function updateSelectedSeats() {
        const totalSeatsAllowed = parseInt(generalSelect.value) + parseInt(teenSelect.value);
        const selectedSeats = seatingChart.querySelectorAll(".seat.selected").length;

        seats.forEach(seat => {
            if (selectedSeats < totalSeatsAllowed || seat.classList.contains("selected")) {
                seat.classList.remove("disabled");
            } else {
                seat.classList.add("disabled");
            }
        });
    }
 generalSelect.addEventListener("change", function() {
        calculatePrice();
        updateSelectedSeats();
    });

    teenSelect.addEventListener("change", function() {
        calculatePrice();
        updateSelectedSeats();
    });

    seatingChart.addEventListener("click", function(evt) {
        if (evt.target.classList.contains("seat") && !evt.target.classList.contains("disabled")) {
            evt.target.classList.toggle("selected");
            updateSelectedSeats();
        }
    });

    // 초기 가격 및 좌석 상태 설정
    calculatePrice();
    updateSelectedSeats();



