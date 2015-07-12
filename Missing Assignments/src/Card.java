
public class Card 
{

	int suit;
	int rank;
	
	public Card()
	{
		this.suit = 0;
		this.rank = 0;
	}
	public Card(int suit, int rank)
	{
		this.suit=suit;
		this.rank=rank;
	}
	
	public static void printCard(Card a)
	{
		String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] ranks = {"narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		System.out.println(ranks[a.rank] + " of " + suits[a.suit]);
	}
	
	public static boolean sameCard(Card a, Card b)
	{
		if ((a.suit == b.suit) && (a.rank == b.rank) )
		{
			return true;
		}
		return false;
	}
	
	//suit first card 2n
	public static int compareCard(Card a, Card b)
	{
	
		if(a.suit > b.suit)
		{
			return 1;
		}
		if(a.suit < b.suit)
		{	
			return -1;
		}
		if(a.rank > b.rank)
		{
			return 1;
		}
		if (a.rank < b.rank)
		{
			return -1;
		}
		return 0;
		
	}
	
	public static void printDeck(Card[] a)
	{
		for (int k = 0; k < a.length;k++)
		{
			printCard(a[k]);
		}
	}
	
	public static Card[] makeDeck()
	{
		int index = 0;
		Card[] deck = new Card[52];
		for (int suit = 0; suit < 4; suit++)
		{
			for (int rank = 1; rank < 14; rank++)
			{
				deck[index]=new Card(suit,rank);
				index++;
			}
			
		}
		return deck;
	}

	public static int findCard(Card[] deck, Card c)
	{
		for (int i = 0; i <deck.length;i++)
		{
			if(sameCard(c,deck[i]))
			{
				return i;
			}
			
		}
		return -1;
	}
	
	public static int findBisect(Card[] deck, Card c, int low, int high)
	{
		if(low>high)
		{
			return -1;
		}
		
		int mid =(low+high)/2;
		int comp = compareCard(c,deck[mid]);
		if (comp == 0)
		{
			return mid;
		}
		if ( comp == 1)
		{
			return findBisect(deck,c,mid+1,high);
		}
		
		if (comp == -1)
		{
			return findBisect(deck,c,low,mid-1);
		}
		return -1;
	}
	
	public static int handScore(Card[] blackJackHand)
	{
		int score = 0;
		for (int i = 0; i < blackJackHand.length; i++)
		{
			if (blackJackHand[i].rank<11)
			{
				score += blackJackHand[i].rank;
			}
			else
			{
				score += 10;
			}
		}
		return score;
	}
	
	public static int[] suitHist (Card[] pokerHand)
	{
		int []counts = new int[4];
		for (int i = 0; i<pokerHand.length; i++)
		{
			counts[pokerHand[i].suit]++;
		}
		return counts;
	}
	public static boolean hasFlush(Card[] pokerHand)
	{
		for (int i = 0; i < suitHist(pokerHand).length; i++)
		{
			if (suitHist(pokerHand)[i]>=5)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		Card test = new Card(3,12);
		Card testA = new Card();
		testA.rank = 3;
		printCard(test);
		Card[] cards = new Card[52];
		if (cards[0]==null)
		{
			System.out.println("You have no cards yet");
		}
		Card[] deck = makeDeck();
		System.out.println(findCard(deck,new Card(2,3)));
		printCard(deck[findCard(deck, new Card(2,3))]);
		System.out.println(findBisect(deck, new Card(2,3), 0, deck.length));
		
		
	}
	

}
