public class Cavalo extends Animal{
    public Cavalo() {
    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "iiirrrrí!";
    }
}
