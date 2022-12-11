public class Coordinate
{
	private float latitude;
	private float longitude;

	public Coordinate(float latitude, float longitude)
	{
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/* Getters */

	public float getLatitude()
	{
		return latitude;
	}

	public float getLongitude()
	{
		return longitude;
	}

	/* Set */

	public void setLatitude(float latitude)
	{
		this.latitude = latitude;
	}

	public void setLongitude(float longitude)
	{
		this.longitude = longitude;
	}
}
