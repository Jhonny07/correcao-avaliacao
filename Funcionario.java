public class Funcionario{ 
private String nome;
private String cpf;
private double salario;
private String departamento;
public void setNome(String novoNome) { 
this.nome=novoNome;
} 

public String getNome(){
return this.nome;
}

public void setCpf(String novoCpf){ 
this.cpf=novoCpf;
}

public String getCpf(){
return this.cpf;
}
    
public void setSalario(double novoSalario){
this.salario=novoSalario;
}

public double getSalario(){ 
return this.salario;
}

public void setDepartamento(String novoDepartamento){
this.departamento=novoDepartamento;
}

public String getDepartamento(){
return this.departamento;
}

public double bonificacao(){
return this.salario*0.1;
}
}