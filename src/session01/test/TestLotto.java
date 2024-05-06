package session01.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import session01.bean.Hello;
import session01.bean.Lotto;

public class TestLotto {

	public static void main(String[] args) {
		// Spring 會根據配置文件的設定來自動建立 bean 實體
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		// 因為 scope="prototype" 所以會實現多例而非預設的單例(signleton)
		// 利用 Spring 得到 Lotto 號碼並印出
		Lotto lotto = ctx.getBean("lotto", Lotto.class); // 指定 id
		System.out.println(lotto.getNumbers());
		Lotto lotto2 = ctx.getBean("lotto", Lotto.class); // 指定 id
		System.out.println(lotto2.getNumbers());
		
			
	}

}
