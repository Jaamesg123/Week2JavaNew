
public class BooleanWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		double costOfMilk = 2.99;
		double moneyInWallet = 20;
		double thirstLevel = 5;
		boolean shouldBuyIcecream = true;
		boolean willGoSwimming = true;
		boolean isAGoodDay = true;
		boolean willBuyMilk = true;
		
		if (isHotOutside && hasMoneyInPocket) {
			System.out.println(shouldBuyIcecream);
		} else {
			System.out.println("Today I should get hot cocoa.");
		}
		
		if (isHotOutside && isWeekday) {
			System.out.println("Guess I'm not going swimming today...");
		} else {
			System.out.println(willGoSwimming);
			
		}
		
		if ((isHotOutside && hasMoneyInPocket) != isWeekday) {
			System.out.println(isAGoodDay);
		} else {
			System.out.println("Today's gonna suck");
		}
		
		boolean a = (isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (2*costOfMilk)));
		boolean b = ((thirstLevel > 6)&& (thirstLevel < 9));
		
		if (b) {						
			System.out.println("Dehydrated");
		} else if (a) {
			System.out.println(willBuyMilk);
			
		} else {									
			System.out.println("We're not getting Milk.");
			
		}
		
	}
	
}
	


