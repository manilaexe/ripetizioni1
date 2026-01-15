const display = document.getElementById("display");
const buttons = document.getElementById("buttons");

let current = "";

buttons.addEventListener("click", (e) => {
  const value = e.target.dataset.value;
  if (!value) return;

  if (value === "C") {
    current = "";
    display.textContent = "0";
    return;
  }

  if (value === "=") {
    try {
      const expression = current.replace(",", ".");
      const result = eval(expression);
      display.textContent = result.toString().replace(".", ",");
      current = result.toString();
    } catch {
      display.textContent = "Errore";
    }
    return;
  }

  // Controllo virgola
  if (value === ",") {
    const lastNumber = current.split(/[\+\-\*\/]/).pop();
    if (lastNumber.includes(",")) return; // già presente una virgola
  }

  // Controllo zero
  const lastChar = current.slice(-1);
  const lastNumber = current.split(/[\+\-\*\/]/).pop();

  if (value === "0") {
    if (lastNumber === "0") return; // evita 00
    if (/[\+\-\*\/]0$/.test(current)) return; // evita +00
  }

  current += value;
  display.textContent = current;
});
