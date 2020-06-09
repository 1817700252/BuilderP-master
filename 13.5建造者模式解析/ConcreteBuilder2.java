package day09_demo04;

public class ConcreteBuilder2 extends Builder
{
	private Product	product	= new Product();

	public void buildPartA()
	{
		product.add("部件X");
	}

	public void buildPartB()
	{
		product.add("部件Y");
	}

	public Product getResult()
	{
		return product;
	}

}
