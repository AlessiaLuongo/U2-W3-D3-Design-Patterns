package alessia.U2W3D3Design.Patterns;

import alessia.U2W3D3Design.Patterns.esercizio1.DataSource;
import alessia.U2W3D3Design.Patterns.esercizio1.Info;
import alessia.U2W3D3Design.Patterns.esercizio1.InfoAdapter;
import alessia.U2W3D3Design.Patterns.esercizio1.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class U2W3D3DesignPatternsApplication {

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------------------------------------------------");
		UserData userData = new UserData();

		Info info = new Info("Alessia", "Luongo", new Date(95, Calendar.FEBRUARY, 3));

		InfoAdapter infoAdapter = new InfoAdapter(info);

		userData.getData(infoAdapter);
		System.out.println(userData.getNomeCompleto() + " " + userData.getEta());

		System.out.println("------------------------------------------------------------------------------------------------------");

	}


}
