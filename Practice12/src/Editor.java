/**
 *
 * @author niconator
 */
public class Editor extends SkilledEmployee {
    
    private boolean prefersPaperEditing = false;

    public void setPrefersPaperEditing(boolean prefersPaperEditing) {
        this.prefersPaperEditing = prefersPaperEditing;
    }
    
    public String getEditingPreference() {
        if (prefersPaperEditing) {
            return "Paper";
        } else {
            return "Electronic";
        }
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Preference: "+this.getEditingPreference());
    }
}
