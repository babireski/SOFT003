import java.util.*;

public class Stretch
{
	private String name;
	private float length;
	private Coordinate a;
	private Coordinate b;
	private List<Coordinate> shape;
	private List<Inaccessibility> inaccessibilities;

	public Stretch(Coordinate a, Coordinate b, List<Coordinate> shape, String name, float length, List<Inaccessibility> inaccessibilities)
	{
		this.name = name;
		this.length = length;
		this.a = a;
		this.b = b;
		this.shape = shape;
		this.inaccessibilities = inaccessibilities;
	}

	/* Getters */

	public String getName()
	{
		return name;
	}
	
	public float getLength()
	{
		return length;
	}

	public Coordinate getA()
	{
		return a;
	}

	public Coordinate getB()
	{
		return b;
	}

	public List<Coordinate> getShape()
	{
		return shape;
	}
	
	public List<Inaccessibility> getInaccessibilities()
	{
		return inaccessibilities;
	}

	/* Setters */
	
	public void setNome(String name)
	{
		this.name = name;
	}

	public void setLength(float length)
	{
		this.length = length;
	}

	public void setA(Coordinate a)
	{
		this.a = a;
	}

	public void setB(Coordinate b)
	{
		this.b = b;
	}

	public void setShape(List<Coordinate> shape)
	{
		this.shape = shape;
	}

	public void setInaccessibilities(List<Inaccessibility> inaccessibilities)
	{
		this.inaccessibilities = inaccessibilities;
	}

	/* Others */

	public void addInaccessibility(Inaccessibility inaccessibility)
	{
		inaccessibilities.add(inaccessibility);
	}
}