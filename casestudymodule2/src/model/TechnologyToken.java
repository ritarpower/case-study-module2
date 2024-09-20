package model;

import java.time.LocalDate;

public class TechnologyToken extends Token {
    private String technologyType;

    public TechnologyToken(int number, String symbol, String name, double price, LocalDate date, double amount, String technologyType) {
        super(number,symbol, name, price, date, amount);
        this.technologyType = technologyType;
    }

    public String getTechnologyType() {
        return technologyType;
    }

    public void setTechnologyType(String technologyType) {
        this.technologyType = technologyType;
    }

    @Override
    public String toString() {
        return "TechnologyToken{" + super.toString() +
                "technology='" + technologyType + '\'' +
                '}';
    }
}
