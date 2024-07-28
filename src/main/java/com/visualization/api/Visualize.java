package com.visualization.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "data")
public class Visualize {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int intensity;
	
	private int likelihood;
	
	private int relevance;
	
	private int startyear;
	
	private int endyear;
	
	private String country;
	
	private String topics;
	
	private String region;
	
	private String city;
	
	private String swot;
	
	private String source;
	
	private String sector;
	
	private String pest;

	public Visualize() {
		
		
	}

	public Visualize(Long id, int intensity, int likelihood, int relevance, int startyear, int endyear, String country,
			String topics, String region, String city, String swot, String source, String sector, String pest) {
		super();
		this.id = id;
		this.intensity = intensity;
		this.likelihood = likelihood;
		this.relevance = relevance;
		this.startyear = startyear;
		this.endyear = endyear;
		this.country = country;
		this.topics = topics;
		this.region = region;
		this.city = city;
		this.swot = swot;
		this.source = source;
		this.sector = sector;
		this.pest = pest;
	}

	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	public int getLikelihood() {
		return likelihood;
	}

	public void setLikelihood(int likelihood) {
		this.likelihood = likelihood;
	}

	public int getRelevance() {
		return relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}

	public int getStartyear() {
		return startyear;
	}

	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}

	public int getEndyear() {
		return endyear;
	}

	public void setEndyear(int endyear) {
		this.endyear = endyear;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSwot() {
		return swot;
	}

	public void setSwot(String swot) {
		this.swot = swot;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getPest() {
		return pest;
	}

	public void setPest(String pest) {
		this.pest = pest;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
