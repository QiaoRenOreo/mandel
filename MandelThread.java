package ss.week7.mandel;

/**
 * Class for drawing the Mandel in parallel
 */ 
class MandelThread extends Thread 
{
	private MandelPanel mandelPanel;
	MandelThread(MandelPanel mpArg) 
	{
		this.mandelPanel = mpArg;
	}

	// overrides Thread.run
	// draws the fractal on the MandelPanel
	public void run() {
		mandelPanel.drawMandel();
	}
}
