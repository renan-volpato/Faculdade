public class Receita extends Consulta {

    public String descritivo;

    public void preescrever(){
      
    }
    public void consultar(){

    }
    
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public Receita() {
    }
    
    public Receita(Consulta pConsulta, String pData, String pDescritivo) throws Exception{
        setDescritivo(pDescritivo);
    }

    public void mostrar(){
        System.out.println("descritivo:"+getDescritivo());
    }
}
