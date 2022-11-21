class FruitSeller{     
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;

	public void initMember(int num, int money, int price){
	//멤버변수들을 초기화 시키는 메소드
		numOfApple = num;
		myMoney = money;
		APPLE_PRICE = price;
		//일반 메소드에서는 멤버상수에 값을 지정할 수 없으므로 APPLE_PRICE를 상수로 선언할 수 없음
		//(일반 메소드에서는 여러 번 호출할 수 있으므로 상수의 값이 변경될까봐 오류를 발생시킴)
	}
	public int saleApple(int money){
		int num = money / APPLE_PRICE;
		myMoney += money;
		numOfApple -= num; 
		return num; 
	}
	public void showSaleResult (){
		System.out.println("보유 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer{ 
	int numOfApple = 0; 
	int myMoney = 10000; 
	public void buyApple(FruitSeller seller,int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;

	}
	public void showBuyResult(){
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}

class FruitSalesMain2 {
	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller();
		seller1.initMember(30,0,1500);

		FruitSeller seller2 = new FruitSeller();
		seller2.initMember(20,0,1000);

		FruitBuyer buyer = new FruitBuyer(); 
	
		buyer.buyApple(seller1, 4500); // seller1 판매자에게 4500원어치 사과 구매
		buyer.buyApple(seller2, 2000); // seller2 판매자에게 2000원어치 사과 구매		
		//각기 다른 판매자에게 사과를 구매함

		System.out.println("사과 판매자1 현황");
		seller1.showSaleResult(); 

		System.out.println("사과 판매자2 현황");
		seller2.showSaleResult(); 

		System.out.println("사과 구매자 현황");
		buyer.showBuyResult(); 
	}
}

/*
문제점
 - 상수였던 APPLE_PRICE가 변수로 변경됨
 - 인스턴스 생성시 두 개의 명령이 필요1
 - initMember() 메소드를 언제든지 호출할 수 있다(다시 호출되면 기존의 판매기록이 리셋됨)

해결책
 - APPLE_PRICE를 상수로 지정
 - 인스턴스 생성시 한 개의 명령으로 처리
 - 초기화 메소드는 한 번만 호출되게 함(APPLE_PRICE를 상수로 지정할 수 있게 됨)
 - 모든 문제는 생성자를 사용하면 해결됨
*/


//구매한 사과갯수 5개