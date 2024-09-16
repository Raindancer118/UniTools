import java.util.Scanner;

public class Transferleistung {
    private int grade;
    private int number;
    private String topic;

    // Konstruktor mit nur der Nummer der Transferleistung, da das Thema nachträglich gesetzt werden
    // kann und die Noten berechnet werden.
    public Transferleistung (int number) {
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    public static void main(String[] args) {
        // Initialisierung der Gesamtnote:
        double gesamtNote = 0;

        // Holen der Bewertungsnoten:
        Scanner scanner = new Scanner(System.in);
        System.out.println(Main.GREEN +"Bitte geben Sie die inhaltliche Richtigkeit ihrer Transferleistung ein.");
        int inhaltlicheRichtigkeit;
        inhaltlicheRichtigkeit = scanner.nextInt();
        gesamtNote += calculateNumber(inhaltlicheRichtigkeit, Bewertungsprozentsaetze.gewichtungInhaltlicheRichtigkeit);
        System.out.println(Main.GREEN+"Bitte geben Sie die Selbstreflektion ihrer Transferleistung ein.");
        int selbstreflektion;
        selbstreflektion = scanner.nextInt();
        gesamtNote += calculateNumber(selbstreflektion, Bewertungsprozentsaetze.gewichtungSelbstreflektion);
        System.out.println("Bitte geben Sie die Theorie zu Praxis ihrer Transferleistung ein.");
        int theorieAufPraxis;
        theorieAufPraxis = scanner.nextInt();
        gesamtNote += calculateNumber(theorieAufPraxis, Bewertungsprozentsaetze.gewichtungTheorieAufPraxis);
        System.out.println(Main.GREEN+"Bitte geben Sie die Bewertung ihrer Lösungsansatz-Findung ihrer Transferleistung ein.");
        int findetLoesungsansaetze;
        findetLoesungsansaetze = scanner.nextInt();
        gesamtNote += calculateNumber(findetLoesungsansaetze, Bewertungsprozentsaetze.gewichtungFindetLoesungsansaetze);
        System.out.println(Main.GREEN+"Bitte geben Sie die Bewertung ihres systematischen Aufbaus ihrer Transferleistung ein.");
        int systematischerAufbau;
        systematischerAufbau = scanner.nextInt();
        gesamtNote += calculateNumber(systematischerAufbau, Bewertungsprozentsaetze.gewichtungSystematischerAufbau);
        System.out.println(Main.GREEN+"Bitte geben Sie die Bewertung ihrer Nutzung von Fachsprache ihrer Transferleistung ein.");
        int nutzungFachsprache;
        nutzungFachsprache = scanner.nextInt();
        gesamtNote += calculateNumber(nutzungFachsprache, Bewertungsprozentsaetze.gewichtungNutzungFachsprache);
        System.out.println(Main.GREEN+"Bitte geben Sie die Bewertung ihrer Planungsqualität ein.");
        int qualitaetBeiPlanung;
        qualitaetBeiPlanung = scanner.nextInt();
        gesamtNote += calculateNumber(qualitaetBeiPlanung, Bewertungsprozentsaetze.gewichtungQualitaetBeiPlanung);
        System.out.println(Main.GREEN+"Bitte geben Sie die Bewertung ihrer geeigneten Literatur zurück.");
        int geeigneteLiteratur;
        geeigneteLiteratur = scanner.nextInt();
        gesamtNote += calculateNumber(geeigneteLiteratur, Bewertungsprozentsaetze.gewichtungGeeigneteLiteratur);
        System.out.println(Main.GREEN+"Bitte geben Sie die Bewertung der Nachvollziehbarkeit Ihrer Analysen ein.");
        int nachvollziehbareAnalyse;
        nachvollziehbareAnalyse = scanner.nextInt();
        gesamtNote += calculateNumber(nachvollziehbareAnalyse, Bewertungsprozentsaetze.gewichtungNachvollziehbareAnalyse);
        System.out.println(Main.GREEN+"Bitte geben Sie die Bewertung der generellen Richtigkeit ihrer Transferleistung ein.");
        int generelleRichtigkeit;
        generelleRichtigkeit = scanner.nextInt();
        gesamtNote += calculateNumber(generelleRichtigkeit, Bewertungsprozentsaetze.gewichtungGenerelleRichtigkeit);
        System.out.println(Main.GREEN+"Bitte geben Sie die Bewertung ihrer Formatierung und ihres Layouts ihrer Transferleistung ein.");
        int formatierungenLayout;
        formatierungenLayout = scanner.nextInt();
        System.out.println(Main.GREEN+"Bitte geben Sie die Bewertung ihrer Zitation ein.");
        int zitation;
        zitation = scanner.nextInt();
        gesamtNote += calculateNumber(zitation,Bewertungsprozentsaetze.gewichtungZitation);
        gesamtNote += calculateNumber(formatierungenLayout, Bewertungsprozentsaetze.gewichtungFormatierungenLayout);
        String formatierteGesamtNote = String.format("%.2f", gesamtNote);
        System.out.println(Main.GREEN + "Die Gesamtnote der eingegebenen Transferleistung ist: "+Main.RED+Main.BOLD+ formatierteGesamtNote+Main.GREEN+".");
    }


    public static class Bewertungsprozentsaetze {
        // Gewichtungsvariablen
        public static double gewichtungInhaltlicheRichtigkeit = 0.10;
        public static double gewichtungSelbstreflektion = 0.05;
        public static double gewichtungTheorieAufPraxis = 0.10;
        public static double gewichtungFindetLoesungsansaetze = 0.10;
        public static double gewichtungSystematischerAufbau = 0.05;
        public static double gewichtungNutzungFachsprache = 0.05;
        public static double gewichtungQualitaetBeiPlanung = 0.10;
        public static double gewichtungGeeigneteLiteratur = 0.10;
        public static double gewichtungNachvollziehbareAnalyse = 0.15;
        public static double gewichtungGenerelleRichtigkeit = 0.05;
        public static double gewichtungFormatierungenLayout = 0.05;
        public static double gewichtungZitation = 0.10;
    }

    public static double calculateNumber(int Bewertung, double gewichtung) {
        double grade = Bewertung * gewichtung;
        return grade;
    }
}
