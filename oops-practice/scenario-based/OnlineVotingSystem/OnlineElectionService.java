package OnlineVotingSystem;
import java.util.ArrayList;

//service class
public class OnlineElectionService extends ElectionService {
	//vote casting method
	@Override
	public void castVote(Voter voter, Candidate candidate, ArrayList<Vote> voteList)
			throws DuplicateVoteException {
		//checking duplicate vote
		if (voter.hasVoted()) {
			throw new DuplicateVoteException("Duplicate vote detected! Voter already voted.");
		}
		//store vote
		voteList.add(new Vote(voter.getId(), candidate.getId()));
		//set voted true
		voter.setVoted(true);
	}
	//result declaration method
	@Override
	public void declareResult(ArrayList<Candidate> candidates, ArrayList<Vote> voteList) {
		System.out.println("\n----- Result Declaration -----");

		if (voteList.size() == 0) {
			System.out.println("No votes casted yet!");
			return;
		}
		for (Candidate c : candidates) {
			int count = 0;
			for (Vote v : voteList) {
				if (v.getCandidateId() == c.getId()) {
					count++;
				}
			}
			System.out.println(c.getName() + " (" + c.getParty() + ") : " + count + " votes");
		}
	}
}
