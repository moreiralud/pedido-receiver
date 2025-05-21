package br.com.techchallenge.pedidoreceiver.core.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pedido {
    private String id;
    private String clienteId;
    private String status;
}
