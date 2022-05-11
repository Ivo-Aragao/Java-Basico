
package contabanco;

public class ContaBanco {
    //atributos
    public int numConta;
    private String cliente;
    protected String tipoconta;
    private float saldo;
    private boolean status;

    
    public void estadoatual(){
        System.out.println("numconta " + this.getNumConta());
        System.out.println("cliete " + this.getCliente());
        System.out.println("tipoconta " + this.getTipoconta());
        System.out.println("saldo " + this.getSaldo());
        System.out.println("status " + this.getStatus());
    }

    public ContaBanco() {
        //metodo construtor 

        this.saldo = 0;
        this.status = false;
    }
   
// metodos esoeciais getter and setter
    public float getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String t) {
        this.tipoconta = t;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //metodos personalizados
    public void abrirconta(String t){
     this.setTipoconta(t);
     this.setStatus(true);
     if(t == " cc"){
     this.saldo = 50;
     } else if(t == " cp"){
        this.saldo = 150;
    }
        System.out.println("conta aberta com sucesso");
    } 
    public void fecharconta(String t){
 
        if(this.saldo > 0){
            System.out.println("conta com dinheiro, nao pode ser fechada");
        }else if(this.saldo < 0){
            System.out.println("conta em debito, não pode ser fechada");
        
        }else 
           this.status = false;
            System.out.println("conta fechada com sucesso");

    }

    public void depositar(float v){
           if(this.status = true){
               this.saldo = saldo + v;
               System.out.println("deposito realizado com sucesso na conta" + this.getCliente());
    } else
            System.out.println("impossivel depositar");
    }
    public void sacar(float v){
           if(this.status = true){
           if(saldo >= v){
              this.saldo = saldo - v; 
           }else
               System.out.println("voce nao pode sacar esse valor");
           } else if(this.status = false){
               System.out.println("impossivel sacar");
           }
    }
    public void pagarmensal(int v, String t){
         this.setTipoconta(t);
         if(t == " cc"){
             v = 12;
         }
         if(t == " cp"){
             v = 20;
         }
        if(this.status = true){ 
            if (this.saldo > v){
            this.saldo = saldo - v;
                System.out.println("mensalidade paga com sucesso");
            }else 
                System.out.println("impossivel pagar uma conta fechada");
        }                  
    }
}
