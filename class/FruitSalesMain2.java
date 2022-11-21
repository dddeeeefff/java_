class FruitSeller{     
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;

	public void initMember(int num, int money, int price){
	//����������� �ʱ�ȭ ��Ű�� �޼ҵ�
		numOfApple = num;
		myMoney = money;
		APPLE_PRICE = price;
		//�Ϲ� �޼ҵ忡���� �������� ���� ������ �� �����Ƿ� APPLE_PRICE�� ����� ������ �� ����
		//(�Ϲ� �޼ҵ忡���� ���� �� ȣ���� �� �����Ƿ� ����� ���� ����ɱ�� ������ �߻���Ŵ)
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
	int numOfApple = 0; 
	int myMoney = 10000; 
	public void buyApple(FruitSeller seller,int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;

	}
	public void showBuyResult(){
		System.out.println("��� ���� : " + numOfApple);
		System.out.println("���� �ܾ� : " + myMoney);
	}
}

class FruitSalesMain2 {
	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller();
		seller1.initMember(30,0,1500);

		FruitSeller seller2 = new FruitSeller();
		seller2.initMember(20,0,1000);

		FruitBuyer buyer = new FruitBuyer(); 
	
		buyer.buyApple(seller1, 4500); // seller1 �Ǹ��ڿ��� 4500����ġ ��� ����
		buyer.buyApple(seller2, 2000); // seller2 �Ǹ��ڿ��� 2000����ġ ��� ����		
		//���� �ٸ� �Ǹ��ڿ��� ����� ������

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
 - ������� APPLE_PRICE�� ������ �����
 - �ν��Ͻ� ������ �� ���� ����� �ʿ�1
 - initMember() �޼ҵ带 �������� ȣ���� �� �ִ�(�ٽ� ȣ��Ǹ� ������ �Ǹű���� ���µ�)

�ذ�å
 - APPLE_PRICE�� ����� ����
 - �ν��Ͻ� ������ �� ���� ������� ó��
 - �ʱ�ȭ �޼ҵ�� �� ���� ȣ��ǰ� ��(APPLE_PRICE�� ����� ������ �� �ְ� ��)
 - ��� ������ �����ڸ� ����ϸ� �ذ��
*/


//������ ������� 5��