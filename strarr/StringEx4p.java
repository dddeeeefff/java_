class StringEx4p {
	public static void main(String[] args) {
		String str1 = "890525-1234567";
		String str2 = "890515-2234567";
		String str3 = "0105253234567";
		String str4 = "0205154234567";
		
		showBirth(str1);		showBirth(str2);
		showGender(str1);		showGender(str2);
		showBirth(str3);		showBirth(str4);
		showGender(str3);		showGender(str4);

	}
	public static void showBirth(String str){
	//�ֹε�Ϲ�ȣ�� �̿��Ͽ� ��������� ����ϴ� �޼ҵ�
	//�ֹε�Ϲ�ȣ �� 6�ڸ� �̿��Ͽ� "yyyy�� mm�� dd�� ��"���� ���
		String year = str.substring(0,2);
		int syear = Integer.parseInt(year);
		if(syear >= 0 && syear <= 9 ){
		System.out.print("200"+ syear + "�� ");			
		}else if(syear >= 10 && syear <= 22){
		System.out.print("20"+ syear + "�� ");
		}else{
		System.out.print("19"+ syear + "�� ");
		}

		String m = str.substring(2,4);
		String d = str.substring(4,6);

		System.out.println(m + "�� " + d + "�� ��");
	}

	//substring(int beginIndex, int endIndex) : beginIndex ���� endIndex - 1 ���� �߶󳻾� �� ���ڿ��� ����
	//	str1.deleteCharAt(7);
	//	str2.deleteCharAt(7);
	public static void showGender(String str){
	//�ֹε�Ϲ�ȣ�� �̿��Ͽ� ������ ����ϴ� �޼ҵ�
	//�ֹε�Ϲ�ȣ �� 6�ڸ� �̿��Ͽ� "����" �Ǵ� "����"�� ���	
		int i =7;
		if(str.indexOf('-') == -1) i = 6;
		if(str.length() == 13) i = 6;

		char gen = str.charAt(6);
		if(gen == '1' || gen == '3'){
			System.out.println("����");
		}else if(gen == '2' || gen == '4'){
			System.out.println("����");
		}
	}
}
//StringBuilder   deleteCharAt(int index) : index�� �ش��ϴ� ���� �ϳ��� ������ �� ����