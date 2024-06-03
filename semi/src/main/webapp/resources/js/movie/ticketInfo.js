document.addEventListener("DOMContentLoaded", function() {
   const movieTitle = localStorage.getItem("movietitle");
   const cinemaName = localStorage.getItem("cinemaName");
   const theaterName= localStorage.getItem("theaterName");
   const seatNo = localStorage.getItem("selectedSeats");
   const teenCount = localStorage.getItem("teenCount");
   const generalCount = localStorage.getItem("generalCount");
   const screeningDate = localStorage.getItem("screeningDate");
   const screeningTime = localStorage.getItem("screeningTime");
   const price = localStorage.getItem("totalPrice");
  
   
    const title = document.querySelector("#title");
    const cinema = document.querySelector("#cinema");
    const theater = document.querySelector("#theater");
    const seat = document.querySelector("#seat");
    const teen = document.querySelector("#teen");
    const general = document.querySelector("#general");
    const date = document.querySelector("#date");
    const time = document.querySelector("#time");
    const total = document.querySelector("#price");
    
    title.innerText = movieTitle;
    cinema.innerText = cinemaName;
    theater.innerText = theaterName;
    seat.innerText = seatNo;
    teen.innerText = teenCount;
    general.innerText = generalCount;
    date.innerText = screeningDate;
    time.innerText = screeningTime;
    total.innerText = price;
    
    
});