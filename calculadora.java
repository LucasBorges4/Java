public class calculadora {
    public static void main(String[] args) {
        int num_a = 4, num_b = 3;
        Soma soma = new Soma(num_a, num_b);
        Subtracao subtracao = new Subtracao(num_a, num_b);
        Multiplicacao multiplicacao = new Multiplicacao(num_a, num_b);
        Divisao divisao = new Divisao(num_a, num_b);

        System.out.println(soma + " = " + soma.calcular());
        System.out.println(subtracao + " = " + subtracao.calcular());
        System.out.println(multiplicacao + " = " + multiplicacao.calcular());
        System.out.println(divisao + " = " + divisao.calcular());

    }

    abstract static class Calculadora{
        protected double num_a;
        protected double num_b;
        protected String operacao;

        public Calculadora(int num_a, int num_b, String operacao){
            this.num_a = num_a;
            this.num_b = num_b;
            this.operacao = operacao;
        }

        public Calculadora(double num_a, double num_b, String operacao){
            this.num_a = num_a;
            this.num_b = num_b;
            this.operacao = operacao;
        }

    //Método abstrato a ser declarado pelas sub classes
        public abstract double calcular();

        @Override
        public String toString() {
            return num_a + " " + operacao + " " + num_b;
        }
    }

    static public class Soma extends Calculadora {
        public Soma(int num_a, int num_b) {
            super(num_a, num_b, "+");
        }

        @Override
        public double calcular() {
            return num_a + num_b;
        }

    }
    static public class Subtracao extends Calculadora {
        public Subtracao(int num_a, int num_b) {
            super(num_a, num_b, "-");
        }

        @Override
        public double calcular() {
            return num_a - num_b;
        }

    }

    static public class Multiplicacao extends Calculadora {
        public Multiplicacao(int num_a, int num_b) {
            super(num_a, num_b, "*");
        }

        @Override
        public double calcular() {
            return num_a * num_b;
        }

    }

    static public class Divisao extends Calculadora {
        public Divisao(double num_a, double num_b) {
            super(num_a, num_b, "/");
        }

        @Override
        public double calcular() {
            return num_a / num_b;
        }

    }

}
