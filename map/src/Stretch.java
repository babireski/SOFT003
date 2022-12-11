import java.util.*;

public class Stretch
{
	private Coordinate a;
	private Coordinate b;
	private List<Coordinate> shape;
	private String nome;
	private float comprimento;

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

	public String getNome()
	{
		return nome;
	}

	public float getComprimento()
	{
		return comprimento;
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

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setComprimento(float comprimento)
	{
		this.comprimento = comprimento;
	}
}