package train_system;

public class 여행객 {
	public String name;
    public String destination;
    public String start;
    
    public 여행객(String name, String destination){
    	this.name         = name;
		this.destination  = destination;
	}

    // 기차를 탄다.
    public void take_train(){
        System.out.println( ">" + name + "가 " + start +"에서 탑승");
    }

    // 기차를 내린다.
    public void leave_train(){
        System.out.println( ">" + name + "가 " + destination +"에서 내림");
    }

}
