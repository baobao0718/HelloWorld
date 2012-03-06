package strategyPattern;

public interface Strategy {
	public Hand nextHand();
	public void study(boolean win);
}
