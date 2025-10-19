const loginForm = document.getElementById('loginForm');
const reservationSection = document.getElementById('reservation-section');
const cancelSection = document.getElementById('cancel-section');

// Login validation
loginForm.addEventListener('submit', function(e) {
  e.preventDefault();
  const user = document.getElementById('username').value;
  const pass = document.getElementById('password').value;

  if (user === "admin" && pass === "1234") {
    alert("Login successful!");
    document.getElementById('login-section').style.display = 'none';
    reservationSection.style.display = 'block';
  } else {
    alert("Invalid credentials! Try Username: admin, Password: 1234");
  }
});

// Reservation form
document.getElementById('reservationForm').addEventListener('submit', function(e) {
  e.preventDefault();
  alert("Ticket booked successfully!");
  cancelSection.style.display = 'block';
});

// Cancellation form
document.getElementById('cancelForm').addEventListener('submit', function(e) {
  e.preventDefault();
  const pnr = document.getElementById('pnr').value;
  alert(`Ticket with PNR ${pnr} has been cancelled successfully!`);
});
