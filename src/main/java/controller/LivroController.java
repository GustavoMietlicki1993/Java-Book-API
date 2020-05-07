package controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import models.Livro;
import org.springframework.web.bind.annotation.*;
import repository.LivroRepository;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class LivroController {

    LivroRepository livroRepository;

    @GetMapping("/livro")
    public List<Livro> ListagemDeLivros (){
        return livroRepository.findAll();
    }

    @GetMapping("/livro/{id}")
    public List<Livro> listarLivroPorId(@PathVariable(value = "id") int id) {
        return (List<Livro>)livroRepository.findById(id);
    }

    @PostMapping("/livro")
    public Livro adicionarUmLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    };

    @PutMapping("/livro")
    public Livro atualizarUmLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    };

    @DeleteMapping("/livro")
    public void LivrodeletarUmLivro(@RequestBody Livro livro){
         livroRepository.delete(livro);
    };
}
