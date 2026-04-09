package com.keychron.izvoc;

import com.keychron.izvoc.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IzvocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IzvocApplication.class, args);


		OrderService orderService = new OrderService();

		System.out.println("Olá seja bem vindo ao Izvoc");

		System.out.println("Seguimos uma política de excelência e simplicidade confira já nossos preços");

		orderService.gestaoPedido();








	}

}
