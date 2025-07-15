package br.com.cod3r.iterator.tvChannel;

import java.util.Iterator;

import static java.util.Objects.nonNull;

public class ChannelIterator implements Iterator<Integer> {

    private Integer[] channels;
    private int index;

    public ChannelIterator(Integer[] channels) {
        this.channels = channels;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return nonNull(channels) && nonNull(channels[index]);
    }

    @Override
    public Integer next() {
        return channels[index++];
    }
}
