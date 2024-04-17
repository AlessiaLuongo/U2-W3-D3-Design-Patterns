package alessia.U2W3D3Design.Patterns.esercizio2;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Sezione implements Lunghezza{
    private List<Pagina> pagine;
    private List<Sottosezione> sottosezioni;

    @Override
    public int howManyPages() {
        int totalPages = 0;
        for (Pagina pagina : pagine) {
            totalPages += pagina.howManyPages();
        }
        for (Sottosezione sottosezione : sottosezioni){
            totalPages += sottosezione.howManyPages();
        }
        return totalPages;
    }

}
