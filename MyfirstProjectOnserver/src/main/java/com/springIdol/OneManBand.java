package com.springIdol;


import java.util.Collection;

/**
 * Created by Администратор on 02.10.2014.
 */
public class OneManBand implements Performer{



    private Collection<Instrument> instruments;

public OneManBand () {



}



    public void perform() throws PerformanceException {

  for (Instrument instrument: instruments) {

      instrument.play();


  }



    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
