 document.addEventListener("DOMContentLoaded", () => {
        const seating = document.getElementById("seating");
        const rows = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J"];
        const seatsPerRow = 15;

        rows.forEach(row => {
            const tr = document.createElement("tr");
            for (let i = 1; i <= seatsPerRow; i++) {
                const td = document.createElement("td");
                td.textContent = i;
                td.addEventListener("click", () => {
                    if (!td.classList.contains("booked") && !td.classList.contains("not-available")) {
                        td.classList.toggle("selected");
                    }
                });
                tr.appendChild(td);
            }
            seating.appendChild(tr);
        });

        // Example: Mark some seats as booked or not available
        document.querySelectorAll("#seating tr").forEach((tr, rowIndex) => {
            tr.children[3].classList.add("booked");
            tr.children[4].classList.add("booked");
            tr.children[10].classList.add("not-available");
            if (rowIndex === 8) {
                tr.children[8].classList.add("wheelchair");
                tr.children[9].classList.add("wheelchair");
            }
        });
    });