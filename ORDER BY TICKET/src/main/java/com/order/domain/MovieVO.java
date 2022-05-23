package com.order.domain;

public class MovieVO {

	/*
	`movie_name` VARCHAR(20) NOT NULL COLLATE 'utf8mb4_general_ci',
	`movie_artist` VARCHAR(100) NOT NULL COLLATE 'utf8mb4_general_ci',
	`movie_genre` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`movie_running` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`movie_content` LONGTEXT NOT NULL COLLATE 'utf8mb4_general_ci',
	 */

	private String movie_name;
	private String movie_artist;
	private String movie_genre;
	private String movie_running;
	private String movie_content;
	
	//-----------------------------------getter setter------------------------------
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_artist() {
		return movie_artist;
	}
	public void setMovie_artist(String movie_artist) {
		this.movie_artist = movie_artist;
	}
	public String getMovie_genre() {
		return movie_genre;
	}
	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}
	public String getMovie_running() {
		return movie_running;
	}
	public void setMovie_running(String movie_running) {
		this.movie_running = movie_running;
	}
	public String getMovie_content() {
		return movie_content;
	}
	public void setMovie_content(String movie_content) {
		this.movie_content = movie_content;
	}

	//-----------------------------------constructor------------------------------
	public MovieVO() {	//기본생성자
		
	}
	
	public MovieVO(String movie_name, String movie_artist, String movie_genre, String movie_running,
			String movie_content) {
		super();
		this.movie_name = movie_name;
		this.movie_artist = movie_artist;
		this.movie_genre = movie_genre;
		this.movie_running = movie_running;
		this.movie_content = movie_content;
	}

	//-----------------------------------toString------------------------------
	@Override
	public String toString() {
		return "MovieVO [movie_name=" + movie_name + ", movie_artist=" + movie_artist + ", movie_genre=" + movie_genre
				+ ", movie_running=" + movie_running + ", movie_content=" + movie_content + "]";
	}
	
	
}
