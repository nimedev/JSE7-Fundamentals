/**
 *
 * @author niconator
 */
public class ClassMap {
    public String[][] deskArray;
    public String name;
    
    public void setClassMap(){
        deskArray = new String[3][4];
    }
    
    public void setDesk(){
        boolean flag = false;
        for(int row=0; row<3; row++){
            for(int col=0; col<4; col++){
                if(deskArray[row][col]==null){
                    deskArray[row][col]=name;
                    System.out.println(name+": "+row+col);
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
    }
    
    public void displayDeskMap() {
        for(int row=0; row<3; row++){
            for(int col=0; col<4; col++){
                System.out.print(" "+ deskArray[row][col] +" ");
            }
            System.out.println(); // carriage return between rows
        }
    }
    
    public void searchDesk() {
        boolean flag = false;
        for(int row=0; row<3; row++){
            for(int col=0; col<4; col++){
                if(deskArray[row][col]!=null && deskArray[row][col].equals(name)){
                    deskArray[row][col]=name;
                    System.out.println(name+": "+row+col);
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(!flag){
            System.out.println("No found!");
        }
    }
}
