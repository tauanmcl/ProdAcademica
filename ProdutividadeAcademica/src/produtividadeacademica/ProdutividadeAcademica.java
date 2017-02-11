
package produtividadeacademica;

import java.util.ArrayList;
import java.util.Scanner;
/**
adicionar colaborador
abrir um projeto
editar projeto de pesquisa
publicar
orientar
consultar
relatorio
 */
public class ProdutividadeAcademica {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList <Colaborador> listaColab = new ArrayList<Colaborador>();
        ArrayList <Projeto> listaProj = new ArrayList<Projeto>();
        
        boolean continuar = true;
        
        System.out.println("Bem-vindo ao Sistema de Produtividade.\n");
        /*System.out.println("Informe o dia da semana:");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sábado");
        int diaSemana = input.nextInt();
        System.out.print("Informe o dia do mês:");
        int dataDia = input.nextInt();
        System.out.print("Informe o mês:");
        int dataMes = input.nextInt();
        System.out.print("Informe o ano:");
        int dataAno = input.nextInt();
        */
        while (continuar){       
            System.out.println("\n---------- TELA INICIAL ----------");
            /*System.out.print("Data: " + dataDia + "/" + dataMes + "/" + dataAno + "\nDia da semana: ");
            switch (diaSemana)
            {
                case 1: 
                    System.out.println("Domingo");
                    break;
                case 2: 
                    System.out.println("Segunda");
                    break;
                case 3: 
                    System.out.println("Terça");
                    break;
                case 4: 
                    System.out.println("Quarta");
                    break;
                case 5: 
                    System.out.println("Quinta");
                    break;
                case 6: 
                    System.out.println("Sexta");
                    break;
                case 7: 
                    System.out.println("Sábado");
                    break;
            }
            */
            System.out.println("\nSelecione uma das ações a seguir:");
            System.out.println("1 - Adicionar Colaborador.");
            System.out.println("2 - Abrir um Projeto de Pesquisa.");
            System.out.println("3 - Editar Projeto de Pesquisa.");
            System.out.println("4 - Reaizar uma Publicação.");
            System.out.println("5 - Vincular um Orientando.");
            System.out.println("6 - Consultar.");
            System.out.println("7 - Relatório.");
            System.out.println("\n00 - Encerrar Programa.\n\n");

            int opcao = input.nextInt();

            switch (opcao){
                case 0:
                    continuar = false;
                    break;
                case 1:
                    listaColab.add(addColab ())  ;
                    break;
                case 2:
                    novoProjeto ();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                     
                    break;   
            }
        }
    }
    public static Colaborador addColab (){
        Scanner input = new Scanner(System.in);
        
        Colaborador colab = new Colaborador();
        
        System.out.println("\nInforme o nome do funcionário:");
        String nome = input.nextLine();
        
        System.out.println("\nInforme o endereço de e-mail do funcionário:");
        String email = input.nextLine();
        
        System.out.println("\nQual o tipo do colaborador?");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        System.out.println("3 - Pesquisador");
        int tipoColab = input.nextInt();
        
        switch (tipoColab)
        {
            case 1:
                System.out.println("\nQual o tipo do Aluno?");
                System.out.println("1 - Graduando");
                System.out.println("2 - Mestrando");
                System.out.println("3 - Doutorando");
                int tipoAluno = input.nextInt();
                Aluno aux1 = new Aluno();
                aux1.setNome(nome);
                aux1.setEmail (email);
                aux1.setTipoAluno (tipoAluno);
                colab = aux1;
                break;
            case 2:
                Professor aux2 = new Professor();
                aux2.setNome(nome);
                aux2.setEmail (email);
                colab = aux2;
                break;
            case 3:
                Pesquisador aux3 = new Pesquisador();
                aux3.setNome(nome);
                aux3.setEmail (email);
                colab = aux3;
                break;
        }
        return colab;
    }
    public static Projeto novoProjeto (){
    Scanner input = new Scanner(System.in);
    
    Projeto proj = new Projeto();
    
    System.out.println("\nInforme o título do projeto:");
    proj.setTitulo(input.nextLine());
    
    System.out.print("Informe o data de início do projeto:");
    System.out.print("Informe o dia:");
    proj.setInicioDia(input.nextInt());
    System.out.print("Informe o mês:");
    proj.setInicioMes (input.nextInt());
    System.out.print("Informe o ano:");
    proj.setInicioAno (input.nextInt());
    
    System.out.println("\nInforme a agência financiadora do projeto:");
    proj.setFinanciador(input.nextLine());
    
    System.out.println("\nInforme o valor do financiamento:");
    proj.setValorFinanciamento(input.nextInt());
    
    System.out.println("\nDescreva o objetivo do projeto e sua descrcição:");
    System.out.println("Objetivo:");
    proj.setObjetivo(input.nextLine());
    System.out.println("\nDescrição:");
    proj.setDescricao(input.nextLine());
    
    return proj;
    }
    
}
