package org.model;

/**
 * Buy entity. @author MyEclipse Persistence Tools
 */

public class Buy implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Long price;

	// Constructors

	/** default constructor */
	public Buy() {
	}

	/** minimal constructor */
	public Buy(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Buy(Integer id, String name, Long price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

}