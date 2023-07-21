package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.dto.RequisicaoNovoPedidoDto;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.alura.mvc.mudi.model.Pedido;

import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(Model model){
        RequisicaoNovoPedidoDto requisicaoNovoPedidoDto = new RequisicaoNovoPedidoDto();
        model.addAttribute("requisicaoNovoPedidoDto", requisicaoNovoPedidoDto);
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(@Valid RequisicaoNovoPedidoDto requisicao, BindingResult result){
        if(result.hasErrors()){
            return "pedido/formulario";
        }
        Pedido pedido = requisicao.toPedido();
        pedidoRepository.save(pedido);
        return "redirect:/home";
    }
}
