package br.com.cod3r.flyweight.musicPlayer.model;

import br.com.cod3r.flyweight.musicPlayer.flyweight.MusicFlyweight;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Music {

	private MusicFlyweight musicFlyweight;
	private Integer playerQty;

	public Music(MusicFlyweight musicFlyweight) {
		this.musicFlyweight = musicFlyweight;
		this.playerQty = 0;
	}

	public void listenning() {
		playerQty++;
	}

	@Override
	public String toString() {
		return musicFlyweight.toString() + ", playerQty=" + playerQty + "]";
	}
}
