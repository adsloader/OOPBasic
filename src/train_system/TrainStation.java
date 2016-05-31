package  train_system;

public class TrainStation {
    public static void main(String [] args){
    	FastTrain train = new FastTrain();
    	
    	// 태우고 이동
    	Passenger person1 = new Passenger("박모씨", "부산");
    	Passenger person2 = new Passenger("김모씨", "천안");
    	train.passenger_in_train(person1);
    	train.passenger_in_train(person2);
    	train.GoNextStation();
    	
    	// 태우고 이동
    	Passenger person3 = new Passenger("한모씨", "부산");
    	train.passenger_in_train(person3);
    	
    	// 이동
    	train.GoNextStation();
    	train.GoNextStation();
    	train.GoNextStation();
    	train.GoNextStation();
    	
    }
}
