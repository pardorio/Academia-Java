package PetShop;

import java.util.ArrayList;


public class Principal {

	public static void main(String[] args) {
		//animal
				Animal animal1 = new Animal("Café", "Gato", "Malhado", "30/05/2020", "Pedro");

		        Servico banho = new Banho();
		        Servico tosa = new Tosa();
		       


		        animal1.adicionarServico(banho);
		        animal1.adicionarServico(tosa);
		        

		        System.out.println("Informações sobre o Animal: ");
		        System.out.println(animal1);


		        System.out.println("Serviços Prestados:");

		        for (Servico servico : animal1.getServicosPrestados()) {

		            System.out.println("Descrição so Serviço: " + servico.descricao());
		            System.out.println("Preço do Serviço: R$ " + servico.preco());

		
		//produto
		 
		Produto produto1 = new Produto("Ração de gato", "Comida", 40, 20);

	        Agenda agenda = new Agenda(animal1,banho,"10/01/2023","10:30");

	        //lista agenda
	        ArrayList<Agenda> agenda1 = new ArrayList<>();
	        agenda1.add(agenda);

	        System.out.println(agenda1);
	        produto1.reporEstoque(5);
	        produto1.vender(2);

	        System.out.println("INVENTÁRIO - Estoque de ração: " + produto1.getQtdEstoque());


		
        }


        


       
    }


}
