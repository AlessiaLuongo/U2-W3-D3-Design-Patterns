package alessia.U2W3D3Design.Patterns.esercizio2;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Sottosezione implements Lunghezza {

    private List<Pagina> pagine;

    @Override
    public int howManyPages() {
        int totalPages = 0;
        for (Pagina pagina : pagine) {
            totalPages += pagina.howManyPages();
        }
        return totalPages;
    }
}
