package com.petstore;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The Pet.
 */
@Generated("com.robohorse.robopojogenerator")
public class Pet{

	@JsonProperty("photoUrls")
	private List<String> photoUrls;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("tags")
	private List<Object> tags;

	@JsonProperty("status")
	private String status;

	/**
	 * Set photo urls.
	 *
	 * @param photoUrls the photo urls
	 */
	public void setPhotoUrls(List<String> photoUrls){
		this.photoUrls = photoUrls;
	}

	/**
	 * Get photo urls list.
	 *
	 * @return the list
	 */
	public List<String> getPhotoUrls(){
		return photoUrls;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * Get id int.
	 *
	 * @return the int
	 */
	public int getId(){
		return id;
	}

	/**
	 * Set tags.
	 *
	 * @param tags the tags
	 */
	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	/**
	 * Get tags list.
	 *
	 * @return the list
	 */
	public List<Object> getTags(){
		return tags;
	}

	/**
	 * Set status.
	 *
	 * @param status the status
	 */
	public void setStatus(String status){
		this.status = status;
	}

	/**
	 * Get status string.
	 *
	 * @return the string
	 */
	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Pet{" + 
			"photoUrls = '" + photoUrls + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",tags = '" + tags + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}