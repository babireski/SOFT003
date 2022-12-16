public class Evaluation
{
	private Account evaluator;
	private String comment;
	private float rating;

	public Evaluation(Account evaluator, String comment, float rating) throws Exception
	{
		if(rating < 0 || rating > 10)
		{
			throw new Exception();
		}

		this.evaluator = evaluator;
		this.comment = comment;
		this.rating = rating;
	}

	/* Getters */

	public Account getEvaluator()
	{
		return evaluator;
	}

	public String getComment()
	{
		return comment;
	}

	public float getRating()
	{
		return rating;
	}

	/* Setters */

	public void setEvaluator(Account evaluator)
	{
		this.evaluator = evaluator;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	public void setRating(float rating)
	{
		this.rating = rating;
	}
}
