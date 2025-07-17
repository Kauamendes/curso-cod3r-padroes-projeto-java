package br.com.cod3r.state.headphone.states;

import br.com.cod3r.state.headphone.HeadPhone;

public class PlayingState implements HeadPhoneState {

    private static final HeadPhoneState instance = new PlayingState();

    private PlayingState() {
    }

    public static HeadPhoneState getInstance() {
        return instance;
    }

    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(false);
        System.out.println("> Stop Player");
        headPhone.setState(OnState.getInstance());
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(false);
        System.out.println("> Turning Off");
        headPhone.setState(OffState.getInstance());
    }
}
