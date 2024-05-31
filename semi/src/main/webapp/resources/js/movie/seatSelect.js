

document.addEventListener("DOMContentLoaded", function() {
    const selectMovie = localStorage.getItem("movietitle");
    const selectMovieElement = document.querySelector("#selectMovie");
    selectMovieElement.innerText = selectMovie;

    const generalSelect = document.getElementById("general");
    const teenSelect = document.getElementById("teen");
    const priceDisplay = document.querySelector(".price h2");
    const seatingChart = document.querySelector(".seating-chart");
    const seats = document.querySelectorAll(".seat");

    function calculatePrice() {
        const generalCount = parseInt(generalSelect.value);
        const teenCount = parseInt(teenSelect.value);
        const totalPrice = (generalCount * 10000) + (teenCount * 8000);
        priceDisplay.textContent = `총 ${totalPrice.toLocaleString()} 원`;
        localStorage.setItem("totalPrice", totalPrice);
    }

    function updateSelectedSeats() {
        const generalCount = parseInt(generalSelect.value);
        const teenCount = parseInt(teenSelect.value);
        const totalSeatsAllowed = generalCount + teenCount;
        const selectedSeats = seatingChart.querySelectorAll(".seat.selected").length;

        seats.forEach(seat => {
            if (selectedSeats < totalSeatsAllowed || seat.classList.contains("selected")) {
                seat.classList.remove("disabled");
            } else {
                seat.classList.add("disabled");
            }
        });

        // Save selected seats to localStorage
        const selectedSeatNumbers = Array.from(seatingChart.querySelectorAll(".seat.selected"))
            .map(seat => seat.classList[1]);
        localStorage.setItem("selectedSeats", JSON.stringify(selectedSeatNumbers));
    }

    generalSelect.addEventListener("change", function() {
        calculatePrice();
        updateSelectedSeats();
        saveSeatCountToLocalStorage();
    });

    teenSelect.addEventListener("change", function() {
        calculatePrice();
        updateSelectedSeats();
        saveSeatCountToLocalStorage();
    });

    seatingChart.addEventListener("click", function(evt) {
        if (evt.target.classList.contains("seat") && !evt.target.classList.contains("disabled")) {
            evt.target.classList.toggle("selected");
            updateSelectedSeats();
        }
    });

    // Load selected seats from localStorage
    function loadSelectedSeats() {
        const selectedSeats = JSON.parse(localStorage.getItem("selectedSeats")) || [];
        selectedSeats.forEach(seatNumber => {
            const seat = document.querySelector(`.${seatNumber}`);
            if (seat) seat.classList.add("selected");
        });
    }

    // Load seat count from localStorage
    function loadSeatCountFromLocalStorage() {
        const generalCount = localStorage.getItem("generalCount");
        const teenCount = localStorage.getItem("teenCount");
        if (generalCount) generalSelect.value = generalCount;
        if (teenCount) teenSelect.value = teenCount;
    }

    // Save seat count to localStorage
    function saveSeatCountToLocalStorage() {
        localStorage.setItem("generalCount", generalSelect.value);
        localStorage.setItem("teenCount", teenSelect.value);
    }

    // Initial setup
    loadSeatCountFromLocalStorage();
    calculatePrice();
    updateSelectedSeats();
    loadSelectedSeats();
});

document.addEventListener("DOMContentLoaded", function() {
        const checkoutBtn = document.getElementById("checkoutBtn");
        
        checkoutBtn.addEventListener("click", function() {
            // Get selected seats and total price from localStorage
            const selectedSeats = JSON.parse(localStorage.getItem("selectedSeats")) || [];
            const totalPrice = localStorage.getItem("totalPrice") || 0;

            // Create Ticketing VO and set values
            const TicketingVo = {
                selectedSeats: selectedSeats,
                totalPrice: totalPrice
            };

            // Perform AJAX request to save ticketing VO
            // Example: You may send this data to a server using fetch or XMLHttpRequest

            // Clear localStorage after checkout
            localStorage.removeItem("selectedSeats");
            localStorage.removeItem("totalPrice");

            // Redirect or show success message
            alert("결제가 완료되었습니다!");
            // window.location.href = "/payment-success-page";
        });
    });