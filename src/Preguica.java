public class Preguica extends Animal {
    public Preguica() {
    }

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "'Não faço ideia de que barulho seja!'";
    }
}
