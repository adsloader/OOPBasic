package oop;

/**
 * Created by park on 2016-05-31.
 *
 *  상대를 정확히 이해 못해도..
 *  내 나름대로 독립적으로 설계하고 개발할 수 있는 방법
 *  <<<Interface>>>
 */
public class InterfaceBasic {
    public static void main(String[] args) {
        MyApp   app   = new MyApp();
        MyPhone phone = new MyPhone();

        app.setPhone(phone);
        phone.setApp(app);

        phone.doSomeEvent();
    }
}

//-------------------------------------------------------------
// Interface를 정의한다.
//-------------------------------------------------------------

// App 사용위한 인터페이스
interface IApp{
    public void onCreate();
    public void onClick(String source);
}

// Phone 사용위한 인터페이스
interface IPhone{
    public void showMessage(String sMessage, String sColor);
}

//-------------------------------------------------------------
// Interface를 구현한다.
//-------------------------------------------------------------

// App을 구현
class MyApp implements IApp{
    private IPhone phone;

    @Override
    public void onCreate() {
        phone.showMessage("생성되었습니다", "red");
    }

    @Override
    public void onClick(String source) {
        phone.showMessage(source + " click!", "blue");
    }

    public void setPhone(IPhone phone){
        this.phone = phone;
    }
}

// Phone을 구현
class MyPhone implements IPhone{
    private IApp app;

    @Override
    public void showMessage(String sMessage, String sColor) {
        System.out.println("color: " + sColor + "\nmessage:" + sMessage );
    }

    public void setApp(IApp app){
        this.app = app;
    }

    public void doSomeEvent(){
        app.onCreate();
        app.onClick("btnOk");
    }
}
