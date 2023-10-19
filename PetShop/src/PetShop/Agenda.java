package PetShop;



public class Agenda {
	private String  data, horario;
	private Animal animal;
	private Servico servico;

	public Agenda(Animal animal, Servico servico, String data, String horario) {
        this.animal = animal;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }
	
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	@Override
    public String toString() {
        return "Animal: " + animal +
                ", servico: " + servico.descricao() +
                ", data: " + data + '\'' +
                ", horario: " + horario + '\'';
    }
	
	

}
