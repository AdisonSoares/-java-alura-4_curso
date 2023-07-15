package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido= new Pedido();
        pedido.setNomeProduto("Xiaomi Redmi Note 8");
        pedido.setUrlDaImagem("https://m.media-amazon.com/images/I/51RIqTiRc8L._AC_SX522_.jpg");
        pedido.setUrlDoProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-Camera/dp/B07Z5BBG56");
        pedido.setDescricao("Smartphone Xiaomi");
        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
