//Classe
public class Fatura {
  //Campos da classe
  private int id;
  private int quantidade;
  private String descricao;
  private float preco;
  private float valor;

  //Setter
  public void setId(int id) {
    this.id = id;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public void setPreco(float preco) {
    this.preco = preco;
  }

  //Construtor
  public Fatura(int id, String descricao, int quantidade, float preco) {
    this.id = id;
    this.descricao = descricao;
    this.quantidade = quantidade;
    this.preco = preco;
  }

//Chamar função
  public void chamar_calcular_valor_fatura() {
    calcular_valor_fatura(quantidade, preco);
  }

  //Função
  private void calcular_valor_fatura(int quantidade, float preco) {
    if (quantidade < 0) {
      quantidade = 0;
    }
    if (preco < 0) {
      preco = 0;
    }
    valor = quantidade * preco;
  }

  //Getter
  public int getId() {
    return this.id;
  }
  public int getQuantidade() {
    return this.quantidade;
  }
  public String getDescricao() {
    return this.descricao;
  }
  public float getPreco() {
    return this.preco;
  }
  public float getValor() {
    return this.valor;
  }

}