package alessia.U2W3D3Design.Patterns.esercizio2;


import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Libro implements Lunghezza{

    private String nome;
    private List<Sezione> sezioni;
    private List<Autore> autori;
    private double prezzo;


    @Override
    public int howManyPages() {
        int totalPages = 0;
        for (Sezione sezione : sezioni){
            totalPages += sezione.howManyPages();
        }
        return totalPages;
    }
}
