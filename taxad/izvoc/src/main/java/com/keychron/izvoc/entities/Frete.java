package com.keychron.izvoc.entities;

public class Frete {
    private double frete;
    private double desconto;

    public Frete() {}

    public Frete(double frete, double desconto) {
        this.frete = frete;
        this.desconto = desconto;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Frete{" +
                "frete=" + frete +
                ", desconto=" + desconto +
                '}';
    }
}
