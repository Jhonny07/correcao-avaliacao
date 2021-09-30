public class Principal{

    public static void main (String args[]){

    Funcionario f=new Funcionario();
    f.setNome("Jhonny");
    f.setCpf("500.858.528-21");
    f.setDepartamento("T.I");
    f.setSalario(8500);

    System.out.println("O nome do funcionário é "+f.getNome());
    System.out.println("CPF do Funcionário: "+f.getCpf());
    System.out.println("Pertence ao deartamento de "+f.getDepartamento());
    System.out.println("Recebendo um salário no valor de "+f.getSalario());
    System.out.println("E tera um bonificação de: "+f.bonificacao());
    }
}