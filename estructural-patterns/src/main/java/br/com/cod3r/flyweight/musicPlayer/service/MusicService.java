package br.com.cod3r.flyweight.musicPlayer.service;

import br.com.cod3r.flyweight.musicPlayer.flyweight.FlyweightFactory;
import br.com.cod3r.flyweight.musicPlayer.model.Music;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Objects.isNull;

public class MusicService {
	private final Map<String, Map<String, Music>> memory;
	
	public MusicService() {
		memory = new HashMap<>();
	}
	
	public void listenMusic(String user, String desc) {
		Map<String, Music> userPlayList = memory.get(user);
		if (isNull(userPlayList)) {
			userPlayList = new HashMap<>();
			memory.put(user, userPlayList);
		}

		Music song = userPlayList.get(desc);
		if (isNull(song)) {
			song = new Music(FlyweightFactory.getInstance().getMusic(desc));
			userPlayList.put(desc, song);
		}
		System.out.println(String.format("%s is lintening '%s'", user, song.getMusicFlyweight().getName()));
		song.listenning();
	}
	
	public void report() {
		Set<String> users = memory.keySet();
		users.forEach(u -> {
			AtomicInteger timeCounter = new AtomicInteger(0);
			System.out.println("---------");
			System.out.println(u + " has listen...");
			Collection<Music> musics = memory.get(u).values();
			musics.forEach(m -> {
				System.out.println(String.format("%s/%s %d times",
						m.getMusicFlyweight().getArtist(),
						m.getMusicFlyweight().getName(),
						m.getPlayerQty()));
				timeCounter.addAndGet(m.getPlayerQty() * m.getMusicFlyweight().getDurationInSeconds());
			});
		});
		System.out.println("Total of musics in flyweight's memory: " + FlyweightFactory.getInstance().getTotalMusics());
	}
}
