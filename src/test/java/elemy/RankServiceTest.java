package elemy;

import interviews.Message;
import interviews.RankService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankServiceTest {

	@Test void testContructor(){
		RankService rankService = new RankService();
		assertNotNull(rankService.getFrequency());
	}

	@Test void processRankedList() {
		RankService rankService = new RankService();
		rankService.processMessage(new Message(1, 1));
		rankService.processMessage(new Message(2,2));
		rankService.processMessage(new Message(3,3));
		rankService.processMessage(new Message(1,10));
		assertEquals(11, rankService.getFrequency().get(1));
		assertEquals(2, rankService.getFrequency().get(2));
		assertEquals(3, rankService.getFrequency().get(3));
	}

	@Test void getRankedList() {
		RankService rankService = new RankService();
		rankService.processMessage(new Message(3,3));
		rankService.processMessage(new Message(1,1));
		rankService.processMessage(new Message(2,2));
		rankService.processMessage(new Message(1,10));
		assertEquals("[1=11, 3=3]", rankService.getRankedList().toString());
	}
}