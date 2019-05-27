package com.blackjack.domain;

import java.util.LinkedList;
import java.util.List;

import com.blackjack.domain.Card;

public class CardDeck {
	private List<Card> cards;
	
	private static final int CARD_COUNT = 13;
	
	public CardDeck() {
		this.generateCards();
	}

	private List<Card> generateCards(){
		cards = new LinkedList<>();
		
		for(Card.Pattern pattern : Card.Pattern.values()) {
			for(int i=1; i<=CARD_COUNT; i++) {
				Card card = new Card(pattern, i);
				cards.add(card);
			}
		}
		
		return cards;
	}

	public Card draw() {
		Card selectedCard = getRandomCard();
		cards.remove(selectedCard);
		return selectedCard;
	}
	
	private Card getRandomCard() {
		int size = cards.size();
		int select = (int)(Math.random()*size);
		return cards.get(select);
	}
	
	
	public List<Card> getCards() {
		return cards;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Card card: cards) {
			sb.append(card.toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
}
