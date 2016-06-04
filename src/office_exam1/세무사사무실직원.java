package office_exam1;

/*

class 세무사직원{
    내부기능:
	    세무소에신고하기(회사정보){}
		영수증정리하기(회사정보, 영수증정보){}
		<숫자 결과값> 세금계산하기(){ 결과값은 0; }
		
	
	외부제공기능:
        <예/아니오 결과값> 일하니()
        {
		    결과값은 Y; 			
		}
		
	    
		<숫자 결과값> 세금물어보기(고객회사){
		    
			<예/아니오> 완료됬남 = 아니오;
			
			해라{
			    화면에표시 "오랜 업무끝에...";
			    화면에표시 "세무사 사무실에 전자신고를 하다";
			} 동안(완료됬남이 거짓이라면);
			
			고객회사에게_전화로알려준다(0원);
			
		}

}

*/
public class 세무사사무실직원 {
    
	/* 외부제공 안되는 함수 */
	
	// private 처리: 그래서 외부에서는 호출도 못하고 보이지도 않음. 알고 싶지도 않음
	private void register_tax_to_goverment(){}
	private void calculate_billpapaer(String sCustomer, String sBillInfo){}
	private int  calculate_tax(){ return 0;}
	
    
	/* 외부제공되는 함수 */
	
	// 아직도 일하고 있나?
    public boolean is_working(NormalCompany customer){ 
    	return true;
    }
    
    // 세무정보를 알려준다.
    public int ask_taxinfo(NormalCompany customer){ 
        boolean bComplete = false;
        do{
        	System.out.println("오랜 업무끝에...");
        	System.out.println("세무사 사무실에서 전자신고를 하다.");
            
            bComplete = true;
            
        } while(bComplete == false);
        
        // 고객에게 알려준다.
        customer.on세무사사무실에서_전화올때(0);
        return 0;
    }
}