package com.keychron.izvoc.service;

import com.keychron.izvoc.entities.Frete;
import com.keychron.izvoc.entities.Pedido;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private Frete frete = new Frete();
    private Pedido pedido = new Pedido();


    public void gestaoFrete() {

        if ( pedido.getValor() >= 200){


            System.out.println("Frete grátis aproveite esse presente!");


        } else if (pedido.getValor() >= 100 &&  pedido.getValor() >= 200) {

            frete.setFrete(12);

            System.out.println("Obrigado por confiar na gente \n O valor do Frete é " +frete.getFrete());


        } else {

            frete.setFrete(20);
            System.out.println("Obrigado por confiar na gente \n O valor do Frete é " +frete.getFrete());

        }

    }



}
