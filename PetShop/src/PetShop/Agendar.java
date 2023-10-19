package PetShop;

import java.util.ArrayList;

import java.util.List;

public class Agendar {
    private List<Agenda> agenda1;

    public Agendar() {
        agenda1 = new ArrayList<>();
    }

    public boolean agendarHora(Agenda novoAgenda) {
       
        for (Agenda agenda : agenda1) {
            if (agenda.getData().equals(novoAgenda.getData()) &&
                agenda.getHorario().equals(novoAgenda.getHorario())) {
                System.out.println("Horário já ocupado. Agendamento não realizado.");
                return false;
            }
        }

        
        agenda1.add(novoAgenda);
        System.out.println("Agendamento realizado com sucesso.");
        return true;
    }

}