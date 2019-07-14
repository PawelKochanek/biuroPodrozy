package pl.piotrpawel.biuropodrozy;

import lombok.Getter;

@Getter
public enum Countries {

    POLAND("PL", "Polska"), GERMANY("DE", "Niemcy"), ENGLAND("ENG", "Anglia"),
    FRANCE("FRA", "Francja"), RUSSIA("RU", "Rosja");

    private String symbol;
    private String plName;

    Countries(String symbol, String plName) {

        this.symbol = symbol;
        this.plName = plName;
    }
}