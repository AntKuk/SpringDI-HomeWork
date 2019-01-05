package com.netcracker.autowiring;

public class Musician implements Performer {
    private String song;
    private Instrument instrument;

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
