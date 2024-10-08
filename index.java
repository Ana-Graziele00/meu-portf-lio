/*================== toggle icon navbar ==================*/
let menuIcon = document.querySelector('#menu-icon');
let navbar = document.querySelector('.navbar');

menuIcon.onclick = () => {
    menuIcon.classList.toggle('bx-x');
    navbar.classList.toggle('active');
};

/*================== scroll sections active link ==================*/
let sections = document.querySelectorAll('section');
let navLinks = document.querySelectorAll('header nav a');

window.onscroll = () => {
    sections.forEach(sec => {
        let top = window.scrollY;
        let offset = sec.offsetTop - 150;
        let height = sec.offsetHeight;
        let id = sec.getAttribute('id');

        if (top >= offset && top < offset + height) {
            navLinks.forEach(link => {
                link.classList.remove('active');
                document.querySelector('header nav a[href*=' + id + ']').classList.add('active');
            });
        }
    });

    /*================== sticky header ==================*/
    let header = document.querySelector('header');
    header.classList.toggle('sticky', window.scrollY > 100);
};

/*================== remove toggle icon and navbar when click (scroll) ==================*/
menuIcon.classList.toggle('bx-x');
navbar.classList.toggle('active');

/*================== scroll reveal ==================*/
ScrollReveal({
    // reset: true,
    distance: '80px',
    duration: 2000,
});

ScrollReveal().reveal('.home-content, .heading', { origin: 'top' });
ScrollReveal().reveal('.home-img, .habilidades-container, .portfolio-box, .contato form', { origin: 'left' });
ScrollReveal().reveal('.home-content p, .sobre-content', { origin: 'right' });