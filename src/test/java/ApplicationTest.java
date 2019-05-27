import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

import com.blackjack.domain.Card;
import com.blackjack.domain.CardDeck;

public class ApplicationTest {

	@Test
	public void test_카드패턴비교() {
		CardDeck cardDeck = new CardDeck();
		List<Card> cards = cardDeck.getCards();
		assertThat(cards.get(0).getPattern(), is(Card.Pattern.SPADE));
		assertThat(cards.get(13).getPattern(), is(Card.Pattern.HEART));
	}
	
}
