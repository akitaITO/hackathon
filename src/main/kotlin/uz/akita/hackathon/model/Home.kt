package uz.akita.hackathon.model

/**
 * `data class`는 데이터를 담기 위한 목적으로 사용되는 특별한 클래스입니다.
 * Kotlin에서 `data class`로 클래스를 선언하면, 데이터를 다룰 때 유용한
 * `toString()`, `equals()`, `hashCode()`, `copy()`와 같은 함수들을
 * 자동으로 만들어 줍니다.
 *
 * Home 클래스는 화면에 보여줄 메시지(message)를 담는 역할을 합니다.
 * val message: String은 "message"라는 이름의 문자열(String) 타입의
 * 읽기 전용(val) 속성을 정의한 것입니다.
 *
 * 마치 데이터를 담는 '상자'나 '그릇'과 같은 역할을 합니다.
 */

/**
 * *`data class`* ma'lumotlarni saqlash maqsadida ishlatiladigan maxsus klass turidir.
 * Kotlin da `data class` sifatida klass e'lon qilinganda, ma'lumotlar bilan ishlashda
 * foydali bo'lgan `toString()`, `equals()`, `hashCode()`, `copy()` kabi
 * funksiyalar avtomatik ravishda yaratiladi.
 *
 * Home klassi ekranda ko'rsatiladigan xabar (message) ni saqlash vazifasini bajaradi.
 * val message: String bu "message" nomli satr (String) tipidagi
 * faqat o'qish uchun (val) xususiyatni belgilaydi.
 * Xuddi ma'lumotlarni saqlash uchun 'quti' yoki 'idish' vazifasini bajaradi.
 */

data class Home(val title: String, val subTitle: String)