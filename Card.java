import java.util.Random;

public class Card
{

	//data attributes
	private int faceNameValue;
	private int suitNameValue;
	private String faceName;
	private String suitName;
	
	//constants
	//suit values
	private final int CLUBS = 1;
	private final int DIAMONDS = 2;
	private final int HEARTS = 3; 
	private final int SPADES = 4;
	//special cards
	private final int ACE = 1;
	private final int JACK = 11;
	private final int QUEEN = 12;
	private final int KING = 13;
	
	public Card ()
	{
		
		suitNameValue = (int) (Math.random()* (4) + 1);
		faceNameValue =  (int) (Math.random()*(13) + 1);
		setsuitName();
		setfaceName();
	}
	
	public Card (int suit, int face)
	{
		
		suitNameValue = suit;
		faceNameValue = face;
		setsuitName();
		setfaceName();
	}
	
	private void setsuitName ()
	{
		switch (suitNameValue)
		{
			case CLUBS : suitName = "CLUBS";
			        break;
			case DIAMONDS: suitName = "DIAMONDS";
	        		break;
			case HEARTS: suitName = "HEARTS";
	        		break;
			case SPADES: suitName = "SPADES";
	        		break;
	        default : suitName = "ERROR";
		}
		
	}
	
	private void setfaceName ()
	{
		switch (faceNameValue)
		{
			case ACE: faceName = "ACE";
			        break;
			case 2: faceName = "TWO";
	        		break;
			case 3: faceName = "THREE";
	        		break;
			case 4: faceName = "FOUR";
	        		break;
			case 5: faceName = "FIVE";
					break;
			case 6: faceName = "SIX";
	        		break;
			case 7: faceName = "SEVEN";
		    		break;
			case 8: faceName = "EIGHT";
		    		break;
			case 9: faceName = "NINE";
		    		break;
			case 10: faceName = "TEN";
					break;
			case JACK: faceName = "JACK";
	        	break;
			case QUEEN: faceName = "QUEEN";
    			break;
			case KING: faceName = "KING";
    			break;
	        default : suitName = "ERROR";
		}
	}
	
	public boolean isHigherThan(Card c)
	{
		if (this.faceNameValue == c.faceNameValue)
		{
			if (suitNameValue > c.suitNameValue)
				return true;
			else 
				return false;
		}
	    else if (faceNameValue == ACE)
	    	return true;
	    else if (c.faceNameValue == ACE)
	    	return false;
	    else if (faceNameValue > c.faceNameValue)
	    	return true;
	    else 
	    	return false;
	}
		
	public boolean isHigherThan(Card c, boolean aceHigh)
	{
		if (aceHigh)
			return isHigherThan(c);
		else 
		{
			if (this.faceNameValue == c.faceNameValue)
			{
				if (suitNameValue > c.suitNameValue)
					return true;
				else 
					return false;
			}
		    else if (faceNameValue > c.faceNameValue)
		    	return true;
		    else 
		    	return false;
		}
	}
	public String toString ()
	{
		return faceName + " " + suitName;
	}
	
}