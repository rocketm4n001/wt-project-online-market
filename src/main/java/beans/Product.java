package beans;

public class Product 
{
    private int id;
    private String name;
    private int price;
    private String color;
    private String image;
    private String description;
    private String size;

    public Product(int id, String name, int price, String color, String image, String size, String description)
	{
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.image = image;
        this.size = size;
        this.description = description;
    }

    public int getId() 
	{ 
		return this.id; 
	}
	
    public void setId(int id) 
	{
		this.id = id;
	}

    public String getName() 
	{ 
		return this.name; 
	}
    
	public void setName(String name) 
	{ 
		this.name = name; 
	}

    public int getPrice() 
	{ 
		return this.price; 
	}
	
    public void setPrice(int price) 
	{ 
		this.price = price; 
	}

    public String getImage() 
	{ 
		return this.image; 
	}
    
	public void setImage(String image) 
	{ 
		this.image = image; 
	}

    public String getColor() 
	{ 
		return this.color; 
	}
	
    public void setColor(String color) 
	{ 
		this.color = color; 
	}

    public String getDescripton() 
	{ 
		return this.description; 
	}

    public void setDescripton(String description) 
	{ 
		this.description = description; 
	}

    public String getSize() 
	{ 
		return size; 
	}
	
    public void setSize(String size) 
	{ 
		this.size = size; 
	}
}
