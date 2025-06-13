package br.com.cod3r.flyweight.musicPlayer.flyweight;


import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class FlyweightFactory {

    private static FlyweightFactory instance = new FlyweightFactory();
    private static Map<String, MusicFlyweight> musicFlyweightRepository;

    private FlyweightFactory() {
        musicFlyweightRepository = new HashMap<>();
    }

    public static FlyweightFactory getInstance() {
        return instance;
    }

    public MusicFlyweight getMusic(String desc) {
        MusicFlyweight mf = musicFlyweightRepository.get(desc);
        if (isNull(mf)) {
            System.out.println("Creating new Flyweight for " + desc);
            mf = getMusicByString(desc);
            musicFlyweightRepository.put(desc, mf);
        }
        return mf;
    }

    private MusicFlyweight getMusicByString(String desc) {
        String[] musicData = desc.split(";");
        return new MusicFlyweight(musicData[0], musicData[1], new Integer(musicData[2]));
    }

    public Integer getTotalMusics() {
        return musicFlyweightRepository.size();
    }
}
