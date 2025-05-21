package br.com.techchallenge.pedidoreceiver.core.usecase;

import br.com.techchallenge.pedidoreceiver.core.domain.Pedido;

public interface PedidoService {
    void processar(Pedido pedido);
}
