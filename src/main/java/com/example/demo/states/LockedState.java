package com.example.demo.states;

import com.example.demo.Player;

public class LockedState extends State{
    LockedState(Player player) {
        super(player);

    }

    @Override
    public String onLock() {
        if(player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop Playing";
        }else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
