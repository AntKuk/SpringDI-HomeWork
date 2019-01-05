package com.netcracker.factory;

import com.netcracker.autowiring.Instrument;
import com.netcracker.autowiring.Musician;

public class MusicianFactory {

    public Musician createPianist() {
        Instrument piano = new Instrument() {
            @Override
            public void play() {
                System.out.println("PLINK PLINK PLINK");
            }
        };

        Musician pianist = new Musician();
        pianist.setInstrument(piano);
        pianist.setSong("Piano Factory Song");
        return pianist;
    }
}
