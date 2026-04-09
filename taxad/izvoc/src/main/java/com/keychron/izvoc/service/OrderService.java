package com.keychron.izvoc.service;

import com.keychron.izvoc.entities.Frete;
import com.keychron.izvoc.entities.Pedido;

import java.util.Scanner;

public class OrderService {
    Scanner sc = new Scanner(System.in);

    private Frete frete = new Frete();
    private Pedido pedido = new Pedido();
    ShippingService shippingService = new ShippingService();


    public void gestaoPedido( ) {
        System.out.println("Olá seja bem vindo ao nosso e-comerce");

        System.out.println("Escolha uma das opções abaixo");
        System.out.println("Digite 1 para IPHONE 17 - 5000");
        System.out.println("Digite 2 para fita led - 132");
        System.out.println("Digite 3 para Fone de ouvido sem fio  - 12");

        switch (sc.next()) {

            case "1":
                System.out.println("IPHONE 17 - 5000");

                pedido.setValor(5000);
                pedido.setCodigo("IPHONE 17");
                shippingService.gestaoFrete();
                valorFinal();
                System.out.println("Obrigado por confiar na gente");
                System.out.println("Estamos processando seu pedido");
                System.out.println("O produto escolhido ficou em " + pedido.getValor());
                System.out.println("O valor final ficou em : \n");
                valorFinal();

                System.out.println("Sendo " + frete.getFrete() + "Referentes ao frente");


                break;
            case "2":
                System.out.println("Fita LED - 132");
                pedido.setValor(132);
                pedido.setCodigo("LED XC96");
                shippingService.gestaoFrete();
                valorFinal();
                System.out.println("Obrigado por confiar na gente");
                System.out.println("Estamos processando seu pedido");
                System.out.println("O produto escolhido ficou em " + pedido.getValor());
                System.out.println("O valor final ficou em : \n");
                valorFinal();

                System.out.println("Sendo " + frete.getFrete() + "Referentes ao frente");


                break;
            case "3":
                System.out.println(" Fone de ouvido sem fio  - 12");
                pedido.setValor(12);
                pedido.setCodigo("XIAOMI 1919");

                shippingService.gestaoFrete();
                valorFinal();
                System.out.println("Obrigado por confiar na gente");
                System.out.println("Estamos processando seu pedido");
                System.out.println("O produto escolhido ficou em " + pedido.getValor());
                System.out.println("O valor final ficou em : \n");
                valorFinal();

                System.out.println("Sendo " + frete.getFrete() + "Referentes ao frente");
                break;

            default:
                System.out.print("Até mais");
                System.exit(0);

        }





        }
    public void valorFinal () {
        double desconto = 0;
        double valorFinal = 0;
        if (pedido.getValor() >= 2000) {
            desconto = pedido.getValor() * 0.15;
            valorFinal = pedido.getValor() - desconto;
            System.out.println(valorFinal);
        } else if (pedido.getValor() <= 132 && pedido.getValor() >= 75) {

            desconto = pedido.getValor() * 0.25;

            valorFinal = pedido.getValor() - desconto;

            System.out.println(valorFinal);

        } else if (pedido.getValor() >= 0 && pedido.getValor() <= 75) {
            desconto = pedido.getValor() * 0.30;
            valorFinal = pedido.getValor() - desconto;

            System.out.println(valorFinal);

        }
    }}


