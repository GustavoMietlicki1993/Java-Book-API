package controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import models.Categoria;
import org.springframework.web.bind.annotation.*;
import repository.CategoriaRepository;

import java.util.List;
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class CategoriaController {

    CategoriaRepository categoriaRepository;

    //Listar o conteudo de categoria
    @GetMapping("/Categoria")
    public List<Categoria> listaDeCategorias() {
        return categoriaRepository.findAll();
    }

    //Listar o conteudo de categoria atravez do ID
    @GetMapping("/Categoria/{id}")
    public List<Categoria> categoriaId (@PathVariable(value = "id") int id){
        return (List<Categoria>) categoriaRepository.findById(id);
    };

    //Adicionar uma Categoria
    @PostMapping("/categoria")
    public Categoria salvarCategoria (@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    };

    //Atualizar uma Categoria
    @PutMapping("/categoria")
    public Categoria atualizarCategoria (@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    //Deletar uma categoria
    @DeleteMapping("/categoria")
    public void deletarCategoria (@RequestBody Categoria categoria) {
        categoriaRepository.delete(categoria);
    }
}
