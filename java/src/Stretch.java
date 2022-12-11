import java.util.*;

public class Stretch
{
	private Coordinate a;
	private Coordinate b;
	private List<Coordinate> shape;
	private String name;
	private float length;


	public Stretch(Coordinate a, Coordinate b, List<Coordinate> shape, String name, float length)
	{
		this.a = a;
		this.b = b;
		this.shape = shape;
		this.name = name;
		this.length = length;
	}

	/* Getters */

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

	public String getName()
	{
		return name;
	}

	public float getLength()
	{
		return length;
	}

	/* Setters */
	
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

	public void setNome(String name)
	{
		this.name = name;
	}

	public void setLength(float length)
	{
		this.length = length;
	}
}