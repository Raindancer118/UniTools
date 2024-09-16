import javax.swing.JOptionPane;

public class Transferleistung {
    private int grade;
    private int number;
    private String topic;

    public Transferleistung(int number) {
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
        double gesamtNote = 0;

        // GUI für die Eingabe der Bewertungen
        int inhaltlicheRichtigkeit = getNoteFromUser("Bitte geben Sie die inhaltliche Richtigkeit Ihrer Transferleistung ein:");
        gesamtNote += calculateNumber(inhaltlicheRichtigkeit, Bewertungsprozentsaetze.gewichtungInhaltlicheRichtigkeit);

        int selbstreflektion = getNoteFromUser("Bitte geben Sie die Selbstreflektion Ihrer Transferleistung ein:");
        gesamtNote += calculateNumber(selbstreflektion, Bewertungsprozentsaetze.gewichtungSelbstreflektion);

        int theorieAufPraxis = getNoteFromUser("Bitte geben Sie die Theorie zu Praxis Ihrer Transferleistung ein:");
        gesamtNote += calculateNumber(theorieAufPraxis, Bewertungsprozentsaetze.gewichtungTheorieAufPraxis);

        int findetLoesungsansaetze = getNoteFromUser("Bitte geben Sie die Bewertung Ihrer Lösungsansatz-Findung Ihrer Transferleistung ein:");
        gesamtNote += calculateNumber(findetLoesungsansaetze, Bewertungsprozentsaetze.gewichtungFindetLoesungsansaetze);

        int systematischerAufbau = getNoteFromUser("Bitte geben Sie die Bewertung Ihres systematischen Aufbaus Ihrer Transferleistung ein:");
        gesamtNote += calculateNumber(systematischerAufbau, Bewertungsprozentsaetze.gewichtungSystematischerAufbau);

        int nutzungFachsprache = getNoteFromUser("Bitte geben Sie die Bewertung Ihrer Nutzung von Fachsprache Ihrer Transferleistung ein:");
        gesamtNote += calculateNumber(nutzungFachsprache, Bewertungsprozentsaetze.gewichtungNutzungFachsprache);

        int qualitaetBeiPlanung = getNoteFromUser("Bitte geben Sie die Bewertung Ihrer Planungsqualität ein:");
        gesamtNote += calculateNumber(qualitaetBeiPlanung, Bewertungsprozentsaetze.gewichtungQualitaetBeiPlanung);

        int geeigneteLiteratur = getNoteFromUser("Bitte geben Sie die Bewertung Ihrer geeigneten Literatur zurück:");
        gesamtNote += calculateNumber(geeigneteLiteratur, Bewertungsprozentsaetze.gewichtungGeeigneteLiteratur);

        int nachvollziehbareAnalyse = getNoteFromUser("Bitte geben Sie die Bewertung der Nachvollziehbarkeit Ihrer Analysen ein:");
        gesamtNote += calculateNumber(nachvollziehbareAnalyse, Bewertungsprozentsaetze.gewichtungNachvollziehbareAnalyse);

        int generelleRichtigkeit = getNoteFromUser("Bitte geben Sie die Bewertung der generellen Richtigkeit Ihrer Transferleistung ein:");
        gesamtNote += calculateNumber(generelleRichtigkeit, Bewertungsprozentsaetze.gewichtungGenerelleRichtigkeit);

        int formatierungenLayout = getNoteFromUser("Bitte geben Sie die Bewertung Ihrer Formatierung und Ihres Layouts Ihrer Transferleistung ein:");
        gesamtNote += calculateNumber(formatierungenLayout, Bewertungsprozentsaetze.gewichtungFormatierungenLayout);

        int zitation = getNoteFromUser("Bitte geben Sie die Bewertung Ihrer Zitation ein:");
        gesamtNote += calculateNumber(zitation, Bewertungsprozentsaetze.gewichtungZitation);

        // Ausgabe der Gesamtnote
        String formatierteGesamtNote = String.format("%.2f", gesamtNote);
        JOptionPane.showMessageDialog(null, "Die Gesamtnote der eingegebenen Transferleistung ist: " +Main.RED+Main.BOLD+ formatierteGesamtNote);
    }

    // Methode zur Eingabe von Noten mit JOptionPane
    private static int getNoteFromUser(String message) {
        String input = JOptionPane.showInputDialog(null, message);
        return Integer.parseInt(input);  // Konvertieren der Eingabe zu int
    }

    public static class Bewertungsprozentsaetze {
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
        return Bewertung * gewichtung;
    }
}
