package oop;

/**
 * Created by park on 2016-05-31.
 */
public class ExtendsBasic {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.crying();
        ani.eat();

        Dog dog = new Dog();
        dog.crying();
        dog.eat();

        동네나쁜형 명식이 = new 동네나쁜형();
        명식이.eat();
        명식이.crying();

    }
}

class Animal {
    public String getMyName(){
        return this.getClass().toString();
    }
    public void eat(){
        System.out.println(getMyName() +  ":@%@#%^!~");
    }

    public void crying(){
        System.out.println(getMyName() + ":khaa~~~");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(getMyName() +"사료먹는다");
    }

    @Override
    public void crying() {
        System.out.println(getMyName() +"멍");
    }
}

// 동네나쁜형은 하는 일이 없다.
// 결국 짐승과 다른 점을 찾기 힘들다.
class 동네나쁜형 extends Animal{

}
