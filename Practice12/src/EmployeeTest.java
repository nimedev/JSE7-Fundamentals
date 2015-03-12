/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmoritz
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager myManager = new Manager();
        Editor myEditor = new Editor();
        GraphicIllustrator myGI = new GraphicIllustrator();
        TechnicalWriter myTW = new TechnicalWriter();
        Printer myPrinter = new Printer();

        myEditor.setName("Fred Hanson");
        myEditor.setJobTitle("Editor");
        myEditor.calculateEmployeeID();
        myEditor.setLevel(1);
        myEditor.setSkill("technical editing");
        myEditor.setSkill("typing");
        myEditor.setPrefersPaperEditing(true);
        myPrinter.printToScreen(myEditor);
        System.out.println("**** *****");

        myGI.setJobTitle("Graphic Illustrator");
        myGI.setName("Frank Moses");
        myGI.calculateEmployeeID();
        myGI.setLevel(3);
        myGI.setSkill("technical illustration");
        myGI.setSkill("video production");
        myGI.setSkill("media authoring");
        myPrinter.printToScreen(myGI);
        System.out.println("**** *****");

        myTW.setName("James Ralph");
        myTW.setJobTitle("Technical Writer");
        myTW.calculateEmployeeID();
        myTW.setLevel(1);
        myTW.setSkill("technical writing");
        myPrinter.printToScreen(myTW);
        System.out.println("**** *****");

        myManager.setName("Susan Smith");
        myManager.setJobTitle("Manager");
        myManager.calculateEmployeeID();
        myManager.setLevel(2);
        myManager.setEmployee(myEditor);
        myManager.setEmployee(myGI);
        myManager.setEmployee(myTW);
        myPrinter.printToScreen(myManager);
    }
}