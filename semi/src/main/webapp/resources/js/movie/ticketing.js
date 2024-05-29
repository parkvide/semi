 function getDateAfterDays(days) {
            const date = new Date();
            date.setDate(date.getDate() + days);
            const day = date.getDate();
            return `${day} day`;
        }

        // 페이지 로드 시 실행되는 함수
        window.onload = function() {
            for (let i = 0; i < 7; i++) {
                const button = document.querySelector(`.btn${i + 1}`);
                if (button) {
                    button.textContent = getDateAfterDays(i);
                }
            }
        }
        
 function cinemaList(title) {
        	 fetch(`/app/cinemas?title=${encodeURIComponent(title)}`) // /app/cinemas 여기로 백엔드 컨트롤러 하나 만들어줘야됨
            .then(response => response.json())
            .then(data => {
				console.log(data);
                const cinemaList = document.getElementById('cinemaList');
                cinemaList.innerHTML = ''; 
                
                data.forEach(cinema => {
                    const tr = document.createElement('tr');
                    const td = document.createElement('td');
                    const button = document.createElement('button');
                    button.textContent = cinema.cinemaName;
                    button.onclick = theaterList(cinemaName);
                 	
                    td.appendChild(button);
                  	tr.appendChild(td);
                  	cinemaList.appendChild(tr);
             });
              
            })
            .catch(error => console.error('Error fetching cinema:', error));
        	
         }
    
function theaterList(cinemaName) {
        fetch(`/app/cinemas?cinemaName=${encodeURIComponent(cinemaName)}`) // /app/cinemas 여기로 백엔드 컨트롤러 하나 만들어줘야됨
            .then(response => response.json())
            .then(data => {
				console.log(data);
                const cinemaList = document.getElementById('theaterList');
                cinemaList.innerHTML = ''; 
                
                data.forEach(theater => {
                    const tr = document.createElement('tr');
                    const td = document.createElement('td');
                    const button = document.createElement('button');
                    button.textContent = theater.theaterName;
                    button.onclick = () => alert(`영화 제목: ${cinemaName}, 영화관: ${theater.theaterName}`);
                 	
                    td.appendChild(button);
                  	tr.appendChild(td);
                  	cinemaList.appendChild(tr);
             });
              
            })
            .catch(error => console.error('Error fetching theater:', error));
    }
   
    
    
    // /app/cinemas 