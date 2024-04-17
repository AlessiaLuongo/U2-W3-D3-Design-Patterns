package alessia.U2W3D3Design.Patterns.esercizio2;

import lombok.*;

import java.util.List;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Pagina implements Lunghezza {

    @Override
    public int howManyPages() {
        return 1;
    }
}
