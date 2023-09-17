package com.example.demo;

import com.example.demo.states.ReadyState;
import com.example.demo.states.State;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Player {
    @Getter
    private State state;
    @Getter
    private boolean playing = false;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);
        for(int i = 1; i <= 12; ++i) {
            playlist.add("Track " + i);
        }
    }
    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
    public void changeState(State state) {
        this.state = state;
    }
    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }
    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }



}
