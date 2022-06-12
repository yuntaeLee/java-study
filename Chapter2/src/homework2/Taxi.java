package homework2;

public class Taxi {
	
	String TaxiCompanyName;
	int money;
	
	Taxi(String TaxiCompanyName) {
		this.TaxiCompanyName = TaxiCompanyName;
	}
	
	public void Take(int money) {
		this.money += money;
	}
	
	public void ShowTaxiInfo() {
		System.out.println(TaxiCompanyName + " 회사의 수입은"+ money + "원 입니다.");
	}

}
