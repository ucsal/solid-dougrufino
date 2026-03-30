package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;

public class ProvaService {

    private final List<Prova> provas = new ArrayList<>();
    private long proximoId = 1;

    public void adicionarProva(String titulo) {
        Prova prova = new Prova(proximoId++, titulo);
        provas.add(prova);
        System.out.println("Prova criada: " + prova.getId());
    }

    public List<Prova> listarProvas() {
        return new ArrayList<>(provas);
    }
}
