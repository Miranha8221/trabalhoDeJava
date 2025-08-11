import java.util.Scanner;import java.util.Scanner;

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

    public class Main {
static void Combate1(){

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
      você decide se aproximar do homem perturbado, 
      ele começa a se desfigurar em algo grotesco e pútrido.
      Você não tem outra escolha a não ser lutar com ele...boa sorte
          """);

     

    }else if (escolha1 == "2") {
      
    }{
      System.out.println("""
       você escolhe assasinar um homem perturbado na calada da noite,
       você olha para trás e só vê que alguém te viu cometendo o crime. 
       No próximo dia você passa pelas ruas e tudo que ouve é as pessoas murmurando
       sobre você ser um assasino sem coração, mas ninguém aparenta ter certeza de que os 
       eventos de ontem realmente aconteceram.""");
    }
    
     
  }
}

