package aula05;


public class Carro {
    String modelo, cor;
    int velMaxima, vAtual, cMaximo, cAtual;
    boolean auto, ligado = false;
    
    public Carro(String modelo, String cor, int vMaximo, boolean auto, int cMaximo){
        this.modelo = modelo;
        this.cor = cor;
        this.auto = auto;
        this.cMaximo = cMaximo;
    }
    public String ligarDesligar(){
        if(this.ligado){
            this.ligado = false;
            return "Desligando Carro";
        }else{
            this.ligado = true;
            return "Ligando Carro";
        }
    }
    public String acelerar (){
        this.vAtual += 10;
        this.cAtual -= 3;
        return "Acelerando";
    }
    public String Desacelerar (){
        this.vAtual -= 10;
        return "Reduzindo Velocidade";
    }
    public String Freiar (){
        this.vAtual = 0;
        return "Freiando...";
    }
    public String marchaRe (){
        if(this.vAtual > 0){
            return "Reduza a velociade";
        }else{
            this.cAtual = -3;
            return "Marcha Ré engatada...";
        }   
    } 
} 
    

