class InstCnt{
	static int clsNum = 0; // ��� ���� �� Ŭ���� ����
	int insNum = 0; // ��� ���� �� �ν��Ͻ� ����
	public InstCnt(){
		clsNum++;
		System.out.println("Ŭ���� ���� : " + clsNum);
		insNum++;
		System.out.println("�ν��Ͻ� ���� : " + insNum);
	}
}

class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		System.out.println("cnt1.clsNum : " + cnt1.clsNum + " cnt2.clsNum : " + cnt2.clsNum + " cnt3.clsNum : " + cnt3.clsNum);
	}
}
