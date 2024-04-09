public class Jogador {
  public int idade, anosRestantes = 0;
  public float altura, peso = 0;
  public String nacionalidade, posicao, nome = "";


  
  public void dados() {
    int idadeAposentadoria;

    if (posicao.equals("defesa")) {
      idadeAposentadoria = 40;
      anosRestantes = idadeAposentadoria - idade;
      return;
    } else if (posicao.equals("meio-campo")) {
      idadeAposentadoria = 38;
      anosRestantes = idadeAposentadoria - idade;
      return;
    } else if (posicao.equals("atacante")) {
      idadeAposentadoria = 35;
      anosRestantes = idadeAposentadoria - idade;
      return;
    }
  }
}