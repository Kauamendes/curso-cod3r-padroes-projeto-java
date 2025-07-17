package br.com.cod3r.state.headphone.states;

import br.com.cod3r.state.headphone.HeadPhone;

public interface HeadPhoneState {
    void click(HeadPhone headPhone);

    void longClick(HeadPhone headPhone);
}
