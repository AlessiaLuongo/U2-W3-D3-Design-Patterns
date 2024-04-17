package alessia.U2W3D3Design.Patterns;

import alessia.U2W3D3Design.Patterns.esercizio1.DataSource;
import alessia.U2W3D3Design.Patterns.esercizio1.Info;
import alessia.U2W3D3Design.Patterns.esercizio1.InfoAdapter;
import alessia.U2W3D3Design.Patterns.esercizio1.UserData;
import alessia.U2W3D3Design.Patterns.esercizio2.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class U2W3D3DesignPatternsApplication {

	public static final List<Sezione> LISTA_AUTORI = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------------------------------------------------");


		UserData userData = new UserData();

		Info info = new Info("Alessia", "Luongo", new Date(95, Calendar.FEBRUARY, 3));

		InfoAdapter infoAdapter = new InfoAdapter(info);

		userData.getData(infoAdapter);
		System.out.println(userData.getNomeCompleto() + " " + userData.getEta());


		System.out.println("------------------------------------------------------------------------------------------------------");

		List<Pagina> listaPagine = new ArrayList<>();
		listaPagine.add(new Pagina());
		listaPagine.add(new Pagina());
		listaPagine.add(new Pagina());
		listaPagine.add(new Pagina());
		listaPagine.add(new Pagina());
		listaPagine.add(new Pagina());

		Sottosezione sottosezione1 = new Sottosezione(new ArrayList<>());

		List<Sottosezione> listaSottosezione = new ArrayList<>();
		listaSottosezione.add(sottosezione1);


		Sezione sezione1 = new Sezione(new ArrayList<>(), listaSottosezione);


		List<Sezione> listaSezioni = new ArrayList<>();
		listaSezioni.add(sezione1);


		Autore autore = new Autore("Alessia", "Luongo", 29);
		List<Autore> listaAutori = new ArrayList<>();
		listaAutori.add(autore);

		Libro libro = new Libro("Un libro", listaSezioni ,listaAutori, 10.50);

		System.out.println(libro.howManyPages());

	}


}
