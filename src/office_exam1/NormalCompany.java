package office_exam1;


/*
 
class 일반회사{
    필요한 것들:
	    세무사직원 여사우;
		
	외부제공기능:
        세금신고하기()
        {
		    여사우가 일하는지 체크하기;
            만약 일한다면{
			    화면에표시 "세무사 직원은 우리 일하고 있다";
			}
			
			여사우에게 세금정보요청();
             			
		}
		
	어떠할 때:
	    
		세무사직원이_전화올_때(금액정보){
		    화면에표시 "신고할 세금은 ?" + 금액정보 + " 원"; 
		}

}

*/

public class NormalCompany{
    
	// 세무사 사무실 직원 선언
	public 새무사사무실직원 taxgirl = new 새무사사무실직원();
    
    // 세금신고를 한다.
    public void send_tax_info(){
        int nOurtax = 0;
        boolean bWork = taxgirl.is_working(this);
        if(bWork){
            System.out.println("세무사 직원은 일하고 있다.");
        }    
        
        // 세금정보를 알려주삼. <-- 일반적으로 바로 알려주지 않음.
        // 비동기적으로 결과를 줌.
        taxgirl.ask_taxinfo(this);
    } 
    
    // 세무사 사무실에서 전화올 때
    // 즉, 이벤트핸들러임.
    public void on세무사사무실에서_전화올때(int nTaxMoney){
        System.out.println("신고할 세금은 ? " + nTaxMoney + " 원");
    }
}