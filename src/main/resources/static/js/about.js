(function() {
    let homeLink = document.getElementById("home-link");
    if(homeLink.classList.contains("active")) {
        homeLink.classList.remove("active");
    }
    document.getElementById("about-link").classList.add('active');
})();