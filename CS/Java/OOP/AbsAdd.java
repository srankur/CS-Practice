 interface AddInterface{
	public double add(int a, int b);
	public double add(float a, float b);
	public String add(String a , String b);
	int top = 43;
}

public abstract class AbsAdd implements AddInterface{
	public double add(int a, int b){
		double c = a+b;
		System.out.println("Called from Abstract class");
		return c;
	}
	public abstract float add(int a , float b);
}