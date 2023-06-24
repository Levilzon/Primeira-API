package br.com.projeto.api.controle;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.entidades.Departamento;
import br.com.projeto.api.entidades.Produto;


@RestController
@RequestMapping(value = "/products")
public class Controle {
   
    @GetMapping
    public List<Produto> getObjeto(){
        Departamento d1 = new Departamento(1L, "Soni");
        Departamento d2 = new Departamento(2L, "Micrsoft");
        
        Produto p1 = new Produto(1L, "Psvita", 2444.00, d2);
        Produto p2 = new Produto(13L, "ps3", 23.99, d1);
        Produto p3 = new Produto(4l, "XisBoCs 180", 200.00, d2);

        List<Produto> lista = Arrays.asList(p1, p2,p3);
        return lista;
    }
   
}
