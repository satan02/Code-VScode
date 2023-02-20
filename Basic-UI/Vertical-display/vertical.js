function change(city) {
  var i, btn, disc;

  disc = document.getElementsByClassName("disc");
  for (i = 0; i < disc.length; i++) {
    disc[i].style.display = "none";
  }
  document.getElementById('city').style.display = "block";
}