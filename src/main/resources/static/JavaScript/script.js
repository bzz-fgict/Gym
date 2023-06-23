// This code assumes that the form in your HTML file has the id 'foodForm'
const form = document.getElementById('foodForm');

form.addEventListener('submit', (event) => {
    // Prevent the default form submission
    event.preventDefault();

    // Get the values from the form
    let foodId = document.getElementById('foodId').value;
    let foodName = document.getElementById('foodName').value;
    let kcal = document.getElementById('kcal').value;
    let carbs = document.getElementById('carbs').value;
    let protein = document.getElementById('protein').value;
    let fett = document.getElementById('fett').value;

    // Prepare the data to be sent
    let foodData = {
        idfood: foodId,
        food: foodName,
        kcal: kcal,
        carbs: carbs,
        protein: protein,
        fett: fett
    };

    // Send the data to the server using Fetch API
    fetch('http://localhost:8080/food', { // Replace with your API endpoint
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(foodData)
    }).then((response) => {
        if(response.ok) {
            alert('Food data submitted successfully!');
        } else {
            throw new Error('Failed to submit food data');
        }
    }).catch((error) => {
        console.error('Error:', error);
    });
});