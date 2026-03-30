package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;

public class TentativaService {

    private final List<Tentativa> tentativas = new ArrayList<>();
    private long proximoId = 1;

    public Tentativa criarTentativa(long participanteId, long provaId) {
        Tentativa t = new Tentativa();
        t.setId(proximoId++);
        t.setParticipanteId(participanteId);
        t.setProvaId(provaId);
        tentativas.add(t);
        return t;
    }

    public void adicionarResposta(Tentativa tentativa, Questao q, char marcada) {
        Resposta r = new Resposta();
        r.setQuestaoId(q.getId());
        r.setAlternativaMarcada(marcada);
        r.setCorreta(q.isRespostaCorreta(marcada));

        tentativa.getRespostas().add(r);
    }

    public int calcularNota(Tentativa tentativa) {
        int acertos = 0;
        for (var r : tentativa.getRespostas()) {
            if (r.isCorreta())
                acertos++;
        }
        return acertos;
    }

    public List<Tentativa> listarTentativas() {
        return new ArrayList<>(tentativas);
    }
}
