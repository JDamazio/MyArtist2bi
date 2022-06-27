package views;

import utils.Console;

public class Principal {
    
    public static void main (String[] args) {

        int opcao = 0;
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
            System.out.println("\t| 8 - Agendados\t\t|");
            System.out.println("\t| 9 - Avaliar\t\t|");
            System.out.println("\t| 10 - Listar Avaliações|");
            System.out.println("\t| 11 - Encomendar\t|");
            System.out.println("\t| 12 - Listar encomendas|");
            System.out.println("\t|=======================|");
            System.out.println("\t| 13 - Editar artista\n");
            System.out.println("\t| 14 - Deletar artista\n");
            
            opcao = Console.readInt("\t Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarCliente cadastrarClientes = new CadastrarCliente();
                    cadastrarClientes.renderizar();
                    break;
                case 2:
                    ListarClientes listarClientes = new ListarClientes();
                    listarClientes.renderizar();
                    break;
                case 3:
                    CadastrarArtista cadastrarArtista = new CadastrarArtista();
                    cadastrarArtista.renderizar();
                    break;
                case 4:
                    ListarArtistas listarArtistas = new ListarArtistas();
                    listarArtistas.renderizar();
                    break;
                case 5:
                    CadastrarProduto cadastrarProduto = new CadastrarProduto();
                    cadastrarProduto.renderizar();
                    break;
                case 6:
                    ListarProdutos listarProdutos = new ListarProdutos();
                    listarProdutos.renderizar();
                    break;
                case 7:
                    Agendar agendar = new Agendar();
                    agendar.renderizar();
                    break;
                case 8:
                    Agendamentos agendamentos = new Agendamentos();
                    agendamentos.renderizar();
                    break;
                case 9:
                    CadastrarAvaliacao cadastrarAvaliacao = new CadastrarAvaliacao();
                    cadastrarAvaliacao.renderizar();
                    break;
                case 10:
                    ListarAvaliacoes listarAvaliacoes = new ListarAvaliacoes();
                    listarAvaliacoes.renderizar();
                    break;
                case 11:
                    CadastrarEncomenda cadastrarEncomenda = new CadastrarEncomenda();
                    cadastrarEncomenda.renderizar();
                    break;
                case 12:
                    ListarEncomenda listarEncomenda = new ListarEncomenda();
                    listarEncomenda.renderizar();
                    break;
                case 13:
                    EditarArtista editarArtista = new EditarArtista();
                    editarArtista.renderizar();
                    break;
                case 14:
                    DeletarArtista deletarArtista = new DeletarArtista();
                    deletarArtista.renderizar();
                    break;
                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }
        }   while (opcao !=0);
    }
}
