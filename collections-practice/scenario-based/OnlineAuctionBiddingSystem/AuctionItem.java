package OnlineAuctionBiddingSystem;

import java.util.*;

public class AuctionItem {

	private TreeMap<Double, User> bids;

	public AuctionItem() {
		bids = new TreeMap<>(Collections.reverseOrder()); // highest bid first
	}

	public void placeBid(User user, Bid bid) throws InvalidBidException {

		if (!bids.isEmpty() && bid.getBidAmount() <= bids.firstKey()) {
			throw new InvalidBidException("Bid must be higher than current highest bid: " + bids.firstKey());
		}

		bids.put(bid.getBidAmount(), user);
	}

	public void showHighestBid() {
		if (bids.isEmpty()) {
			System.out.println("No bids yet");
			return;
		}

		System.out
				.println("Highest Bidder: " + bids.firstEntry().getValue() + ", Amount: " + bids.firstEntry().getKey());
	}
}
