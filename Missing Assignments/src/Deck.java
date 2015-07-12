public class Deck 
{
	Card[]cards;
	//creates a 52 card Deck and populates it.
	public Deck()
	{
		this.cards=new Card[52];
		int index=0;
		for (int suit=0; suit<=3; suit++)
		{
			for (int rank=1; rank<=13; rank++)
			{
				this.cards[index]=new Card(suit, rank);
				index++;
			}
		}
	}
	//creates a Deck of cards of size n. 
	public Deck (int n)
	{
		this.cards=new Card[n];
	}
	//prints an entire Deck
	public static void printDeck(Deck deck)
	{
		for (int i=0; i<deck.cards.length; i++)
		{
			Card.printCard(deck.cards[i]);
		}
	}
	//generates a random int, use for shuffling
	public static int randomInt(int low,int high)
		{
			double range=high-low;
			
				double x=(int)(range*Math.random()+low);
				return (int)x; 
		}
	public static void swapCards(Deck deck, int a, int b)
	{
		Card temp=new Card();
		temp=deck.cards[b];
		deck.cards[b]=deck.cards[a];
		deck.cards[a]=temp;
	}
	//shuffles the deck by swapping the ith card with a random card
	public static void shuffleDeck(Deck deck)
	{
		for (int i=0; i<deck.cards.length; i++)
		{
			int x=randomInt(0,deck.cards.length-1);
			swapCards(deck,i,x);
		}
	}
	public static int indexLowestCard(Deck deck, int low, int high)
	{
		int index=low;
		for (int i=low; i<high; i++)
		{
			if (Card.compareCard(deck.cards[index],deck.cards[i+1])==1)
			{
				index=i+1;
			}
		}
		
		return index;
	}
	//un-shuffles the deck
	public static void sortDeck(Deck deck)
	{
		for (int i=0; i<deck.cards.length; i++)
		{
			int temp=indexLowestCard(deck,i,deck.cards.length-1);
			swapCards(deck,i,temp);
		}
			
	}
	//makes a hand out of an existing deck
	public static Deck subDeck(Deck deck, int low, int high)
	{
		Deck hand=new Deck(high-low+1);
		for (int i =0; i<hand.cards.length; i++)
		{
			hand.cards[i]=deck.cards[low+i];
		}
		return hand;
	}
	//merges and sorts two decks together, both subdecks are already sorted.
	public static Deck merge(Deck d1, Deck d2)
	{
		Deck merged = new Deck(d1.cards.length+d2.cards.length);
		int i=0;
		int j=0;
		for (int k=0; k<merged.cards.length; k++)
		{
			if (d1.cards.length-i==0)
			{
				merged.cards[k]=d2.cards[j];
				j++;
			}
			else if (d2.cards.length-j==0)
			{
				merged.cards[k]=d1.cards[i];
				i++;
			}
			else if (Card.compareCard(d1.cards[i],d2.cards[j])<0)
			{
				merged.cards[k]=d1.cards[i];
				i++;
			}
			else
			{
				merged.cards[k]=d2.cards[j];
				j++;
			}
		}
		return merged;
	}
	public static Deck mergeSort(Deck deck)
	{
		int mid=deck.cards.length/2;
		Deck d1=subDeck(deck,0,mid-1);
		Deck d2=subDeck(deck,mid,deck.cards.length-1);
		sortDeck(d1);
		sortDeck(d2);
		Deck merged=merge(d1,d2);
		return merged;
	}
	public static Deck mergeSortR(Deck deck)
	{
		if (deck.cards.length<=1)
		{
			return deck;
		}
		int mid=deck.cards.length/2;
		Deck d1=subDeck(deck,0,mid-1);
		Deck d2=subDeck(deck,mid,deck.cards.length-1);
		d1=mergeSortR(d1);
		d2=mergeSortR(d2);
		return merge(d1,d2);
	}
	public static void main(String[] args) 
	{
		Deck deck= new Deck();
		shuffleDeck(deck);
		printDeck(deck);
		//printDeck(mergeSort(deck));
		/*Deck hand1=subDeck(deck,0,4);
		printDeck(hand1);
		System.out.println();
		Deck hand2=subDeck(deck,5,9);
		printDeck(hand2);
		System.out.println();
		Deck pack=subDeck(deck,10,51);
		//printDeck(pack);
		sortDeck(hand1); sortDeck(hand2); sortDeck(pack);
		Deck subdecks = merge(hand1,hand2);
		printDeck(subdecks);
		System.out.println();
		Deck full=merge(subdecks,pack);
		printDeck(full);*/
		
		
	}

}