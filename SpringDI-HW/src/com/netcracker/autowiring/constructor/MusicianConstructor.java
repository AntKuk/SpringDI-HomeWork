package com.netcracker.autowiring.constructor;

import com.netcracker.autowiring.Instrument;
import com.netcracker.autowiring.Performer;

public class MusicianConstructor implements Performer {
    private String song;
    private Instrument instrument;

    public MusicianConstructor(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }


    @Override
    public void perform() {
        System.out.println("Playing " + song + ":");
        instrument.play();
    }
}
