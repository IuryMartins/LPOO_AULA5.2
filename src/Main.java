public class Main {

    public static void main(String[] args) {
        TestaAnimais animal = new TestaAnimais();
        for(int i = 0; i < 10; i++){
            Animal cachorro = new Cachorro();
            cachorro.setNome("CACHORRO");
            Animal cavalo = new Cavalo();
            cavalo.setNome("CAVALO");
            Animal preguica = new Preguica();
            preguica.setNome("PREGUIÇA");
            animal.adicionarAnimal(cachorro);
            animal.adicionarAnimal(cavalo);
            animal.adicionarAnimal(preguica);
        }
        System.out.println(animal.listar());
    }

}
