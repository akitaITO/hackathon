const startButton = document.getElementById('startButton');
const mainTitle = document.getElementById('mainTitle');

if (startButton && mainTitle) {
    startButton.addEventListener('click', () => {
        mainTitle.textContent = 'Good Luck!';
        startButton.style.display = 'none'; // 버튼을 보이지 않게 처리
    });
}
