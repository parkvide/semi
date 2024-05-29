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
        
