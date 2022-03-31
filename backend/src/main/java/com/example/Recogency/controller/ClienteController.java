package com.example.Recogency.controller;

import com.example.Recogency.model.Cliente;
import com.example.Recogency.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cliente")
    public class ClienteController {

@Autowired
    private ClienteRepository clienteRepository;

@GetMapping
    public ModelAndView details() {
        ModelAndView modelAndView = new ModelAndView("cliente/list");

        List<Cliente> clientes = clienteRepository.findAll();
        modelAndView.addObject("clientes", clientes);
        return modelAndView;
}

@GetMapping("/{id}")
    public ModelAndView details(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("cliente/details");

        Cliente clientes = clienteRepository.getById(id);

        modelAndView.addObject("clientes", clientes);

        return modelAndView;
}

    @GetMapping("/{id}/ecluir")
    public ModelAndView delete(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/cliente");

        clienteRepository.deleteById(id);

        return modelAndView;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        ModelAndView modelAndView = new ModelAndView("cliente/cadastro");
        modelAndView.addObject("clientes", new Cliente());
        return modelAndView;
    }

}
