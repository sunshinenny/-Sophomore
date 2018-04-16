package yanzheng;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class judgeUserInfo extends judge {
	String bir;
	private static Scanner sc;

	// 身份证号，上传身份证照片格式
	// 年龄，手机号的有效性
	public void judgeUser() {

		sc = new Scanner(System.in);

		while (true) {
			System.out.print("请输入手机号码:");
			phoneNum = sc.next();

			Pattern p_phone = Pattern.compile("[0-9]{11}");
			Matcher m_phone = p_phone.matcher(phoneNum);
			boolean b_phone = m_phone.matches();

			if (b_phone) {
				System.out.println("手机号录入成功\n");
				break;
			} else {
				System.out.println("请重新输入手机号");
				continue;
			}
		}

		while (true) {
			System.out.println("请输入身份证号");
			ID = sc.next();
			Pattern p_ID1 = Pattern.compile("[0-9]{18}");
			Matcher m_ID1 = p_ID1.matcher(ID);
			boolean b_ID1 = m_ID1.matches();

			Pattern p_ID2 = Pattern.compile("[0-9]{17}+[xX]{1}");
			Matcher m_ID2 = p_ID2.matcher(ID);
			boolean b_ID2 = m_ID2.matches();

			if (b_ID1 | b_ID2) {

				Pattern p1 = Pattern.compile("\\d{6}(\\d{8}).*"); // 用于提取出生日字符串
				Pattern p2 = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");// 用于将生日字符串进行分解为年月日
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
						System.out.println("您的生日为:" + bir + "\n已为您自动导入\n");
						System.out.println("请上传身份证照片");
						System.out.println("请稍等……");
						System.out.println("照片上传成功！");
						break;

					}
				}

			} else
				System.out.println("请重新输入身份证号");
			continue;
		}

		while (true) {
			System.out.println("请输入您的年龄(注:只限8岁以上用户注册):");
			age = sc.nextInt();
			if (age > 8 & age < 150) {
				System.out.println("年龄录入成功\n\n所有数据录入完成，欢迎您使用本系统");
				break;
			} else {
				System.out.println("请重新输入年龄");
				continue;
			}

		}
	}
}
