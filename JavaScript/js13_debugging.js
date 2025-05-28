Debugging and Testing
console.log("Form submitted");

fetch("https://mockapi.io/register", {
  method: "POST",
  body: JSON.stringify({ name: "Ajay" }),
}).then(response => {
  console.log("Status:", response.status);
});