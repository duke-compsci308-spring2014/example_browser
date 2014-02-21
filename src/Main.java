import javax.swing.JFrame;


/**
 * A simple HTML browser.
 * 
 * @author Robert C. Duvall
 */
public class Main {
    // convenience constants
    public static final String TITLE = "NanoBrowser";
    public static final String DEFAULT_START_PAGE = "http://www.cs.duke.edu/rcd";

    /**
     * Start of the program.
     */
    public static void main (String[] args) {
        // create program specific components
        BrowserModel model = new BrowserModel();
        BrowserViewer display = new BrowserViewer(model);
        // create container that will work with Window manager
        JFrame frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add our user interface components to Frame and show it
        frame.getContentPane().add(display);
        frame.pack();
        frame.setVisible(true);
        // start somewhere, less typing for debugging
        display.showPage(DEFAULT_START_PAGE);
    }
}
