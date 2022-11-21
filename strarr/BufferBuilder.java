class BufferBuilder {
	public static void main(String[] args) {
		String str1 = "AB";
		StringBuilder sb = new StringBuilder(str1);
		System.out.println(sb); //AB

		sb.append(25);						System.out.println(sb); // AB25
		sb.append('Y').append(true);		System.out.println(sb); // AB25Ytrue

		//sb�� ���� ABfalse25Ytrue �� ����

		sb.insert(2, false);				System.out.println(sb); // ABfalse25Ytrue
		sb.insert(sb.length(),'Z');			System.out.println(sb);	// ABfalse25YtrueZ   --> append�� ��� ����

		//sb�� ���� ABfe25YtrueZ�� ����

		sb.delete(3, 6);					System.out.println(sb); // ABfe25YtrueZ
		sb.deleteCharAt(5);					System.out.println(sb); // ABfe2YtrueZ

		sb.setCharAt(3, 'K');				System.out.println(sb); // ABfK2YtrueZ
		sb.reverse();						System.out.println(sb); // ZeurtY2KfBA

		String str2 = new String(sb);
		//���ڿ� ������ ���� StringBuilder�� �ν��Ͻ� sb�� String �ν��Ͻ��� ����
		System.out.println(str2); // ZeurtY2KfBA
	}
}
