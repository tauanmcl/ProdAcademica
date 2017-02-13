package javaapplication3;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList <Colaborador> listaColab = new ArrayList<>();
        ArrayList <Projeto> listaProj = new ArrayList<>();
        ArrayList <Publicacao> listaPubli = new ArrayList <>();
        
        
        boolean continuar = true;
        
        System.out.println("Bem-vindo ao Sistema de Produtividade.\n");
        
        while (continuar){       
            System.out.println("\n---------- TELA INICIAL ----------");
            
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
                    addColab(listaColab);
                    break;
                case 2:
                    listaProj.add(novoProjeto(listaProj));
                    break;
                case 3:
                    editProj(listaColab, listaProj);
                    break;
                case 4:
                    publicar (listaColab, listaProj, listaPubli);
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                     
                    break;  
                case 100:
                    for (int i=0;i < listaColab.size(); i++) {
                        System.out.println(listaColab.get(i).getNome());
                    }
                    for (int i=0;i < listaProj.size(); i++) {
                        System.out.println(listaProj.get(i).getTitulo());
                    }
                    break;    
            }
        }
    }
    public static void addColab (ArrayList <Colaborador> listaColab){
        Scanner input = new Scanner(System.in);
        
        Colaborador colab = new Colaborador();
        
        int novoID = -1;
        
        System.out.println("\nInforme o nome do funcionário:");
        String nome = input.nextLine();
        
        System.out.println("\nInforme o endereço de e-mail do funcionário:");
        String email = input.nextLine();
        
        colab.setIdColab(listaColab.size() + 1);
        
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
                Aluno aux1 = new Aluno();
                aux1.setTipoAluno (input.nextInt());
                aux1.setNome(nome);
                aux1.setEmail (email);
                novoID = colab.getIdColab() + 1000;
                aux1.setIdColab(novoID);
                listaColab.add(aux1);
                break;
            case 2:
                Professor aux2 = new Professor();
                aux2.setNome(nome);
                aux2.setEmail (email);
                novoID = colab.getIdColab() + 2000;
                aux2.setIdColab(novoID);
                listaColab.add(aux2);
                break;
            case 3:
                Pesquisador aux3 = new Pesquisador();
                aux3.setNome(nome);
                aux3.setEmail (email);
                novoID = colab.getIdColab() + 3000;
                aux3.setIdColab(novoID);
                listaColab.add(aux3);
                break;
        }
        System.out.println("Colaborador criado com sucesso. O ID dele é: " + novoID + "\n");
    }
    public static Projeto novoProjeto (ArrayList <Projeto> listaProj){
        Scanner input = new Scanner(System.in);

        Projeto proj = new Projeto();

        System.out.println("\nInforme o título do projeto:");
        proj.setTitulo(input.nextLine());

        /*
        System.out.print("Informe o data de início do projeto:");
        System.out.print("Informe o dia:");
        proj.setInicioDia(input.nextInt());
        System.out.print("Informe o mês:");
        proj.setInicioMes (input.nextInt());
        System.out.print("Informe o ano:");
        proj.setInicioAno (input.nextInt());
        */
        
        System.out.println("\nInforme a agência financiadora do projeto:");
        proj.setFinanciador(input.nextLine());

        System.out.println("\nInforme o valor do financiamento:");
        proj.setValorFinanciamento(input.nextInt());
        input.nextLine();
        System.out.println("\nDescreva o objetivo do projeto e sua descrcição:");
        System.out.println("Objetivo:");
        proj.setObjetivo(input.nextLine());
        System.out.println("\nDescrição:");
        proj.setDescricao(input.nextLine());
        
        System.out.println("\nProjeto criado com sucesso!\nO ID do projeto é: " + (listaProj.size() + 101) + "\nPara adicionar participantes vá na opção \"Alterar projeto\"\n\n");
        
        proj.setIdProj(listaProj.size() + 101);
        
        return proj;
    }
    public static void editProj(ArrayList <Colaborador> listaColab, ArrayList <Projeto> listaProj){
        Scanner input = new Scanner(System.in);
        boolean existeColab, existeProj = false;
        int iProj = 0;
        int iColab = 0;
        int idProjAux;
        int idColabAux;
        ArrayList <Projeto> proj;
        ArrayList <Colaborador> colab;
        do{
            System.out.println("\nInforme o ID do projeto que deseja realizar a alteração:");
            idProjAux = input.nextInt(); 
            for (int i = 0;i < listaProj.size(); i++) {
                if (listaProj.get(i).getIdProj() == idProjAux){
                    existeProj = true;
                    iProj = i;
                }
            }
            if (!existeProj)    System.out.println("\nEsse projeto não existe.");
        }while (!existeProj);
        System.out.println("1 - Adicionar participante do projeto.");
        System.out.println("2 - Alterar Status do projeto.");
        int decisao = input.nextInt();
        
        switch(decisao)
        {
            case 1:
                if (listaProj.get(iProj).getStatus() == 1){
                    boolean adicionar;

                    Aluno aluno;
                    do{
                        existeProj = false;
                        existeColab = false;
                        do{
                            System.out.println("\nInforme o ID do colaborador que deseja vincular ao projeto");
                            idColabAux = input.nextInt();
                            for (int i = 0;i < listaColab.size(); i++) {
                                if (listaColab.get(i).getIdColab() == idColabAux) {
                                    existeColab = true;
                                    iColab = i;
                                }
                            }
                            if (!existeColab)    System.out.println("\nEsse colaborador não existe.");

                        }while (!existeColab);  

                        colab = listaProj.get(iProj).getListaColaboradores();
                        //RECEBE O ARRAY DE PROJETOS VINCULADOS A ESSE COLABORADOR
                        for (int i = 0;i < colab.size(); i++) {
                            if (colab.get(i).getIdColab() == idColabAux) {
                                existeProj = true;
                            }
                        }
                        if (existeProj) System.out.println("\nEsse projeto ja está vinculado a esse colaborador.\n");

                        else{
                            proj = listaColab.get(iColab).getListaProjetos();
                            if (listaColab.get(iColab) instanceof Aluno){
                                //VERIFICA SE É DO TIPO ALUNO
                                aluno = (Aluno) listaColab.get(iColab);
                                //FAZ O CAST PARA PODER ACESSAR AS INFORMAÇÕES DA CLASSE ALUNO
                                if (aluno.getTipoAluno() == 1 && proj.size() >= 2){
                                    //SE O ALUNO FOR GRADUANDO VERIFICA SE ELE JA TEM 2 PROJETOS
                                    System.out.println("\nEste aluno não pode ser vinculado a mais projetos!\n");
                                }else{
                                    //SE NÃO FOR GRADUANDO OU NÃO TIVER MAIS 2 PROJETOS ELE VINCULA
                                    listaColab.get(iColab).setListaProjetos (listaProj.get(iProj));
                                    listaProj.get(iProj).setListaColaboradores(listaColab.get(iColab));
                                    System.out.println("\nColaborador vinculado com sucesso!\n");
                                }
                            }
                            else{
                                //SE NÃO FOR ALUNO EU VINCULA
                                listaColab.get(iColab).setListaProjetos (listaProj.get(iProj));
                                listaProj.get(iProj).setListaColaboradores(listaColab.get(iColab));
                                System.out.println("\nColaborador vinculado com sucesso!\n");
                            }
                        }
                        System.out.println("\nDeseja vincular outro colaborador? (True/False)\n");
                        adicionar = input.nextBoolean();
                        //DEPENDENDO DA RESPOSTA BOOLEANA ELE SAI DO WHILE
                    }while(adicionar);
                }else{
                    System.out.println("\nO projeto já não mais se encontra no status \"Em elaboração\"\n");
                }
                break;
            case 2:
                if (listaProj.get(iProj).getStatus() == 1){
                    boolean existeProf = false;
                    colab = listaProj.get(iProj).getListaColaboradores();
                    for (int i = 0;i < colab.size(); i++) {
                        if (colab.get(i) instanceof Professor)  existeProf = true;
                    }
                    if (!existeProf)    System.out.println("\nPrecisa haver ao menos um professor vinculado ao projeto para que ele avance o status");
                    else if(colab.size()>0){
                        listaProj.get(iProj).setStatus(2);
                        System.out.println("\nInforme a data que o projeto está entrando em andamento:");
                        System.out.print("Dia: ");
                        int x = input.nextInt();
                        System.out.print("\nMês: ");
                        int y = input.nextInt();
                        System.out.print("\nAno: ");
                        int z = input.nextInt();
                        listaProj.get(iProj).setInicioDia(x);
                        listaProj.get(iProj).setInicioMes(y);
                        listaProj.get(iProj).setInicioAno(z);
                        System.out.println("\nO projeto entrou no status \"Em Andamento\"!\n");
                    }
                }
                else if (listaProj.get(iProj).getStatus() == 2){
                    ArrayList <Publicacao> publi = new ArrayList <>();
                    publi = listaProj.get(iProj).getListaPublicacoes();
                    if (publi.isEmpty()){
                        System.out.println("\nO projeto precisa ter publicações vinculadas a ele para passar para o status Concluído\n");
                    }else{
                        listaProj.get(iProj).setStatus(3);
                        System.out.println("\nInforme a data que o projeto está sendo concluído:");
                        System.out.print("Dia: ");
                        int x = input.nextInt();
                        System.out.print("\nMês: ");
                        int y = input.nextInt();
                        System.out.print("\nAno: ");
                        int z = input.nextInt();
                        listaProj.get(iProj).setInicioDia(x);
                        listaProj.get(iProj).setInicioMes(y);
                        listaProj.get(iProj).setInicioAno(z);
                        System.out.println("\nO projeto entrou no status \"Concluído\"!\n");
                    }
                }
                //RECEBE O ARRAYLIST DE COLABORADORES VINCULADOS A ESSE PROJETO
                break;
        }
    }
    public static void publicar (ArrayList <Colaborador> listaColab, ArrayList <Projeto> listaProj, ArrayList <Publicacao> listaPubli){
        Scanner input = new Scanner(System.in);
        System.out.println("\nInforme o título da publicação:");
        String titulo = input.nextLine();
        System.out.println("\nInforme a conferência onde foi publicada:");
        String conf = input.nextLine();
        System.out.println("\nInforme o ano de publicação:");
        int ano = input.nextInt();
        //PEGANDO VARIÁVEIS PARA INSERIR NO ARRAY DE PUBLICAÇÕES
        boolean continuar = false, existe;
        //VARIÁVEIS AUXILIARES
        int idColabAux, iColab = -1, iPubli = -1, idProjAux, iProj = 0;
        //POSIÇÕES NOS ARRAYS
        Publicacao publi = new Publicacao();
        publi.setAnoDePublicacao(ano);
        publi.setTitulo(titulo);
        publi.setConfOndeFoiPublicada(conf);
        listaPubli.add(publi);
        //ATRIBUINDO INFORMAÇÕES AO OBJETO E ADICIONANDO-O AO ARRAY
        
        for (int i = 0; i<listaPubli.size(); i++)   if (listaPubli.get(i).getTitulo().equals(titulo))    iPubli = i;
        //PEGANDO A POSIÇÃO DO ARRAY ONDE ESTÁ A PUBLICAÇÃO
        
        ArrayList <Colaborador> colab = new ArrayList<>();
        
        do{
            existe = false;
            do{
                System.out.print("\nInforme o ID do Colaborador que participou da publicação: ");
                idColabAux = input.nextInt();
                for (int i = 0; i <listaColab.size(); i++) {
                    if (listaColab.get(i).getIdColab() == idColabAux){
                        existe = true;
                        iColab = i;
                    }
                }
                if (!existe) System.out.println("\nEste ID é inválido\n");
            }while(!existe);
            //PEGANDO O ID E VERIFICANDO SE É VÁLIDO
            
            colab = listaPubli.get(iPubli).getListaColaboradores();
            //RECEBENDO O ARRAY DE COLABORADORES QUE ESTÁ VINCULADO A PUBLICAÇÃO
            
            existe = false;
            for (int i = 0; i < colab.size(); i++)  if (colab.get(i).getIdColab() == idColabAux)    existe = true;
            //VERIFICANDO SE O COLABORADOR JÁ NÃO ESTÁ VINCULADO A PUBLICAÇÃO
            
            if (existe) System.out.println("\nEsse colaborador já está vinculado a publicação!\n");
            else{
                listaPubli.get(iPubli).setListaColaboradores (listaColab.get(iColab));
                listaColab.get(iColab).setListaPublicacoes(listaPubli.get(iPubli));
                System.out.println("\nO colaborador foi vinculado a publicação!\n");
            }
            
            System.out.print("\nDeseja vincular outro colaborador a publicação? (True/False)");
            continuar = input.nextBoolean();
        }while(continuar);
        System.out.print("\nDeseja vincular a publicaçãoa algum projeto? (True/False)");
        continuar = input.nextBoolean();
        if (continuar){
            existe = false;
            do{
                System.out.print("\nInforme o ID do Projeto que deseja vinuclar a publicação: ");
                idProjAux = input.nextInt();
                for (int i = 0; i <listaProj.size(); i++) {
                    if (listaProj.get(i).getIdProj() == idProjAux){
                        existe = true;
                        iProj = i;
                    }
                }
                if (!existe) System.out.println("\nEste ID é inválido\n");
            }while(!existe);
            listaPubli.get(iPubli).setListaProjetos (listaProj.get(iProj));
            listaProj.get(iProj).setListaPublicacoes (listaPubli.get(iPubli));
        }
        System.out.print("\nPublicação realizada com sucesso!\n");
    }
}
