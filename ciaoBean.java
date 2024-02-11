package mieiBean;

import java.util.*;
public class ciaoBean implements java.io.Serializable
{
    private String informatica,linguaggi,poesie;
    private String categoria;
    private String esempio;
    public ciaoBean(){
        inizializza();
    }
    public void inizializza(){
        informatica = "ISBN XXX-YY1 <br> Tecnologie Informatiche";
        linguaggi = "Il lignuaggio C ISBN XXX-ZZ1 <br> Java per Tutti";
        poesie = "Poesie d'amore e disperazione ISBN XXX-ZZ1 <br> Vita nuova";
        esempio = "prova";
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }

    public String getEsempio() {
        return esempio;
    }

    public void setEsempio(String esempio) {
        this.esempio = esempio;
    }

    public String getInformatica() {
        return informatica;
    }

    public void setInformatica(String informatica) {
        this.informatica = informatica;
    }

    public String getLinguaggi() {
        return linguaggi;
    }

    public void setLinguaggi(String linguaggi) {
        this.linguaggi = linguaggi;
    }

    public String getPoesie() {
        return poesie;
    }

    public void setPoesie(String poesie) {
        this.poesie = poesie;
    }

    public String getElenco(){
        String msg = "Nessuna categoria scelta";
        if("informatica".equals(categoria)){
            msg = informatica;
        }
        else if("linguaggi".equals(categoria)){
            msg = linguaggi;
        }
        else if("poesie".equals(categoria)){
            msg = poesie;
        }
        return msg;
    }
}
