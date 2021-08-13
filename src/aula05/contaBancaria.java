package aula05;

public class contaBancaria {
       int agencia, nConta;
       String cpf, titularC;
       float saldo, chequeEsp;
       
       public contaBancaria(int agencia, int nConta, String cpf, String titularC){
           this.agencia = agencia;
           this.nConta = nConta;
           this.cpf = cpf;
           this.titularC = titularC;
       }
       
       public String exibirConta(){
           return "Agencia: " + this.agencia + "\n Numero da conta: " + this.nConta + "\n CPF: "
           + this.cpf + "\nTitular: " + this.titularC;        
       }
       
       public String deposito (float valor){
           this.saldo += valor;
           return "Deposito de R$" + valor + " realizado com sucesso";
       }
       public String saque (float valor){
           if (valor < this.saldo){
               this.saldo -= valor;
               return "Saque de R$" + valor + "Realizado com sucesso!";
           }else{
               return "O saque não pode ser realizado. Erro: Valor insuficiente";
           }
       
       }
       public String saldo (){
           return exibirConta() +"\n Saldo: R$" +this.saldo;
       }
}
