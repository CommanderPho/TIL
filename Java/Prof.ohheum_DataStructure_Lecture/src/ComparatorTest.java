import java.util.Arrays;
import java.util.Comparator;

// 람다식으로
public class ComparatorTest
{
	public static void main(String [] args)
	{
		Fruit[] fruits = new Fruit[2];
		
		fruits[0] = new Fruit("apple",6);
		fruits[1] = new Fruit("aa",7);
//		Arrays.sort(fruits,(f1 ,f2) -> f1.name.compareTo(f2.name));
//		Arrays.sort(fruits,(f1,f2)->f2.quantity-f1.quantity);
		Arrays.sort(fruits,Fruit.nameComparator);
		
		System.out.println(Arrays.toString(fruits));
	}
}

class Fruit
{
	String name;
	int quantity;
	public Fruit(String name, int quantity)
	{
		this.name = name;
		this.quantity = quantity;
	}
	@Override
	public String toString()
	{
		return "Fruit [name=" + name + ", quantity=" + quantity + "]";
	}
	
	public static Comparator<Fruit> nameComparator 
					  		= (f1,f2)->f1.name.compareTo(f2.name);
					
	public static Comparator<Fruit> quantComparator
							=(f1,f2)->f1.quantity - f2.quantity;
	
}