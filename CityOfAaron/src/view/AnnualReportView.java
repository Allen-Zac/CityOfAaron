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
                + "People Starved: 0\n"
                + "New Citizens: 5\n"
                + "Current Population: 100\n"
                + "Acres Owned: 1000\n"
                + "Bushels Per Acre: 3\n"
                + "Bushels Paid in Tithes: 300\n"
                + "Bushels Eaten by Rats: 0\n"
                + "Bushels in Stores: 2700\n";
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
