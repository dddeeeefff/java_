class Aa{
	public String toString(){return "class Aa";}
}	

class Bb{
	public String toString(){return "class Bb";}
}	

class InstanceTypeShow {
	int showCnt = 0;
	public <T> void showInstType(T inst){
	// �� �޼ҵ� ȣ��� �Ű������� �ڷ����� ���ʸ����� �����Ͽ� ����ϰڴٴ� �ǹ�
		System.out.println(inst);
		showCnt++;
	}
	void showPrintCnt(){System.out.println("show count" + showCnt);}
}

class GenericMethod1 {
	public static void main(String[] args) {
		Aa a = new Aa();		Bb b = new Bb();
		InstanceTypeShow show = new InstanceTypeShow();

		show.<Aa>showInstType(a);
		// showInstType() �޼ҵ��� �μ��� Aa�� �ν��Ͻ��� ����Ѵٴ� �ǹ̷� <Aa>�� �����ص� ��
		// �����Ϸ��� �޼ҵ� ȣ�� �� ���޵Ǵ� �μ��� �ڷ����� �ٰŷ� ������ �Ǵ��� �� �����Ƿ� ��������
		show.<Bb>showInstType(b);
		show.showPrintCnt();
	}
}
