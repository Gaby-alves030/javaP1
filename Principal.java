public class Principal {
    
    public static void main(String[] args) {
        
        Gerente g = new Gerente();

        g.setNome("Gabriela");
        g.setCpf("11587845450");
        g.setSalario(1800.0);
        g.setDepartamento("Estatistia");
        g.setSenha(12332);

        System.out.println();

        System.out.println(g.getNome());
        System.out.println(g.getCpf());
        System.out.println(g.getSalario());
        System.out.println(g.getDepartamento());
        System.out.println(g.bonificacao());
        System.out.println(g.autentificacao());


        System.out.println();

        Funcionario f = new Funcionario();

        f.setNome("Alessandra");
        f.setCpf("56756756789");
        f.setSalario(4200.0);
        f.setDepartamento("Recursos Humanos");

        System.out.println(f.getNome());
        System.out.println(f.getCpf());
        System.out.println(f.getSalario());
        System.out.println(f.getDepartamento());
        System.out.println(f.bonificacao());

    }

}