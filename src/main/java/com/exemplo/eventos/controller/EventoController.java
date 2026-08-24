package com.exemplo.eventos.controller;

import com.exemplo.eventos.model.Evento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventoController {

    /**
     * Exibe a página com o formulário de cadastro de evento.
     * Endereço: http://localhost:8080/evento/formulario
     */
    @GetMapping("/evento/formulario")
    public String exibirFormulario() {
        return "formulario";
    }

    /**
     * Método executado quando o formulário é submetido (botão Enviar).
     * O endereço abaixo precisa ser IGUAL ao atributo "action" do <form>.
     *
     * Esta é a versão FINAL do exercício (Passo 3): em vez de vários
     * parâmetros String soltos, recebemos um único objeto Evento.
     * O Spring cria o objeto automaticamente e usa os "setters"
     * (setNome, setData, setLocal, setDescricao) para preenchê-lo
     * com os valores enviados pelo formulário, casando pelo nome
     * dos campos (data binding).
     */
    @PostMapping("/evento/cadastrar")
    public String cadastrarEvento(@ModelAttribute Evento evento) {
        System.out.println("===== Metodo cadastrarEvento foi chamado! =====");
        System.out.println("Objeto Evento recebido: " + evento);
        System.out.println("Nome......: " + evento.getNome());
        System.out.println("Data......: " + evento.getData());
        System.out.println("Local.....: " + evento.getLocal());
        System.out.println("Descricao.: " + evento.getDescricao());
        System.out.println("================================================");

        return "sucesso";
    }

}
