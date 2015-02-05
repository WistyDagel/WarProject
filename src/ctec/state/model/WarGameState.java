package ctec.state.model;

public class WarGameState
{
	private int win, loss;
	
	public void onCreate()
	{	
			
		win = getWin();
		loss = getLoss();
	}

	public int getWin()
	{
		return win;
	}

	public void setWin(int win)
	{
		this.win = win;
	}

	public int getLoss()
	{
		return loss;
	}

	public void setLoss(int loss)
	{
		this.loss = loss;
	}
}
	