package yanzheng;

import java.util.Scanner;

public class judgeSighInfo extends judge {
	private Scanner sc;

	// 判断输入是否为空，密码长度是否符合要求，确认密码和密码是否相同
	public void judgeSigh() {
		sc = new Scanner(System.in);

		while (true) {
			System.out.print("请输入用户名:");
			String name = sc.next();
			if (name.isEmpty()) {
				System.out.println("请重试");
				continue;
			}

			else {
				judgePassword();
				break;
			}
		}
	}

	public void judgePassword() {

		System.out.print("请输入密码(8-16位):");
		String password1 = sc.next();

		System.out.println("密码长度:" + password1.length());
		if (password1.length() >= 8 & password1.length() <= 16) {
			System.out.print("请再输入一次密码:");

			String password2 = sc.next();
			if (password2.equals(password1)) {
				System.out.println("密码验证成功");
			} else
				System.out.println("两次密码不相同，请再试一次");

		} else
			System.out.println("密码长度不符合要求,请重试");

	}
}
