class BasicBox{
	public void basicWrap(){System.out.println("basic wrap");}
}

class PaperBox extends BasicBox{
	public void paperWrap(){System.out.println("paper wrap");}
}

class GoldBox extends PaperBox{
	public void goldWrap(){System.out.println("gold wrap");}
}


class InstanceOfEx1 {
	public static void main(String[] args) {
		BasicBox box1 = new BasicBox();
		PaperBox box2 = new PaperBox();
		GoldBox box3 = new GoldBox();

		wrapBox(box1);		wrapBox(box2);		wrapBox(box3);
		//basic wrap		//paper wrap		//gold wrap
	}
	public static void wrapBox(BasicBox box){
	// �Ű������� BasicBox������ �����߱� ������ �� ����Ŭ������ PaperBox�� GoldBox�� �ν��Ͻ��� �Ű������� ���� �� ����
	// ��, ����Ŭ������ BasicBox������ �޾����Ƿ� PaperBox�� GoldBox�� �ν��Ͻ��� BasicBox�� �νĵ�

	// instanceof : ����ȯ ���ɿ��θ� ���� �����ڷ� ���� �˻�� ������ Ŭ�������� �ؾ� ��
	// GoldBox�� �ν��Ͻ� box3�� PaperBox�ε� ����ȯ�� �����ϱ� ������ ������ ���� �˻��ؾ� ��

	// �� ���̽����� ����ȯ�Ͽ� ���� - ����ȯ�ϴ� �����? -> () -> ����ȯ �켱���� ���� 1 '.'  2 '()' => 2�����ϰ������ ��ȣ�� ���´�
		if(box instanceof GoldBox){
		// box �ν��Ͻ��� GoldBox�� ����ȯ�� �����ϸ�
			((GoldBox)box).goldWrap();
			// box�� GoldBox������ ����ȯ �� �� goldWrap() �޼ҵ� ȣ��
		}else if(box instanceof PaperBox){
			((PaperBox)box).paperWrap();
		}else{
			box.basicWrap();
		}
		
	}
}
