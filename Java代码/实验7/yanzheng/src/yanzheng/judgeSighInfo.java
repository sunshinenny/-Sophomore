package yanzheng;

import java.util.Scanner;

public class judgeSighInfo extends judge {
	private Scanner sc;

	// �ж������Ƿ�Ϊ�գ����볤���Ƿ����Ҫ��ȷ������������Ƿ���ͬ
	public void judgeSigh() {
		sc = new Scanner(System.in);

		while (true) {
			System.out.print("�������û���:");
			String name = sc.next();
			if (name.isEmpty()) {
				System.out.println("������");
				continue;
			}

			else {
				judgePassword();
				break;
			}
		}
	}

	public void judgePassword() {

		System.out.print("����������(8-16λ):");
		String password1 = sc.next();

		System.out.println("���볤��:" + password1.length());
		if (password1.length() >= 8 & password1.length() <= 16) {
			System.out.print("��������һ������:");

			String password2 = sc.next();
			if (password2.equals(password1)) {
				System.out.println("������֤�ɹ�");
			} else
				System.out.println("�������벻��ͬ��������һ��");

		} else
			System.out.println("���볤�Ȳ�����Ҫ��,������");

	}
}
