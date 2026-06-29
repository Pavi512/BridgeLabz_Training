package com.bridgelabz.objectorientedprograms;

import java.util.Random;

// Card class
class Card {
    String suit;
    String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// Node class for Linked List
class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

// Queue for cards
class CardQueue {

    private Node front;
    private Node rear;

    //Method to add card to the queue
    public void enqueue(Card card) {

        Node newNode = new Node(card);

        if (rear == null) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Method to get rank value
    private int getRankValue(String rank) {

        String[] ranks = {
                "2", "3", "4", "5", "6", "7",
                "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        for (int i = 0; i < ranks.length; i++) {

            if (ranks[i].equals(rank)) {
                return i;
            }
        }

        return -1;
    }

    // Method to sort cards by rank
    public void sort() {

        Card[] cards = new Card[9];

        Node temp = front;

        int index = 0;

        // Copy cards from queue into array
        while (temp != null) {
            cards[index++] = (Card) temp.data;
            temp = temp.next;
        }

        // Bubble sort based on rank
        for (int i = 0; i < cards.length - 1; i++) {

            for (int j = 0; j < cards.length - i - 1; j++) {

                if (getRankValue(cards[j].rank)
                        > getRankValue(cards[j + 1].rank)) {

                    Card t = cards[j];
                    cards[j] = cards[j + 1];
                    cards[j + 1] = t;
                }
            }
        }

        // Empty queue
        front = null;
        rear = null;

        // Add sorted cards back into queue
        for (int i = 0; i < cards.length; i++) {
            enqueue(cards[i]);
        }
    }

    //Method to display cards
    public void display() {

        Node temp = front;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

// Player class
class Player {

    String name;
    CardQueue cards;

    public Player(String name) {
        this.name = name;
        cards = new CardQueue();
    }
}

// Queue for players
class PlayerQueue {

    private Node front;
    private Node rear;

    //Method to add player to the queue
    public void enqueue(Player player) {

        Node newNode = new Node(player);

        if (rear == null) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    //Method to display players
    public void display() {

        Node temp = front;

        while (temp != null) {

            Player player = (Player) temp.data;

            System.out.println("\n" + player.name);
            System.out.println("----------------");

            player.cards.display();

            temp = temp.next;
        }
    }
}

//Implemented main method
public class DeckOfCardsQueue {

    public static void main(String[] args) {

        String[] suits = {
                "Clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7",
                "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Create deck of cards
        Card[] deck = new Card[52];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {

            for (int j = 0; j < ranks.length; j++) {

                deck[index++] = new Card(suits[i], ranks[j]);
            }
        }

        // Shuffle the cards
        Random random = new Random();

        for (int i = 0; i < 52; i++) {

            int r = random.nextInt(52);

            Card temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        // Create 4 players
        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            players[i] = new Player("Player " + (i + 1));
        }

        // Distribute 9 cards to each player
        int cardIndex = 0;

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 4; j++) {

                players[j].cards.enqueue(deck[cardIndex++]);
            }
        }

        // Sort cards of every player
        for (int i = 0; i < 4; i++) {
            players[i].cards.sort();
        }

        // Store players in queue
        PlayerQueue playerQueue = new PlayerQueue();

        for (int i = 0; i < 4; i++) {
            playerQueue.enqueue(players[i]);
        }

        // Display players and cards
        System.out.println("Cards Distributed to Players");

        playerQueue.display();
    }
}