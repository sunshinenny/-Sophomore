package yanzheng;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class judgeMailInfo extends judge {
	private Scanner sc;

	// ���䣬��ַ���ʱ����Ч��
	public void judgeMail() {
		System.out.println("����������:");
		sc = new Scanner(System.in);
		mailAddress = sc.next();
		Pattern p_mail = Pattern.compile("^[a-zA-Z0-9_-]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); // [^]{0,16}@{1}[^]{0,6}.{1}[a-z]{4}
		Matcher m_mail = p_mail.matcher(mailAddress);
		boolean b_mail = m_mail.matches();
		if (b_mail) {
			System.out.println("�������ַ:");
			address = sc.next();
			System.out.println("�������ʱ�:");
			youbian = sc.next();

			Pattern p_youbian = Pattern.compile("[0-9]{6}");
			Matcher m_youbian = p_youbian.matcher(youbian);
			boolean b_youbian = m_youbian.matches();
			if (b_youbian) {
				System.out.println("����ɹ�");
			} else
				System.out.println("�ʱ��������������һ��");
		} else
			System.out.println("�����������������һ��");

	}
}
