package br.com.cod3r.flyweight.musicPlayer.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MusicFlyweight {

    private String name;
    private String artist;
    private Integer durationInSeconds;

    @Override
    public String toString() {
        return "MusicFly [name=" + name + ", artist=" + artist
                + ", durationInSeconds=" + durationInSeconds + "]";
    }
}
