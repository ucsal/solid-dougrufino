public class ParticipanteService {
    private final List<Participante> participantes = new ArrayList<>();
    private long proximoId = 1;

    public void adicionarParticipante(String nome, String email) {
        Participante p = new Participante(proximoId++, nome, email);
        participantes.add(p);
        System.out.println("Participante cadastrado: " + p.getId());
    }

    public List<Participante> listarParticipantes() {
        return new ArrayList<>(participantes);
    }
}
