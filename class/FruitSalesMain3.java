class FruitSeller{     
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;

	public FruitSeller(int num, int money, int price){ //void x
		numOfApple = num;
		myMoney = money;
		APPLE_PRICE = price;
		//�����ڿ��� �ʱ�ȭ �ϹǷ� ����� ������ �� �ִ�.
	}
	public int saleApple(int money){
		int num = money / APPLE_PRICE;
		myMoney += money;
		numOfApple -= num; 
		return num; 
	}
	public void showSaleResult (){
		System.out.println("���� ��� : " + numOfApple);
		System.out.println("�Ǹ� ���� : " + myMoney);
	}
}

class FruitBuyer{ 
	int numOfApple; 
	int myMoney; 
	public FruitBuyer(int num, int money){
		numOfApple = num;
		myMoney = money;
	}
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;

	}
	public void showBuyResult(){
		System.out.println("��� ���� : " + numOfApple);
		System.out.println("���� �ܾ� : " + myMoney);
	}
}

class FruitSalesMain3 {
	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller(30,0,1500);
		FruitSeller seller2 = new FruitSeller(20,0,1000);

		FruitBuyer buyer = new FruitBuyer(0, 10000);
	
		buyer.buyApple(seller1, 4500); 
		buyer.buyApple(seller2, 2000); 	


		System.out.println("��� �Ǹ���1 ��Ȳ");
		seller1.showSaleResult(); 

		System.out.println("��� �Ǹ���2 ��Ȳ");
		seller2.showSaleResult(); 

		System.out.println("��� ������ ��Ȳ");
		buyer.showBuyResult(); 
	}
}

/*
������
 - Main4

�ذ�å
 - Main5
*/