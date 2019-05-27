package com.blackjack.main;

import com.blackjack.domain.CardDeck;
import com.blackjack.domain.Dealer;
import com.blackjack.domain.Gamer;
import com.blackjack.domain.Rule;

public class Game {
	public void play() {
		System.out.println("==========Blackjack==========");
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		Rule rule = new Rule();
		CardDeck cardDeck = new CardDeck();
	}
}
