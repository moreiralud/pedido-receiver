package br.com.techchallenge.pedidoreceiver.application.controller;

import br.com.techchallenge.pedidoreceiver.core.domain.Pedido;
import br.com.techchallenge.pedidoreceiver.core.usecase.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos/pedido")
public class PedidoReceiverController {

    private final PedidoService pedidoService;

    public PedidoReceiverController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<Void> receber(@RequestBody Pedido pedido) {
        pedidoService.processar(pedido);
        return ResponseEntity.ok().build();
    }
}
