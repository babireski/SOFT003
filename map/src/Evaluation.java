public class Evaluation
{
	private Account evaluator;
	private String comment;
	private float rating;

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
