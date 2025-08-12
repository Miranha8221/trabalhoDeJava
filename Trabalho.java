import java.util.Scanner;

public class Trabalho {

  public static void letraPorLetra(String texto){
    char[] letras = texto.toCharArray();
    for(int i = 0; i < letras.length; i++){
      System.out.print(letras[i]);
      delay(500);
    }
  }

  public static void pauseComEnter() {
        Scanner scanner = new Scanner(System.in);
        delay(1500);
        System.out.println("\n\n=================================\nPressione ENTER para continuar...\n=================================\n");
        scanner.nextLine();
    }
   public static void delay(int milissegundos){
       
          
      try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
   } 

    public class main {
static void lutaGuerreiro(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("""
  --O Oponente Se Prepara para Atacar--
  
  |1-Atacar|2-Defender|3-Fugir|
  """);
  
  int acao = scanner.nextInt();
  switch (classe) {
    case 1:
      if (acao == 1) {
        System.out.println("""
        Ele te ataca e você ataca de volta...
        Ambos se acertam e caem mortos.""");
      }
      else if (acao == 2) {
        System.out.println("""
        Você defende o golpe e contra-ataca...
        O oponente cai morto após seu golpe.""");
      }
      else {
        System.out.println("""
        Você tenta fugir, mas ele te apunhala pelas costas...
        Você cai morto. Parabéns, covarde!
        """);
      }

      break;

    case 2:
      if (acao == 1) {
        System.out.println("""
        Ele te ataca e você conjura um feitiço...
        Como conjurar um feitiço demora, ele te acerta.
        Você cai morto.""");
      }
      else if (acao == 2) {
        System.out.println("""
        Você conjura uma barreira que empurra o oponente...
        Enquanto ele está desnorteado, você conjura uma bola de fogo...
        O oponente explode e seus restos queimam.""");
      }
      else {
        System.out.println("""
        Você tenta fugir, mas ele te apunhala pelas costas...
        Você cai morto. Parabéns, covarde!
        """);

        break;

      }      

    
    case 3:
      if (acao == 1) {
        System.out.println("""
        Ele te ataca, mas acerta a armadura. Você fica intocado...
        Você contra-ataca e o oponente cai morto.""");
      }
      else if (acao == 2) {
        System.out.println("""
        Você puxa seu escudo, mas ele é pesado...
        Isso cria uma brecha em sua defesa e o oponente aproveita...
        Ele te acerta um golpe crítico e você morre.""");
      }
      else {
        System.out.println("""
        Você tenta fugir, mas ele te apunhala pelas costas...
        Você cai morto. Parabéns, covarde!
        """);
      }
    
      break;
      
    default:
      break;
  }
  
}
    }

    static void lutaMago(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("""
  --O Oponente Conjura um Feitiço--
  
  |1-Atacar|2-Defender|3-Fugir|
  """);
  
  int acao = scanner.nextInt();
  switch (classe) {
    case 1:
      if (acao == 1) {
        System.out.println("""
        Você ataca antes que ele termine o encantamento...
        O oponente cai morto.""");
      }
      else if (acao == 2) {
        System.out.println("""
        Você tenta defender o feitiço...
        A magia atravessa seu escudo fraco...
        A bola de fogo te queima até a morte...""");
      }
      else {
        System.out.println("""
        Você tenta fugir, mas o oponente conjura um feitiço...
        com magia ele te faz tropeçar e você cai de cara numa pedra...
        Você morre. Parabéns, covarde!
        """);
      }

      break;

    case 2:
      if (acao == 1) {
        System.out.println("""
        ambos conjuram bola de fogo...
        as bolas de fogo colidem e fazem uma grande explosão...
        ambos morrem queimados...""");
      }
      else if (acao == 2) {
        System.out.println("""
        Você conjura uma barreira que deflete o feitiço do oponente...
        o feitiço o mata...""");
      }
      else {
        System.out.println("""
         Você tenta fugir, mas o oponente conjura um feitiço...
        com magia ele te faz tropeçar e você cai de cara numa pedra...
        Você morre. Parabéns, covarde!
        """);

        break;

      }      

    
    case 3:
      if (acao == 1) {
        System.out.println("""
        O oponente conjura um feitiço e você tenta atacar...
        ele atravessa sua armadura que é fraca contra magia...
        você cai morto...""");
      }
      else if (acao == 2) {
        System.out.println("""
        Você puxa seu escudo que é forte contra magias...
        antes que o oponente conjurasse outro feitiço você contra-ataca...
        o oponente cai morto...""");
      }
      else {
        System.out.println("""
        Você tenta fugir, mas o oponente conjura um feitiço...
        com magia ele te faz tropeçar e você cai de cara numa pedra...
        Você morre. Parabéns, covarde!
        """);
      }
    
      break;
  
    default:
      break;

      
  }
  
}
    
static void lutaPaladino(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("""
  --O Oponente levanta o escudo--
  
  |1-Atacar|2-Defender|3-Fugir|
  """);
  
  int acao = scanner.nextInt();
  switch (classe) {
    case 1:
      if (acao == 1) {
        System.out.println("""
        você tenta atacar, mas sua espada quebra...
        seu crânio se parte em mil pedaços pela maça de seu oponente...""");
      }
      else if (acao == 2) {
        System.out.println("""
        você desvia dos golpes até cansar seu oponente...
        isso cria uma brecha que você usa para um ataque crítico...
        seu oponente cai morto...""");
      }
      else {
        System.out.println("""
        você tenta fugir...
        seu oponente com toda sua benevolênica o ajuda...
        ele te arremessa para o alto e a queda te mata...
        """);
      }

      break;

    case 2:
      if (acao == 1) {
        System.out.println("""
        você conjura uma bola de fogo...
        ela atravessa a armadura e cozinha o seu oponente...""");
      }
      else if (acao == 2) {
        System.out.println("""
        você conjura uma barreira de defesa...
        seu oponente esmaga a barreira com você dentro...
           """);
      }
      else {
        System.out.println("""
         você tenta fugir...
        seu oponente com toda sua benevolênica o ajuda...
        ele te arremessa para o alto e a queda te mata...
        """);

        break;

      }      

    
    case 3:
      if (acao == 1) {
        System.out.println("""
        ambos tentam acertar acertar acabeça do adversário...
        ambos acertam e esmagam seus crânios...
           """);
      }
      else if (acao == 2) {
        System.out.println("""
        você defende o golpe com seu escudo...
        o ataque de seu oponente deixou uma brecha...
        você aproveita e acerta sua cabeça, matando-o... 
           
           """);
      }
      else {
        System.out.println("""
        Você tenta fugir, mas com o peso de sua armadura
        você não resiste a fatiga e cai no chão,
        sua cara acerta uma pedra e você morre,
        parabéns covarde!
        """);
      }
    
      break;
  
    default:
      break;

      
  }
  
}
    public static void main(String[] args) {

    


    System.out.println("Boas vindas, aventureiro! Me diga, qual o seu nome?");
    System.out.println();
    Scanner s = new Scanner(System.in);
    String nome = s.nextLine();
    System.out.println("\nMe diga, aventureiro " + nome + ", qual a sua classe?");
    System.out.println();

    
    boolean voltar = false;
    int classe = 0;

    while (voltar == false) {
      System.out.println("""
      \n1-Guerreiro
      2-Mago
      3-Paladino
      4-Como Escolher?\n""");
      classe = s.nextInt();  
      
      switch (classe) {
      case 1:
        System.out.println("\nCerto! A partir de agora, você será um Guerreiro!");
        voltar = true;
        break;

      case 2:
        System.out.println("\nPois bem, agora você é um Mago!");
        voltar = true;
        break;

      case 3:
        System.out.println("\nÓtimo! De agora em diante, você é um Paladino!");
        voltar = true;
        break;
    
      default:
        System.out.println("""
        \nÉ muito simples:
        Guerreiros possuem grande força, mas pouca resistência.
        Magos, assim como guerreiros, têm pouca resistência física, mas possuem grande poder mágico.
        Paladinos, por outro lado, têm força e resistência física, mas são lentos e fracos contra magias.
        
        4-Voltar
        
        """);
        classe = s.nextInt();
        break;

      } 
      System.out.println();    
    }

    delay(1500);

    System.out.println("""
      ░██████     ░███    ░█████████  ░██████░██████████░██     ░██ ░██           ░██████        ░██   
    ░██    ░██   ░██░██   ░██     ░██   ░██      ░██    ░██     ░██ ░██          ░██   ░██     ░████   
    ░██         ░██  ░██  ░██     ░██   ░██      ░██    ░██     ░██ ░██         ░██     ░██      ░██   
    ░██        ░█████████ ░█████████    ░██      ░██    ░██     ░██ ░██         ░██     ░██      ░██   
    ░██        ░██    ░██ ░██           ░██      ░██    ░██     ░██ ░██         ░██     ░██      ░██   
    ░██    ░██ ░██    ░██ ░██           ░██      ░██     ░██   ░██  ░██          ░██   ░██       ░██   
      ░██████  ░██    ░██ ░██         ░██████    ░██      ░██████   ░██████████   ░██████      ░██████ 
                                                                                    """);

    delay(1500);
    
    System.out.println("Está tarde... Você está voltando de uma festa na taverna em comemoração a mais uma missão cumprida na guilda.");
    
    pauseComEnter();
    
    System.out.println("""
    Há uma leve névoa na cidade, e sua visão está levemente turva devido ao álcool...
    Você consegue escutar vozes de pessoas conversando ao longe, mas apesar disso, está tudo silencioso...
    Silêncioso demais... """);
    
    pauseComEnter();
    
    System.out.println("Você continua caminhando, até que, em meio à nevoa, você avista uma figura...\nUm homem. Ele estava parado, apenas... Te encarando?");

    pauseComEnter();

    System.out.println(nome + " - Olá?\n");
    delay(1500);
    System.out.print("Ele não responde...");

    pauseComEnter();

    System.out.println("Você dá um passo para frente...\n");
    delay(1500);
    System.out.print("Ele dá um passo para trás...");

    pauseComEnter();

    System.out.println("""
    Você acelera o passo e chega perto o suficiente para ver seu rosto...
    Há algo de errado com ele. Há escamas na metade direita. Os olhos estão vermelhos e secos...
    E acima de tudo, suas roupas e boca estavam manchadas de sangue fresco...""");

    pauseComEnter();

    System.out.println("A coisa então dá um passo adiante, te encarando fixamente com olhos arregalados...\n");
    delay(4000);
    System.out.println("Homem Estranho - Por favor... Me ajude...\n");
    delay(4000);
    System.out.println("""
    Enquanto dizia isso, ele ergue seus braços em sua direção.
    De seus dedos, garras se aproximam cada vez mais de você.
    """);
    delay(4000);
    System.out.println("Você de repente sente uma intenção assassina.\n");
    delay(4000);
    System.out.print("""
    -FAÇA UMA ESCOLHA-
    
    1-Ajudá-lo
    2-""");

    letraPorLetra("MATÁ-LO");

    String escolha1 = s.nextLine();

   

    if (escolha1 == "1"){
   
      System.out.println("""
      Você decide se aproximar do homem perturbado, 
      ele começa a se desfigurar em algo grotesco e pútrido.
      Você não tem outra escolha a não ser lutar contra ele...
      Apesar de ser um monstro, não aprece MUITO forte,
      ainda assim, ele está além do que você é capaz de lidar sozinho,
      principalmente bêbado do jeito que está.
          """);
          
      pauseComEnter();

      System.out.println("""
      Ele te ataca e você rápidamente se esquiva.
      Antes que você pudesse tentar contra-atacar,
      um homem encapuzado aparece e corta a cabeça da criatura
      """);

     pauseComEnter();
     
     System.out.println("""
     Você rápidamente se vira para ele em postura defensiva,
     mas ele rapidamente tira o capuz e se apresenta.
     Escanour - Acalme-se. Sou apenas eu!
     Disse o Mestre da Guilda, Escanour.
     Esse grande homem bigodudo é ninguém mais
     que o Mestre da Guilda e aventureiro mais forte.
     """);

     pauseComEnter();

     System.out.println("""
     Após uma breve conversa, você volta para casa.
     Estranhamente, você demora a dormir,
     mesmo sob os efeitos do álcool.

     Após algumas horas, você finalmente adormece...
     """);

     

    }else if (escolha1 == "2") {
      
    }{
      System.out.println("""
       você escolhe assasinar o homem perturbado na calada da noite,
       você olha para trás e só vê que alguém te viu cometendo o crime. 
       No próximo dia você passa pelas ruas e tudo que ouve é as pessoas murmurando
       sobre você ser um assasino sem coração, mas ninguém aparenta ter certeza de que os 
       eventos de ontem realmente aconteceram.""");
    }
    pauseComEnter();
    
    System.out.println("""
    .d8888b.                    d8b 888             888                .d8888b.  
  d88P  Y88b                   Y8P 888             888               d88P  Y88b 
  888    888                       888             888                      888 
  888         8888b.  88888b.  888 888888 888  888 888  .d88b.            .d88P 
  888            "88b 888 "88b 888 888    888  888 888 d88""88b       .od888P"  
  888    888 .d888888 888  888 888 888    888  888 888 888  888      d88P"      
  Y88b  d88P 888  888 888 d88P 888 Y88b.  Y88b 888 888 Y88..88P      888"       
  "Y8888P"  "Y888888 88888P"  888  "Y888  "Y88888 888  "Y88P"       888888888  
                      888                                                       
                      888                                                       
                      888                                                       
          
          """);

    pauseComEnter();

    if (escolha1 == "1") {
      System.out.println("""
        Você reúne todos os aventureiros da ciddade para contar o que viu na noite passada,
        eles não ficam tão chocados como você esperava. Todos dizem que estão vendo coisas parecidas
        pela cidade e que estavam se preparando para ir atrás da origem dessa magia negra atormentando
        a cidade. Você prepara seus pertences e sai numa jornada com outros aventureiros para ir atrás 
        do responsável por tamanha blasfêmia.
          """);
    }else if (escolha1 == "2") {
      System.out.println("");
    }
    pauseComEnter();

    System.out.println("""
     Você encontra um acampamento militar com as tropas de mortos-vivos cercando um castelo sombrio.
     seu grupo de aventureiros começa a combater as tropas malignas, você se encontra com o general
     um mago que está usando necromancia para manter os mortos de pé, incluindo ele. Você se prepara
     para o combate.
      
       """);

    pauseComEnter();
      
    //insira combate aqui

    pauseComEnter();
    
    System.out.println();

    System.out.println("""
 ██████  █████  ██████  ██ ████████ ██    ██ ██       ██████      ██████  
██      ██   ██ ██   ██ ██    ██    ██    ██ ██      ██    ██          ██ 
██      ███████ ██████  ██    ██    ██    ██ ██      ██    ██      █████  
██      ██   ██ ██      ██    ██    ██    ██ ██      ██    ██          ██ 
 ██████ ██   ██ ██      ██    ██     ██████  ███████  ██████      ██████  
                                                                          
                                                                          
        """);
    
    pauseComEnter();

    System.out.println("""
      Você entra no castelo sombrio e navega pelos corredores escuros, 
      procurando aquele que começou tudo. Você encontra a sala do trono e ele está te esperando,
      a arma dele é uma espada que tem um brilho vermelho e misterioso.
          """);

    pauseComEnter();

    //insira combate aqui

    pauseComEnter();

    
  }
}
