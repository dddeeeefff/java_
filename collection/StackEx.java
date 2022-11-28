import java.util.*;

class StackEx {
	public static Stack back = new Stack(); 
	// �ڷ� ���⿡ �ʿ��� �����丮�� ������ ���
	public static Stack forward = new Stack(); 
	// ������ ���⿡ �ʿ��� �����丮�� ������ ���

	public static void main(String[] args) {
		goURL("1. ����Ʈ");		goURL("2. ����");
		goURL("3. ���̹�");		goURL("4. ����");
		printStatus();

		goBack();
		System.out.println("�ڷ� ���� ��ư Ŭ����");
		printStatus();

		goBack();
		System.out.println("�ڷ� ���� ��ư Ŭ����");
		printStatus();

		goForward();
		System.out.println("������ ���� ��ư Ŭ����");
		printStatus();

		goURL("google.com");
		System.out.println("���ο� �ּҷ� �̵�");
		printStatus();
	}
	public static void printStatus(){
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("����ȭ���� '" + back.peek() + "' �Դϴ�");
		System.out.println();
	}

	public static void goURL(String url){
	// ���Ӱ� �̵��� �������� url�� back�� �����ϴ� �޼ҵ�
		back.push(url);
		// �ڷΰ��⿡ url�� ���������
		if(!forward.empty()) forward.clear();
		// forward�� ������� ������, forward�� ����ִ� �������� ����
	}

	public static void goForward(){
		if(!forward.empty()) back.push(forward.pop());
	}

	public static void goBack(){
		if(!back.empty()) forward.push(back.pop());
		// back�� ��������� �ƹ� �۾��� ����
		// ������� ������ back���� �� url�� �����Ͽ� forward�� ����
		// back.pop() : back���� ���� ���� �ִ� �����͸� �����ϴ� �۾�
		// ��, ������ ����� ���� �����Ϳ��� ������ �����Ͱ� ���� ����
	}
}


/*
back : [1. ����Ʈ, 2. ����, 3. ���̹�, 4. ����]
forward : []
����ȭ���� '4. ����' �Դϴ�

�ڷ� ���� ��ư Ŭ����
back : [1. ����Ʈ, 2. ����, 3. ���̹�]
forward : [4. ����]
����ȭ���� '3. ���̹�' �Դϴ�

�ڷ� ���� ��ư Ŭ����
back : [1. ����Ʈ, 2. ����]
forward : [4. ����, 3. ���̹�]
����ȭ���� '2. ����' �Դϴ�

������ ���� ��ư Ŭ����
back : [1. ����Ʈ, 2. ����, 3. ���̹�]
forward : [4. ����]
����ȭ���� '3. ���̹�' �Դϴ�

���ο� �ּҷ� �̵�
back : [1. ����Ʈ, 2. ����, 3. ���̹�, google.com]
forward : []
����ȭ���� 'google.com' �Դϴ�
*/