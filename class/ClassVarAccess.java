class AccessWay{
	static int num = 0;
	AccessWay(){incrCnt();}
	public void incrCnt(){num++;}
}

class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay.num++; // �ν��Ͻ��� ���� ���ο� ������� Ŭ���� ����� �����ϰ� ����
		AccessWay way = new AccessWay();
		way.num++;		 // �ν��Ͻ��� ���� Ŭ���� ������ ����
		AccessWay.num++; // Ŭ������ ���� Ŭ���� ������ ���� 
		System.out.println("num : " + AccessWay.num); // 4
	}
}
