package  train_system;
import java.util.ArrayList;

public class KTX열차 {
	
	// 필요한 것들. 정착역, 손님리스트, 현재 정착역 위치
	String [] Stations = {"서울역", "천안", "대전", "대구", "부산"};
	ArrayList <여행객> customer = new ArrayList <여행객>();
	int nCurrent = 0;
	
	// 여행객이 승차한다.
	public void passenger_in_train(여행객 person){
		String sNowStation = Stations[nCurrent];
		if (!person.destination.equals(sNowStation)){
			person.start = sNowStation;
			person.take_train();
			customer.add(person);
			
		}
		
	}
	
	// 여행객이 하차한다.
    void passenger_out_train(){
    	
		for(int i =0; i< customer.size(); i++){
			여행객 p = customer.get(i);
			String sNowStation = Stations[nCurrent];
			if(p.destination.equals(sNowStation)){
			    p.leave_train();
				    	
			}
		}
	}
    
    // 다음역으로 이동
    public void GoNextStation(){
    	
    	// 종착역이 아닐경우
    	if (nCurrent < Stations.length){
    		passenger_out_train();
    		
    	} 
    	
    	// 종착역일 경우
    	if(nCurrent == Stations.length -1){
    		customer.removeAll(customer);
    		System.out.println("종착역입니다.");
    		
    		customer.removeAll(customer);
        	
    	}
    	
    	String sNowStation = Stations[nCurrent];
    	System.out.println("현재역은--->" + sNowStation);
    	System.out.println("-------------------------");
    	
    	
    	// 다음역으로 위치를 +1
    	nCurrent++;
    }
}
