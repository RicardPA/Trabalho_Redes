package mvc.modelo;

import java.security.PrivateKey;
import java.security.PublicKey;

public class MyUser {
	private String tagString;
	private String name;
	private String description;
	private PrivateKey privateKey;
	private PublicKey publicKey;
	
	public MyUser(String tagString, String name, String description, PrivateKey privateKey, PublicKey publicKey) {
		this.tagString = tagString;
		this.name = name;
		this.description = description;
		this.privateKey = privateKey;
		this.publicKey = publicKey;
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
	
	public PrivateKey getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(PrivateKey privateKey) {
		this.privateKey = privateKey;
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
