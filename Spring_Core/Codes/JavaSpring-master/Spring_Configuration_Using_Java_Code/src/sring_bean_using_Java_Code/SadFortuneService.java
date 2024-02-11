package sring_bean_using_Java_Code;

public class SadFortuneService implements FortuneService {

	@Override
	public String getTodaysFortune() {
		return "Today is your bad day...";
	}

}
