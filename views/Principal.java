package views;

import utils.Console;

public class Principal {
    
    public static void main (String[] args) {

        int opcao = 0, opcaoEditar;
        do{
            System.out.println("\n\n\n\t  ====  My artist  ==== \n");

            System.out.println("\t| 0 - Sair\t\t|");
            System.out.println("\t|=======================|");
            System.out.println("\t| 1 - Cadastrar Cliente\t|");
            System.out.println("\t| 2 - Listar Clientes\t|");
            System.out.println("\t| 3 - Cadastrar Artista\t|");
            System.out.println("\t| 4 - Listar Artistas\t|");
            System.out.println("\t| 5 - Cadastrar Produto\t|");
            System.out.println("\t| 6 - Listar Produtos\t|");
            System.out.println("\t| 7 - Agendar\t\t|");
            System.out.println("\t| 8 - Agendamentos\t|");
            System.out.println("\t|=======================|");
            System.out.println("\t| 9 - Editar\t\t|\n");
            
            opcao = Console.readInt("\t Digite uma opção: ");

            switch (opcao) {
                case 1:
                CadastrarClientes cadastrarClientes = new CadastrarClientes();
                cadastrarClientes.renderizar();
                break;
                case 2:
                ListarClientes listarClientes = new ListarClientes();
                listarClientes.renderizar();
                break;
            }


        }   while (opcao !=0);
    }
}
