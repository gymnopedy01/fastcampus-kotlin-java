fun main() {

    //lombok 사용시..
    val hero = Hero()
//    hero.name = "아이언맨"        //CompileError
    hero.address = "스타크타워"
    println(hero.address)

    //1. 롬복을 제하는방법 : IDE의 생성기능으로 사용
    val dHero = DelombokHero()
    dHero.name = "스타크"
    println(dHero.name)

    //2. 대부분 데이타 관련클래스가 많다. dto
    //코틀린으로 마이그레이션 하면된다.
    val heroKt = HeroKt(name="아이언맨", age=50, address="스타크타워")
    println(heroKt)

    //코틀린에서도 롬복플러그인을 제공하고있음.

}