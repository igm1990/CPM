package model;

import model.types.Rarity;

public class Skin {

	private String id;
	private String name, description;
	private float price;
	private Rarity type;
	private String image;

	public Skin(String id, String name, String description, float price,
			Rarity type) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.type = type;
		this.image = name.replace(' ', '-') + ".jpeg";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Rarity getType() {
		return type;
	}

	public void setType(Rarity type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skin other = (Skin) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Skin [id=" + id + ", name=" + name + ", description="
				+ description + ", price=" + price + ", type=" + type
				+ ", image=" + image + "]";
	}

}
