package OnlineAuctionBiddingSystem;

public class Main {
	public static void main(String[] args) {
		AuctionItem item = new AuctionItem();

		User u1 = new User(1, "Alice");
		User u2 = new User(2, "Bob");

		try {
			item.placeBid(u1, new Bid(500));
			item.placeBid(u2, new Bid(600));
			item.placeBid(u1, new Bid(550));
		} catch (InvalidBidException e) {
			System.out.println(e.getMessage());
		}

		item.showHighestBid();
  
	}

}
