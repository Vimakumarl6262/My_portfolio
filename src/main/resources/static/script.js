// src/main/resources/static/script.js
document.addEventListener('DOMContentLoaded', () => {
    // Initialize AOS (Animate On Scroll) library
    // This will handle the smooth fade-in/zoom-in animations as you scroll
    AOS.init({
        duration: 1000, // animation duration
        once: true,    // whether animation should happen only once - while scrolling down
        offset: 100,   // offset (in px) from the top of the screen to trigger animations
        delay: 50,     // values from 0 to 3000, with step 50ms
    });

    // Typing Effect for Subtitle
    // Make sure the subtitle paragraph has id="typing-subtitle" in index.html
    const subtitleElement = document.getElementById('typing-subtitle');
    if (subtitleElement) { // Check if element exists before trying to animate
        const originalText = subtitleElement.textContent;
        subtitleElement.textContent = ''; // Clear content initially
        let charIndex = 0;
        const typingSpeed = 50; // milliseconds per character

        function typeWriter() {
            if (charIndex < originalText.length) {
                subtitleElement.textContent += originalText.charAt(charIndex);
                charIndex++;
                setTimeout(typeWriter, typingSpeed);
            }
        }
        // Start typing effect after a short delay
        setTimeout(typeWriter, 500);
    }


    // Smooth scrolling for internal links (e.g., View Projects)
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();

            // Handle the case where href is just #projects (and not /#projects) for smooth scrolling
            const targetId = this.getAttribute('href').substring(1); // Remove the #
            const targetElement = document.getElementById(targetId);

            if (targetElement) {
                targetElement.scrollIntoView({
                    behavior: 'smooth'
                });
            }
        });
    });
});