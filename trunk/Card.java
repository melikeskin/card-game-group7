import java.awt.image.BufferedImage;


public abstract class Card {

	private String name;
	private String text;
	private int mana;
	private String classType;
	private BufferedImage image;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
	public void setMana(int mana)
	{
		this.mana = mana;
	}
	
	public void setClassType(String classType)
	{
		this.classType = classType;
	}
	
	public void setImage(BufferedImage image)
	{
		this.image = image;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getText()
	{
		return text;
	}
	
	public int getMana()
	{
		return mana;
	}
	
	public String getClassType()
	{
		return classType;
	}

	public BufferedImage getImage()
	{
		return image;
	}
}
