package alessia.U2W3D3Design.Patterns.esercizio1;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserData implements DataSource{
    private String nomeCompleto;
    private int eta;


    public void getData(DataSource dataScource){
        nomeCompleto = dataScource.getNomeCompleto();
        eta = dataScource.getEta();
    }
}
