class StringEx5 {
	public static void main(String[] args) {
		// 1 ~ 1000 ������ ���� �� 8�� ����ִ� ������ ������ ���Ͽ� ���

		int count = 0; //8�� ����ִ� ������ ������ ������ ����
		for(int i = 1; i <= 1000; i++){
			String tmp = i + "";
			if(tmp.indexOf('8') >= 0) count++;
			//tmp ���ڿ��� '8'�� ������ count���� 1����
		}
		System.out.println("8�� ����ִ� ������ ���� : " + count);
		//Ư�� ���ڸ� �����ϴ� �Լ�?(!)
		


		// 1 ~ 1000 ������ ���� �� 8�� �� ������ ���Ͽ� ���
		count = 0; //8�� �� ������ ������ ����
		for(int i = 1; i <= 1000; i++){
			String tmp = i + "";
			for(int j = 0; j < tmp.length(); j++){
			//tmp ���ڿ��� ù ���ں��� ������ ���ڱ��� ������ ��
				if(tmp.charAt(j) == '8') count++;
			}
		}
		System.out.println("8�� �� ���� : " + count);
	}
		
		



	
}




/*
����
������ ������ �迭�� �ʱ�ȭ
8�� ���Ե� ���� ���� �� �������ϱ�

8�� ���� ���ϱ�
*/