public class Cachorro extends Animal {
    public Cachorro() {
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public String emitirSom() {
        return "au au au!";
    }
}
