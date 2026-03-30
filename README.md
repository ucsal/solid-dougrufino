O que foi feito: Criação das classes de serviço: ParticipanteService ProvaService QuestaoService TentativaService

Separação das responsabilidades que estava atrelado na classe do App Melhoria nas classes Participante e Prova, com uso de construtores e remoção de setters para evitar alterações inrreponsáveis Organização geral do código, deixando mais limpo e fácil de entender

O app antes acumulava muitas responsabilidade como cadastro e logicas de negocio, o ParticipanteService cuida só dos participantes, o ProvaService das provas, e assim por diante.
