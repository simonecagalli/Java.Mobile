package mobili;

import java.util.ArrayList;
import java.util.List;

public class Ordine {

    private String nome;
    private String cognome;
    private List<Mobile> lm = new ArrayList<>();

    public Ordine(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<Mobile> getLm() {
        return lm;
    }

    public void setLm(List<Mobile> lm) {
        this.lm = lm;
    }

    public void addOrdine(Mobile m) {
        this.lm.add(m);
    }

    public double calcolaIngombroScatole() {
        double sum = 0;
        for (Mobile m : this.lm) {
            sum += m.calcolaIngombro();
        }
        return sum;
    }

    public static void main(String[] args) {
        Ordine ordine = new Ordine("Nome","Cognome");
        Sedia sd = new Sedia(true, 49, 74, 53, 60, 80, 60, 15);
        Armadio ad = new Armadio(6 ,230 ,180 ,60 ,240 ,65 , 40, 30);
        Tavolo tv = new Tavolo("Ovale", 1, 1, 1, 5, 5, 5, 50);
        ordine.addOrdine(sd);
        ordine.addOrdine(ad);
        ordine.addOrdine(tv);
        for (Mobile m : ordine.getLm()) {
            System.out.println(m);
            System.out.println("Ingombro: " + m.calcolaIngombro() + " cmq\n");
        }
        System.out.println("Ingombro totale: " + ordine.calcolaIngombroScatole() + " cmq");
    }

}
