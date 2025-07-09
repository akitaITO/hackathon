package uz.akita.hackathon.service

import org.springframework.stereotype.Service
import uz.akita.hackathon.model.Home

/**
 * @Service 애너테이션은 이 클래스가 비즈니스 로직(Business Logic)을
 * 처리하는 서비스(Service) 계층의 컴포넌트임을 Spring 에게 알려줍니다.
 *
 * 서비스는 주로 데이터 처리, 계산, 외부 API 호출 등
 * 애플리케이션의 실질적인 기능을 담당합니다.
 * 예를 들어 '로그인 기능', '게시글 작성 기능' 등이 서비스에 해당합니다.
 * '레시피 북'에 적힌 실제 '요리 방법'이라고 생각할 수 있습니다.
 */

/**
 * @Service annotatsiyasi bu klass biznes mantiq (Business Logic) ni
 * qayta ishlaydigan servis (Service) qatlamining komponenti ekanligini
 * Spring ga ma'lum qiladi.
 *
 * Servis asosan ma'lumotlar bilan ishlash, hisoblash, tashqi API ga
 * murojaat qilish kabi ilovaning asl funksiyalarini bajaradi.
 * Masalan, 'tizimga kirish funksiyasi', 'post yozish funksiyasi' kabi
 * imkoniyatlar servisga tegishli. 'Retsept kitobchi'dagi haqiqiy
 * 'tayyorlash usuli' deb o'ylash mumkin.
 */

@Service
class HomeService {
    /**
     * getHomeMessage() 함수는 화면에 보여줄 메시지를 생성하는 역할을 합니다.
     * 지금은 "Hello!" 라는 메시지를 담은 Home 객체를 생성하여 반환(return)합니다.
     *
     * @return Home 객체를 반환합니다. 이 객체는 화면에 표시될 데이터를 담고 있습니다.
     */

    /**
     * getHomeMessage() funksiyasi ekranda ko'rsatiladigan xabarni yaratish
     * vazifasini bajaradi. Hozirda "Hello!" xabarini o'z ichiga olgan
     * Home obyektini yaratib qaytaradi (return).
     *
     * @return Home obyektini qaytaradi. Bu obyekt ekranda ko'rsatiladigan
     *         ma'lumotlarni o'z ichiga oladi.
     */

    fun getHomeMessage(): Home {
        val title: String = "AKITA Pre-University"
        val subtitle: String = "2025 HACKATHON"
        return Home(title, subtitle)
    }
}