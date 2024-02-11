package ioc_Constructor_DependencyInjection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "TODAY IS YOUR LUCKY DAY !!!";
	}

}
