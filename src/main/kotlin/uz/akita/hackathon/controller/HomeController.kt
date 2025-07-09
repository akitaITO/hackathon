package uz.akita.hackathon.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import uz.akita.hackathon.service.HomeService

/**
 * @Controller 애너테이션은 이 클래스가 웹 브라우저의 요청(Request)을
 * 받아 처리하는 컨트롤러(Controller)임을 Spring 에게 알려줍니다.
 * 사용자가 웹사이트에 접속하면, 스프링은 @Controller가 붙은 클래스에서
 * 요청 주소에 맞는 처리 방법을 찾아 실행합니다.
 *
 * HomeController(private val homeService: HomeService)
 * 생성자를 통해 HomeService 객체를 주입받습니다. (의존성 주입, Dependency Injection)
 * 이를 통해 컨트롤러는 서비스 계층의 기능을 사용할 수 있습니다.
 * '요리사'가 '레시피 북'을 참고하는 것과 비슷합니다.
 */

/**
 * @Controller annotatsiyasi bu klass veb-brauzerning so'rovi (Request) ni
 * qabul qilib qayta ishlaydigan kontroller (Controller) ekanligini Spring ga
 * ma'lum qiladi. Foydalanuvchi veb-saytga kirganda, Spring @Controller
 * belgilanган klassdan so'rov manzilga mos keladigan qayta ishlash usulini
 * topib ishga tushiradi.
 *
 * HomeController(private val homeService: HomeService)
 * konstruktor orqali HomeService obyektini qabul qiladi. (bog'liqlik in'ektsiyasi, Dependency Injection)
 * Bu orqali kontroller servis qatlamining funksiyalaridan foydalanishi mumkin.
 * 'Oshpaz'ning 'retsept kitobchi'ga murojaat qilishiga o'xshaydi.
 */

@Controller
class HomeController(private val homeService: HomeService) {

    /**
     * @GetMapping("/") 애너테이션은 사용자가 웹사이트의 가장 기본 주소
     * (예: http://localhost:8080/)로 GET 방식으로 접속했을 때
     * 아래의 home() 함수를 실행하라고 알려주는 역할을 합니다.
     *
     * @param model Model 객체는 컨트롤러에서 처리한 데이터를
     *              HTML 같은 뷰(View)로 전달하는 역할을 합니다.
     *              마치 편지지에 내용을 적어 편지 봉투(View)에 담아 보내는 것과 같습니다.
     * @return String 타입의 "home"은 `src/main/resources/templates` 폴더 아래에 있는
     *         `home.html` 파일을 찾아서 사용자에게 보여주라는 의미입니다.
     */

    /**
     * @GetMapping("/") annotatsiyasi foydalanuvchi veb-saytning eng asosiy manzili
     * (masalan: http://localhost:8080/)ga GET usuli bilan kirganda
     * quyidagi home() funksiyasini ishga tushirish kerakligini bildiradi.
     *
     * @param model Model obyekti kontrollerda qayta ishlangan ma'lumotlarni
     *              HTML kabi ko'rinish (View)ga uzatish vazifasini bajaradi.
     *              Xuddi xat qog'oziga mazmun yozib, xat konvertiga (View) solib yuborishga o'xshaydi.
     * @return String tipidagi "home" `src/main/resources/templates` papkasi ostidagi
     *         `home.html` faylini topib, foydalanuvchiga ko'rsatish kerakligini bildiradi.
     */

    @GetMapping("/")
    fun home(model: Model): String {
        // HomeService를 사용해서 화면에 보여줄 데이터를 가져옵니다.
        val home = homeService.getHomeMessage()

        // model.addAttribute()를 사용해서 HTML에서 사용할 수 있도록
        // "message"라는 이름으로 "Hello!" 라는 텍스트 데이터를 추가합니다.
        model.addAttribute("title", home.title)
        model.addAttribute("subTitle", home.subTitle)

        // home.html 파일을 보여줍니다.
        return "home"
    }
}