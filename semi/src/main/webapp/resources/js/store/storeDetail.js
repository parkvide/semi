    // Assume vo.price is a JavaScript variable with the price value
        var vo = { price: 1000 }; // Replace with actual value

        var quantity = 1;
        var price = vo.price;
        
        var quantityElement = document.getElementById('quantity');
        var totalPriceElement = document.getElementById('total-price');
        var incrementButton = document.getElementById('increment');

        function updatePrice() {
            var total = quantity * price;
            quantityElement.textContent = quantity + ' * ' + price + ' 원';
            totalPriceElement.textContent = '총 구매금액 ' + quantity + ' * ' + price + ' 원';
        }

        incrementButton.addEventListener('click', function() {
            quantity++;
            updatePrice();
        });

        // Initialize the price on page load
        updatePrice();