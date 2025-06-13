package br.com.cod3r.flyweight.musicPlayer;

import br.com.cod3r.flyweight.musicPlayer.service.MusicService;

public class Client {

	public static void main(String[] args) {
		final String userA = "User A";
		final String userB = "User B";

		final String musicaA = "The Unfforgiven;Mettalica;300";
		final String musicaB = "Be Yourself;Audioslave;200";

		MusicService player = new MusicService();
		player.listenMusic(userA, musicaA);
		player.listenMusic(userA, musicaA);
		player.listenMusic(userA, musicaA);
		player.listenMusic(userA, musicaB);
		player.listenMusic(userB, musicaA);
		player.listenMusic(userB, musicaB);
		
		player.report();
	}
}
