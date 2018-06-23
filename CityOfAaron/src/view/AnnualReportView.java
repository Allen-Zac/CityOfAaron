package view;

/**
 *
 * @author Zac Allen
 */
public class AnnualReportView extends ViewBase {
     /**
     * Constructor
     */
    public AnnualReportView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "\nYear: 01\n"
                + "People Starved: 50\n"
                + "New Citizens: 20\n"
                + "Current Population: 200\n"
                + "Acres Owned: 100\n"
                + "Bushels Per Acre: 7\n"
                + "Bushels Paid in Tithes: 70\n"
                + "Bushels Eaten by Rats: 31\n"
                + "Bushels in Stores: 1200\n";
    }

    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        return null;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        return false;
    }
}
