package com.blackjack.domain;

import java.util.LinkedList;
import java.util.List;

import com.blackjack.domain.Card;

public class CardDeck {
	private List<Card> cards;
	
	public CardDeck() {
		cards = this.generateCards();
	}

	private List<Card> generateCards(){
		List<Card> cards = new LinkedList<>();
		
		for(Card.Pattern pattern : Card.Pattern.values()) {
			for(Card.Denomination denomination : Card.Denomination.values()) {
				Card card = new Card(pattern, denomination);
				cards.add(card);
			}
		}
		
		return cards;
	}

	public List<Card> getCards() {
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
