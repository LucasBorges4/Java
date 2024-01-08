public class Exercicio2 {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Buddy");
        System.out.println(dog.nome);
    }

    abstract static class Animal{
        public String nome;
        public double peso;

        public Animal(String nome){
            this.nome = nome;
        }

        public Animal(String nome, double peso){
            this.nome = nome;
            this.peso = peso;
        }

        public String getNome() {
            return nome;
        }

        public double getPeso() {
            return peso;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

    }

    static public class Peixe extends Animal{
        public Peixe(String nome){
            super(nome);
        }

        public Peixe(String nome, double peso){
            super(nome, peso);
        }
    }

    static public class Cachorro extends Animal{
        public Cachorro(String nome){
            super(nome);
        }

        public Cachorro(String nome, double peso){
            super(nome, peso);
        }
    }

}
