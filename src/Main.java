//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // ANSI escape codes for colors
    public static final String RESET = "\033[0m";  // Reset color
    public static final String RED = "\033[0;31m"; // Red
    public static final String GREEN = "\033[0;32m"; // Green
    public static final String YELLOW = "\033[0;33m"; // Yellow
    public static final String BLUE = "\033[0;34m"; // Blue
    public static final String PURPLE = "\033[0;35m"; // Purple
    public static final String CYAN = "\033[0;36m"; // Cyan
    public static final String WHITE = "\033[0;37m";
    public static final String BOLD = "\033[1m";


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}