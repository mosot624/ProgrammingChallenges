import java.util.Random;
public class MyClass {
    public static void main(String args[]) {
            ranNum ranNum1 = new ranNum();
            ranNum1.random1();
            System.out.println(ranNum1.getInt());
        }
    }

class classVaribles
{
	private int c;
	private static int random1;
	public int getInt()
	{
		return this.c;
	}
	public void setInt(int setIntiger)
	{
		this.c = setIntiger;
	}
}

class ranNum{
    private static int rn1;
    public void randomNum1(){
        Random rand = new Random();
        int  n = rand.nextInt(50) + 1;
        setInt(n);
    }
    public int getInt()
	{
		return rn1;
	}
   
    public static void setInt(int setIntiger)
	{
		rn1 = setIntiger;
	}
}

