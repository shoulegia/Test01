package com.shoulegia.proxy;

public class Lenovo implements SaleComputer {
    @Override
    public String sale(Double money) {
        System.out.println("花了"+money+"元买电脑");
        return "电脑";
    }

    @Override
    public void show() {
        System.out.println("Lenovo电脑");
    }
}
