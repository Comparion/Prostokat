package prostokat;

public final class prostokat {
	
	private final double x;
	private final double y;
	private final double a; 
	private final double b;
	
	public prostokat(double x, double y, double a, double b) {
		
		this.a = a;
		this.b = b;
		
		this.x = x;
		this.y = y;
		
	}
	
	public String polozenie() {
		
		double xA = x - 0.5 * a;
		double yA = y - 0.5 * b;
		double xB = x + 0.5 * a;
		double yB = y - 0.5 * b;
		double xC = x + 0.5 * a;
		double yC = y + 0.5 * b;
		double xD = x - 0.5 * a;
		double yD = y + 0.5 * b;
		String p =  String.format("A(%s,%s)  B(%s,%s)  C(%s,%s)  D(%s,%s)  X:%s   Y:%s ",xA,yA,xB,yB,xC,yC,xD,yD,a,b);
		return p;
	}
	
	
	public prostokat przesun(double x, double y)
	{
		return new prostokat(x,y,this.a,this.b);
	}
	
	public prostokat obroc(int ilosc)
	{
		double a=this.a,b=this.b;
		for(int i=0;i<ilosc;i++)
		{
			if(i%2==0)
			{
				a = this.b;
				b = this.a;
			}
			else
			{
				a = this.a;
				b = this.b;
			}
				
		}
		return new prostokat(this.x,this.y,a,b);
	}
	
	public prostokat rozciaganie(double a, double b)
	{
		return new prostokat(this.x,this.y,this.a + a,this.b + b);
	}

}
