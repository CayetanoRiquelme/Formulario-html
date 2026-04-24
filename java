window.onload = function () {
  const errorMsg = document.querySelector("#error-msg");
  const button = document.querySelector("#sendForm");

  const card = document.querySelector("#cardNumber");
  const cvc = document.querySelector("#cvc");
  const amount = document.querySelector("#amount");
  const firstName = document.querySelector("#firstName");
  const lastName = document.querySelector("#lastName");
  const city = document.querySelector("#city");
  const state = document.querySelector("#state");
  const zip = document.querySelector("#zip");
  const message = document.querySelector("#message");

  errorMsg.classList.add("d-none");

  button.addEventListener("click", function () {
    let hasError = false;

    const fields = [card, cvc, amount, firstName, lastName, city, state, zip];
    fields.forEach(field => field.classList.remove("error"));

    if (!/^\d{13,19}$/.test(card.value)) {
      card.classList.add("error");
      hasError = true;
    }

    if (!/^\d{3,4}$/.test(cvc.value)) {
      cvc.classList.add("error");
      hasError = true;
    }

    if (amount.value <= 0) {
      amount.classList.add("error");
      hasError = true;
    }

    if (firstName.value.trim() === "") {
      firstName.classList.add("error");
      hasError = true;
    }

    if (lastName.value.trim() === "") {
      lastName.classList.add("error");
      hasError = true;
    }

    if (city.value.trim() === "") {
      city.classList.add("error");
      hasError = true;
    }

    if (state.value === "") {
      state.classList.add("error");
      hasError = true;
    }

    if (!/^\d{4,10}$/.test(zip.value)) {
      zip.classList.add("error");
      hasError = true;
    }

    if (hasError) {
      errorMsg.classList.remove("d-none");
    } else {
      errorMsg.classList.add("d-none");
      alert("Form enviado correctamente ✅");
    }
  });
};
