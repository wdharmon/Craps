

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoundTest {

	@Test
	void test() {
		for (int a = 0; a<10000;a++) {
			Round r = new Round();
			
			if (Round.isNatural(r.geteGameResult())) {
				assertEquals(eGameResult.NATURAL, r.geteGameResult());
			}
			if(Round.isCraps(r.geteGameResult())) {
				assertEquals(eGameResult.CRAPS, r.geteGameResult());
			}
			
			if (r.RollCount() > 0) {
				if (r.GetFirstRoll() == r.GetLastRoll()) {
					assertEquals(eGameResult.POINT, r.geteGameResult());
				}
			}
				else if (r.GetLastRoll() == 7) {
					assertEquals(eGameResult.SEVEN_OUT, r.geteGameResult());
				}
	}

}
}



	
		
	