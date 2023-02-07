function change(evt, cityname) {
  var i, tabcontent, tablink;

  tabcontent = document.getElementsByClassName("block");

  for (let i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }

  tablink = document.getElementsByClassName("btn");
  for (let i = 0; i < tabcontent.length; i++) {
    tablink[i].className = tablink[i].className.replace(" active", "");
  }

  document.getElementById("cityname").style.display = "block";
  evt.currentTarget.className += " active";
}