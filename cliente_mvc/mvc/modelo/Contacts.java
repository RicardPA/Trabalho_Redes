package mvc.modelo;

import java.security.PublicKey;

public class Contacts {
	private String tagString;
	private String name;
	private String description;
	private PublicKey publicKey;
	
	public Contacts(String tagString, String name, String description, PublicKey publicKey) {
		this.name = name;
		this.description = description;
		this.publicKey = publicKey;	
		this.tagString = tagString;
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
	
	public PublicKey getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(PublicKey publicKey) {
		this.publicKey = publicKey;
	}

	public String getTagString() {
		return tagString;
	}

	public void setTagString(String tagString) {
		this.tagString = tagString;
	}
}
