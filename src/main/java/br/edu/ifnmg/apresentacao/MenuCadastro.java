
package br.edu.ifnmg.apresentacao;
import br.edu.ifnmg.modelo.RevistaCientifica;
import br.edu.ifnmg.modelo.Edicao;
import br.edu.ifnmg.modelo.Artigo;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import br.edu.ifnmg.controle.RevistaControll;
import br.edu.ifnmg.controle.ArtigoControll;
import br.edu.ifnmg.controle.EdicaoControll;
/**
 *
 * @author Zelia
 */
public class MenuCadastro {
      public static void main(String[] parametros){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        do{
            try{
                System.out.println("\n\n==============Menu==============");
                System.out.println("Operacao: ");
                System.out.println("1 - Cadastrar Revista Cientifica");
                System.out.println("2 - Cadastrar Edicao");
                System.out.println("3 - Cadastrar Artigo Cientifico");
                System.out.println("4 - Listar Revistas");
                System.out.println("5 - Listar Edicoes");
                System.out.println("6 - Listar Artigos");
                System.out.println("0 - Sair");
                
                System.out.println("Informe a opcao desejada: ");
                opcao = Integer.parseInt(scanner.nextLine());
                 
                switch (opcao) {
                    case 1:
                        cadastroRevista(scanner);
                        break;
                    case 2:
                        cadastroEdicao(scanner);
                        break;    
                    case 3:
                        cadastroArtigo(scanner);
                        break;
                    case 4:
                        listarRevistas();
                        break;
                    case 5:
                        listarEdicoes();
                        break;
                    case 6:
                        listarArtigos();
                        break;
                }
        }catch(NumberFormatException e){
                System.out.println("\nOpcao Invalida! Tente novamente.");
                opcao = -1;
        }catch(Exception e){
                System.out.println("\nErro! Tente Novamente.");
                opcao = -1;                
        }
            
        }while(opcao != 0);
    }
      private static void cadastroRevista(Scanner scanner) {
        System.out.println("\n=======Cadastro Revista=======");
        RevistaCientifica revistaCientifica= null;
        System.out.println("Titulo Revista: ");
        String tituloRevista = scanner.nextLine();
        
        System.out.println("ISSN: ");
        String issn = scanner.nextLine(); 
        
        System.out.println("Periodicidade: ");
        String periodicidade = scanner.nextLine();
        
        revistaCientifica = new RevistaCientifica(tituloRevista,issn,periodicidade) {};
        RevistaControll revistaControll = new RevistaControll();
        revistaControll.cadastrarRevista(revistaCientifica);
        System.out.println("Revista cadastrada com sucesso!");    
    }
      
    private static void cadastroEdicao(Scanner scanner) {
        System.out.println("\n=======Cadastro Edicao=======");
        Edicao edicao= null;
        System.out.println("Numero da edicao: ");
        int numeroEdicao = Integer.parseInt(scanner.nextLine());

        
        System.out.println("Volume da edicao: ");
        int volumeEdicao = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Data da edicao: ");
        String dataEdicao = scanner.nextLine();

        edicao = new Edicao(numeroEdicao,volumeEdicao,dataEdicao) {};
        EdicaoControll edicaoControll = new EdicaoControll();
        edicaoControll.cadastrarEdicao(edicao);
        System.out.println("Edicao cadastrada com sucesso!");
    }  
      
    private static void cadastroArtigo(Scanner scanner) {
        System.out.println("\n=======Cadastro Artigo======");
        Artigo artigo= null;
        System.out.println("Nome Autor: ");
        String nomeAutor = scanner.nextLine();
        
        System.out.println("Titulo do Artigo: ");
        String tituloArtigo = scanner.nextLine(); 
        
        artigo = new Artigo(nomeAutor,tituloArtigo) {};
        ArtigoControll artigoControll = new ArtigoControll();
        artigoControll.cadastrarArtigo(artigo);
        System.out.println("Revista cadastrada com sucesso!");    
       
        System.out.println("Artigo cadastrada com sucesso!");
    }  
    
    private static void listarRevistas(){
            System.out.println("\n=====Revistas cadastrados=====");

            RevistaControll revistaControll = new RevistaControll();        
            List<RevistaCientifica> revistasCientificas = revistaControll.buscarTodosRevistas();
            Collections.sort(revistasCientificas);
        
            for(RevistaCientifica revistaCientifica : revistasCientificas){
                System.out.println("\nTitulo: "+revistaCientifica.getTituloRevista()+"\n====================================");
            }
    }
    private static void listarEdicoes(){
            System.out.println("\n=====Edicoes cadastrados=====");

            EdicaoControll edicaoControll = new EdicaoControll();        
            List<Edicao> edicoes = edicaoControll.buscarTodosEdicoes();
            Collections.sort(edicoes);
        
            for(Edicao edicao : edicoes){
                System.out.println("\nData Edicao: "+edicao.getDataEdicao()+"\n====================================");
            }
    }
    private static void listarArtigos(){
            System.out.println("\n=====Artigos cadastrados=====");

            ArtigoControll artigoControll = new ArtigoControll();        
            List<Artigo> artigos = artigoControll.buscarTodosArtigos();
            Collections.sort(artigos);
        
            for(Artigo artigo : artigos){
                System.out.println("\nTítulo Artigo: "+artigo.getTituloArtigo()+"\n====================================");
            }
    }  
}
