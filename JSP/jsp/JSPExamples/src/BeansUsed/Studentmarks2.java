package BeansUsed;
import java.io.Serializable;

public class Studentmarks2 implements Serializable
{

	private String name;
	private int java;
	private int cpp;
	private int os;
	private int total;
	private float percentage;
	
	
	
	public Studentmarks2() 
	{
		super();
	}
	
	public Studentmarks2(String name, int java, int cpp, int os, int total, float percentage) {
		super();
		this.name = name;
		this.java = java;
		this.cpp = cpp;
		this.os = os;
		this.total = total;
		this.percentage = percentage;
	}

	public float calculate()
	{
		int total=java+cpp+os;		
		percentage=total/300;		
		return percentage;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJava() {
		return java;
	}


	public void setJava(int java) {
		this.java = java;
	}


	public int getCpp() {
		return cpp;
	}


	public void setCpp(int cpp) {
		this.cpp = cpp;
	}


	public int getOs() {
		return os;
	}


	public void setOs(int os) {
		this.os = os;
	}


	public int getTotal() {
		total = java+cpp+os;
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public float getPercentage() {
		
		return percentage;
	}


	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	
	
	
	
	
	
}
