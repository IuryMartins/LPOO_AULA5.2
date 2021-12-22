public class TestaAnimais {

    Animal[] animais;
    int index;

    public TestaAnimais() {
        this.animais = new Animal[10];
        index = 0;
    }

    public Animal[] get() {
        return animais;
    } // end getter

    public boolean adicionarAnimal(Animal animal){
        if(index < 10){
            animais[index] = animal;
            index++;
            return true;
        }
        return false;
    }

    public String listar(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < index; i++) {
            str.append("").append(animais[i].nome).append(" faz ").append(animais[i].emitirSom()).append("\n");
        }
        return str.toString();
    }
}

