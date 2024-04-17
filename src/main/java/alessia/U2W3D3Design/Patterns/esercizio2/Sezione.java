package alessia.U2W3D3Design.Patterns.esercizio2;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor


public class Sezione implements Lunghezza{

    private List<Lunghezza> sottosezioni;


    public Sezione(List<Pagina> listaPagine) {
        this.sottosezioni = new ArrayList<>(listaPagine);
    }


    @Override
    public int howManyPages() {
        int risultato = 0;
        for (Lunghezza lunghezza : sottosezioni){
        risultato += lunghezza.howManyPages();
      }

        return risultato;
    }}
