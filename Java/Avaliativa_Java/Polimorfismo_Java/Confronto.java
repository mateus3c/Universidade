public class Confronto {

    public int executar(Dados.SuperHeroi superheroi, Dados.Vilao vilao) {
        int poderSuperHeroi = superheroi.getPoderTotal();
        int poderVilao = vilao.getPoderTotal();

        if (poderSuperHeroi > poderVilao) {
            return 1; // Super-herói ganha
        } else if (poderVilao > poderSuperHeroi) {
            return 2; // Vilão ganha
        } else {
            return 0; // Empate
        }
    }
}