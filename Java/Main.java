public class Main {
    public static void main(String[] args) {
        /* // Questão 6
        Motor motor1 = new Motor("bom",1.6);
        Carro carro1 = new Carro("fiat","mobi",2024,motor1);
        carro1.info();


        Motor motor2 = new Motor("ruim",1.4);
        Carro carro2 = new Carro("VW","polo",2023,motor2);
        carro2.info();


        Motor motor3 = new Motor("mediano",2.0);
        Carro carro3 = new Carro("honda","civic",2021,motor3);
        carro3.info();
        */

        /*
        carro1.info();   // Questão 1
        carro2.info();
        carro3.info();

        carro1.acelerar(50);  // Questão 2
        carro1.mostrarVelocidade();
        carro1.frear(20);
        carro1.mostrarVelocidade();



        ContaBancaria conta1 = new ContaBancaria(100,"Joao"); // Questão 3

        conta1.depositar(30);
        conta1.mostrarSaldo();
        conta1.sacar(10);
        conta1.mostrarSaldo();
        */

        /*
        Cachorro dog = new Cachorro("Pug","FUFU",2); // Questão 4
        dog.Som();
        dog.mostrarInformacoes();

        Gato cat = new Gato("Siamês","Felix",1);
        cat.Som();
        cat.mostrarInformacoes();
        */

        /*
        Animal[] animais = new Animal[2]; // Questão 5

        animais[0] = new Cachorro("Pug","FUFU",2);
        animais[1] = new Gato("Siamês","Felix",1);

        for (Animal animal : animais) {
            animal.Som();
        }
        */

        /*
        Escola escola1 = new Escola("Geo","bancários");

        Professor prof1 = new Professor("João",25);
        prof1.setEscola(escola1);

        escola1.setProfessor(prof1);

        prof1.mostrarEscola();
        escola1.mostrarProfessor();
        */

        /*
        Empregado empregado1 = new Empregado("João","Técnico",16.500);
        Empregado empregado2 = new Empregado("José","Faxineiro",20.00);
        Empregado empregado3 = new Empregado("Maria","Gerente",16.500);


        Empresa empresa1 = new Empresa("Soft");

        empresa1.addEmpregado(empregado1);
        
        empresa1.apresentarEmpregados();
        */

        /*
        Interface_Texto relatorio = new Relatorio("Este é o relatório do contrato.");

        Interface_Texto contrato = new Contrato("Joao",45.500);

        relatorio.mostrarTexto();
        contrato.mostrarTexto();
        */


        /* Questão 11
        FuncionarioHorista funcionario1 = new FuncionarioHorista("Joao",250.50,7.5);

        funcionario1.calcularSalario();

        FuncionarioAssalariado assalariado = new FuncionarioAssalariado("José",1240);

        assalariado.calcularSalario();
        */

        /* Questão 10
        Calculadora calculadora = new Calculadora();
        calculadora.Somar(10,10);
        calculadora.Somar(10,10,20);
        */

        /* Questão 12
        Produto produto1 = new Produto("Boné", 30);
        Produto produto2 = new Produto("Tênis", 45.80);

        Produto produtoSoma = produto1.somar(produto2);
        System.out.println(produtoSoma);
        */

        /* Questão 13
        System.out.println(Fatorial.fatorial(3));
        */

        /* Questão 14
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();

        config1.mostrarConfiguracao();

        System.out.println(config1 == config2);
         */

        /* Questão 15
        ContaBancaria2 conta = new ContaBancaria2(1000.0);

        try {
            conta.sacar(1500.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(500.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        */

    }

}