/*
��� �Ǹ� �� ���� ���α׷�

��� �Ǹ��� : class FruitSeller
 - ������ �� ��(�������, ������) : ��� ��������, ��� ����(������), �����
 - ������ �� ���(�޼ҵ�) : �Ǹ�(), ����Ȳ����()

��� ������ : class FruitBuyer
 - ������ �� ��(�������, ������) : ��� ������ ��, ������ ��� ����
 - ������ �� ���(�޼ҵ�) : ����(), ����Ȳ����()

���α׷� ���� : class FruitSalesMain1
 - �Ǹ��ڿ� �������� �ν��Ͻ��� �����Ͽ� ��� �Ǹ� �� ���Ÿ� ��Ű�� ��Ȳ�� ��
*/
class FruitSeller{ // ��� �Ǹ��� Ŭ����    
	int numOfApple = 20; // ��� ���� ����
	int myMoney = 0; // �����
	final int APPLE_PRICE = 1000; // ��� ����
	public int saleApple(int money){
	// ��� �Ǹ� �޼ҵ�(�����ڿ��� ������� �޾� �׿� �ش�Ǵ� ��������� �����ϴ� �޼ҵ�)
		int num = money / APPLE_PRICE;
		// �Ǹŵ� ��� ������ ���ϴ� ������ �����ڰ� �� �� ��ŭ ��������� ����
		myMoney += money; // �����ڰ� �� ����ŭ ����� ����
		numOfApple -= num; // �Ǹ��� ������� ��ŭ �������� ����
		return num; // �����ڿ��� ����� �ѱ� - saleApple() �޼ҵ带 ȣ���� ������ ����(line40)

	}
	public void showSaleResult (){
		//�Ǹ����� ����Ȳ ���� �޼ҵ�
		System.out.println("���� ��� : " + numOfApple);
		System.out.println("�Ǹ� ���� : " + myMoney);
	}
}

class FruitBuyer{ // ��� ������ Ŭ����
	int numOfApple = 0; // ������ ��� ����
	int myMoney = 10000; // ��� ������ ��
	public void buyApple(FruitSeller seller, int money) {
	//��� ���� �޼ҵ�(Ư�� �Ǹ���(fruitSeller�� �ν��Ͻ�)���� ���ž��� �ǳ� �� ����� ����)
		numOfApple = seller.saleApple(money); //(line19)
		//����� ������ ��(money)�� �μ��� �Ͽ� seller�ν��Ͻ��� saleApple() �޼ҵ� ȣ��
		myMoney -= money;
		//���� �� �����ݾ׿��� ����� ������ �ݾ׸�ŭ ����

		//buyApple()�޼ҵ带 ȣ���� ���� ������� �̵�(line67)
	}
	public void showBuyResult(){
		//�������� ����Ȳ ���� �޼ҵ�
		System.out.println("��� ���� : " + numOfApple);
		System.out.println("���� �ܾ� : " + myMoney);
	}
}

class FruitSalesMain1 {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();  //  ��� �Ǹ��� �ν��Ͻ� ����(line15)
		// FruitSeller�� �ν��Ͻ� seller ���� �� ����
		FruitBuyer buyer = new FruitBuyer(); // ��� ������ �ν��Ͻ� ����(line35)
		// Fruitbuyer�� �ν��Ͻ� buyer ���� �� ����
	
		buyer.buyApple(seller, 2000); // (line38)
		// buyer �ν��Ͻ��� buyApple() �޼ҵ� ȣ��
		// seller : ����� �����Ϸ��� �Ǹ��ڰ� �ʿ��ϹǷ� �Ǹ��� �ν��Ͻ��� seller�� ������
		// - seller��� �ν��Ͻ��� �μ��� ����ϸ� �ν��Ͻ��� �ּҰ��� ���纻�� ������
		// 2000 : ��� ������ ��

		System.out.println("��� �Ǹ��� ��Ȳ");
		seller.showSaleResult(); //(line28)

		System.out.println("��� ������ ��Ȳ");
		buyer.showBuyResult(); //(line47)
	}
}

/*
������
 - �Ǹ��ڳ� ������ �ν��Ͻ��� ���� �����ص� ��� ������ ��(�������)�� ������ ����

 �ذ�å
 - �ν��Ͻ� ���� ��������� ���� �ٸ��� ������ �� �־�� ��
*/