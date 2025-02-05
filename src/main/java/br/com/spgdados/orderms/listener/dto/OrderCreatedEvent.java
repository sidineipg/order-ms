package br.com.spgdados.orderms.listener.dto;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido,
                                Long codigoCliente,
                                List<OrdemItemEvent> itens) {
}
