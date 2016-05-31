package office_exam1;

public class TaxOffice{
    
	/*
     세무소는 정말 편함. 단 2줄에 신고처리 가능함.
	 생각할 것이 적으면 적을 수록 좋은 코드가 나옴
	*/
	
	// 프로그램이 실행되면 반드시 실행되는 함수
    public static void main(String []args){
    	
    	// 회사를 선언하고
    	NormalCompany poolCompany = new NormalCompany();
    	
    	// 회사 세금신고해라.
    	poolCompany.send_tax_info();
    }
}
