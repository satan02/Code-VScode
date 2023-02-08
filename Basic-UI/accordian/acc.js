var a = document.getElementsByClassName("but");
var i;

for (i = 0; i < a.length; i++) {
  addEventListener("click", function () {
    this.classList.toggle("active");

    var b = this.nextElementSibling;
    if (b.style.display === "block") {
      b.style.display = "none";
    } else {
      b.style.display = "block";
    }
  })
}