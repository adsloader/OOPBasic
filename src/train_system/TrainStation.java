package  train_system;

public class TrainStation {
    public static void main(String [] args){
    	KTX열차 train = new KTX열차();
    	
    	// 태우고 이동
    	여행객 person1 = new 여행객("박모씨", "부산");
    	여행객 person2 = new 여행객("김모씨", "천안");
    	train.passenger_in_train(person1);
    	train.passenger_in_train(person2);
    	train.GoNextStation();
    	
    	// 태우고 이동
    	여행객 person3 = new 여행객("한모씨", "부산");
    	train.passenger_in_train(person3);
    	
    	// 이동
    	train.GoNextStation();
    	train.GoNextStation();
    	train.GoNextStation();

		train.GoNextStation();
	}
}
