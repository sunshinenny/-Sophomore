package yanzheng;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class judgeUserInfo extends judge {
	String bir;
	private static Scanner sc;

	// ���֤�ţ��ϴ����֤��Ƭ��ʽ
	// ���䣬�ֻ��ŵ���Ч��
	public void judgeUser() {

		sc = new Scanner(System.in);

		while (true) {
			System.out.print("�������ֻ�����:");
			phoneNum = sc.next();

			Pattern p_phone = Pattern.compile("[0-9]{11}");
			Matcher m_phone = p_phone.matcher(phoneNum);
			boolean b_phone = m_phone.matches();

			if (b_phone) {
				System.out.println("�ֻ���¼��ɹ�\n");
				break;
			} else {
				System.out.println("�����������ֻ���");
				continue;
			}
		}

		while (true) {
			System.out.println("���������֤��");
			ID = sc.next();
			Pattern p_ID1 = Pattern.compile("[0-9]{18}");
			Matcher m_ID1 = p_ID1.matcher(ID);
			boolean b_ID1 = m_ID1.matches();

			Pattern p_ID2 = Pattern.compile("[0-9]{17}+[xX]{1}");
			Matcher m_ID2 = p_ID2.matcher(ID);
			boolean b_ID2 = m_ID2.matches();

			if (b_ID1 | b_ID2) {

				Pattern p1 = Pattern.compile("\\d{6}(\\d{8}).*"); // ������ȡ�������ַ���
				Pattern p2 = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");// ���ڽ������ַ������зֽ�Ϊ������
				Matcher matcher = p1.matcher(ID);
				if (matcher.find()) {
					String birthday = matcher.group(1);
					Matcher matcher2 = p2.matcher(birthday);
					if (matcher2.find()) {
						StringBuilder bir = new StringBuilder();
						bir.append(matcher2.group(1));
						bir.append('-');
						bir.append(matcher2.group(2));
						bir.append('-');
						bir.append(matcher2.group(3));
						System.out.println("��������Ϊ:" + bir + "\n��Ϊ���Զ�����\n");
						System.out.println("���ϴ����֤��Ƭ");
						System.out.println("���Եȡ���");
						System.out.println("��Ƭ�ϴ��ɹ���");
						break;

					}
				}

			} else
				System.out.println("�������������֤��");
			continue;
		}

		while (true) {
			System.out.println("��������������(ע:ֻ��8�������û�ע��):");
			age = sc.nextInt();
			if (age > 8 & age < 150) {
				System.out.println("����¼��ɹ�\n\n��������¼����ɣ���ӭ��ʹ�ñ�ϵͳ");
				break;
			} else {
				System.out.println("��������������");
				continue;
			}

		}
	}
}
