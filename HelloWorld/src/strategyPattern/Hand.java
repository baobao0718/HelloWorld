package strategyPattern;

public class Hand {
	public static final int HANDVALUE_GUU=0;
	public static final int HANDVALUE_CHO=1;
	public static final int HANDVALUE_PAA=2;
	
	public static final Hand[] hands={
		new Hand(HANDVALUE_GUU), new Hand(HANDVALUE_CHO), new Hand(HANDVALUE_PAA)
	};
	private static final String[] name={
		"石头","剪子","布",
	};
	private Hand(int handvalue){
		this.handvalue=handvalue;
	}
	
	private int handvalue;
	
	public static Hand getHand(int handvalue){
		return hands[handvalue];
	}
	public boolean IsStrongerThan(Hand hand){
		return (this.handvalue+1)%3==hand.handvalue;
	}
	public boolean IsWeakerThan(Hand hand){
		return (this.handvalue+2)%3==hand.handvalue;
	}
	public String toString(){
		return name[handvalue];
	}
	
}
