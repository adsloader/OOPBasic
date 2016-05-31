package oop;

/**
 * Created by park on 2016-05-31.
 * Abstract Class 덕분에 코드량을 줄일 수 있습니다.
 * 만약 포켓몬 게임을 만들고 캐릭터를 자바로 구현해야 한다면,
 * Abstract 클래스를 사용하지 않으면
 * 캐릭터가 하나 생길 때마다 소스코드를 똑같은 로직으로 늘려야 합니다.
 *
 */
public class AbstarctBasic {
    public static void main(String[] args) {
        new AbstarctBasic().doActionEvent();
    }

    public void doActionEvent(){
        Player p  = new Paladin();
        Player p2 = new WitchDoctor();

        p.attck();
        p2.defend();

        p2.attck();
        p.defend();

        p.drinkRedBottle();
        p2.drinkRedBottle();
    }
}

// inner class

/*
*
*      일반개발자들이 사용하기 편하게 시스템에서 구현한 클래스
*
* */
// 게임에서 필요한 Player
abstract class Player{
    public void shout(String sMessage){
        String sIam = this.getClass().getName();
        System.out.println(sIam + ":>" + sMessage);
    }

    // 상속받은 클래스들이 알아서 구현해라.
    abstract void attck();
    abstract void defend();
    abstract void drinkRedBottle();
}

/*
*
*      여기서부터 일반 개발자들이 사용하는 코드
*
* */
class Paladin extends Player{
    @Override
    void attck() {
        shout("[공격] 빛의 축복으로 빛나는 나의 철퇴를 받아라!! 악마들아!");
    }

    @Override
    void defend() {
        shout("[방어] 신의 축복으로 너의 공격은 무의미 해질 것이다");
    }

    @Override
    void drinkRedBottle() {
        shout("[마시자] 솟아라! 힘...");
    }
}

class WitchDoctor extends Player{
    @Override
    void attck() {
        shout("[공격]저주를 받아라..!#@$%$@%^%^%");
    }

    @Override
    void defend() {
        shout("[방어]어둠의 아우라여 나를 보호하라.. @#@!!!!");
    }

    @Override
    void drinkRedBottle() {
        shout("[마시자]쿠에에억~");
    }
}