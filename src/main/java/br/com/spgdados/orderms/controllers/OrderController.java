package br.com.spgdados.orderms.controllers;

import br.com.spgdados.orderms.controllers.dto.ApiResponse;
import br.com.spgdados.orderms.controllers.dto.OrderResponse;
import br.com.spgdados.orderms.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/customer/{customerId}/orders")
    public ResponseEntity<ApiResponse<OrderResponse>> listOrders(@RequestParam(name = "page", defaultValue = "0") Integer page,
                                                                 @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSeize){

        return ResponseEntity.ok(null);

    }
}
