import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Student{
    private final String nome;
    private final String cognome;
    private final String matricola;
    private final int anno_nascita;

    public Studente(String nome, String cognome.String matricola, int anno_nascita)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.matricola=matricola;
        this.anno_nascita=anno_nascita;
    }

    public String toCsv(){
        return String.join(";",matricola,nome,cognome,anno_nascita)
    }
    public static void main(String[]args)throw IOException{
        Scanner st=new Scanner(System.in);
        Path csv=Path.of("studenti.csv");

        System.out.println("inserisci gli studenti da incorporare ed al termine calcare exit");
       String nome= st.nextLine().trim();
        if(nome.equalsIgnoreCase("exit"))break;

        System.out.println("cognome : ");
        String cognome= st.nextLine().trim();

        System.out.println("matricola : ")
        String matricola=st.nextLine().trim();

        System.out.println("anno di nascita = ");
        String 
    }
}