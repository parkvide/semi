document.addEventListener("DOMContentLoaded", () => {
  const sideMenuToggle = document.querySelector(".side-menu-movies");
  const menuLists = document.querySelector(".menu-lists");
  sideMenuToggle.addEventListener("click", () => {
    menuLists.classList.toggle("hidden");
  })

})

document.addEventListener("DOMContentLoaded", () => {
  const sideMenuToggle = document.querySelector(".side-menu-theater");
  const menuLists = document.querySelector(".theater-lists");
  sideMenuToggle.addEventListener("click", () => {
    menuLists.classList.toggle("hidden");
  });
});

document.addEventListener("DOMContentLoaded", () => {
  const sideMenuToggle = document.querySelector(".side-menu-evt");
  const menuLists = document.querySelector(".evt-lists");
  sideMenuToggle.addEventListener("click", () => {
    menuLists.classList.toggle("hidden");
  });
});

document.addEventListener("DOMContentLoaded", () => {
  const sideMenuToggle = document.querySelector(".side-menu-not");
  const menuLists = document.querySelector(".not-lists");
  sideMenuToggle.addEventListener("click", () => {
    menuLists.classList.toggle("hidden");
  });
});

document.addEventListener("DOMContentLoaded", () => {
  const sideMenuToggle = document.querySelector(".side-menu-store");
  const menuLists = document.querySelector(".store-lists");
  sideMenuToggle.addEventListener("click", () => {
    menuLists.classList.toggle("hidden");
  });
});