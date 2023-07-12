package com.paulo.dslist.dto;

public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;

	public GameDTO() {
	}

	public GameDTO(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
			String shortDescription, String longDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public Double getScore() {
		return score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

}
