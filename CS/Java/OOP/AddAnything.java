public class AddAnything extends AbsAdd implements AddInterface{
	/*Function defined in Abstract class implements Add Interface:: Optional to implement */
	@Override
	public double add(int a, int b){
			double c =0;
		return (c = a+b);

	}
	/*Function defined in AddInterface::: Must implement here */
	@Override
	public double add(float a, float b){
		double c =0;
		return (c = a+b);
	}
	/*Function defined in AddInterface::: Must implement here */
	@Override
	public String add(String a , String b){
		return(a+b);
	}
	/*Not in Interface, this function declared in Abstract Class:: Must implement*/
	
	public float add( float a, int b){
		float c = a + b;
		return c; 
	}
	@Override
	public float add( int a, float b){
		float c = a + b;
		/*top =98;*/
		System.out.println(top);
		return c; 
	}

	
}