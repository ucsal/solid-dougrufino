package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;

public class QuestaoService {

    private final List<Questao> questoes = new ArrayList<>();
    private long proximoId = 1;

    public void adicionarQuestao(long provaId, String enunciado, String[] alternativas, char correta) {

        Questao q = new Questao();
        q.setId(proximoId++);
        q.setProvaId(provaId);
        q.setEnunciado(enunciado);
        q.setAlternativas(alternativas);
        q.setAlternativaCorreta(correta);

        questoes.add(q);

        System.out.println("Questão cadastrada: " + q.getId());
    }

    public List<Questao> listarQuestoes() {
        return new ArrayList<>(questoes);
    }
}
