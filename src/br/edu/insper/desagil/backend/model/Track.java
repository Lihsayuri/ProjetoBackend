package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private Integer duration;
	
	public Track(Artist artist, String name, Integer duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public Integer getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		Integer segundosTotal = this.duration;
		Integer minutos = segundosTotal/60;
		Integer segundos = segundosTotal % 60;
		String segundosRestantes;
		if (segundos < 10) {
			segundosRestantes = 0+Integer.toString(segundos);
		} else {
			segundosRestantes = Integer.toString(segundos);
		}
		String duracao = Integer.toString(minutos)+":"+segundosRestantes;
		return duracao;
	}
	
	public String getFullArtistName() {
		return getArtist().getName();
	}

	
}
