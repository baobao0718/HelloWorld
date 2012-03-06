package strategyPattern;

import java.util.Random;

public class WinningStrategy implements Strategy {
	private Random random;
	private boolean won=false;
	private Hand prevHand;
	public WinningStrategy(int seed){
		random=new Random(seed);
	}
	@Override
	public Hand nextHand() {
		// TODO Auto-generated method stub
		if(!won)
			prevHand=Hand.getHand(random.nextInt(3));
		return prevHand;
	}

	@Override
	public void study(boolean win) {
		// TODO Auto-generated method stub
		won=win;
	}

}
