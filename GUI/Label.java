
import javax.swing.*;

public class Label {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Hello");	//create Java Frame object
    JLabel jl = new JLabel("This is Label Text");
		
		f.setVisible(true); // to make your frame appear/show/visible
		f.setSize(500, 500); //set the dimension of your frame
    f.add(jl); //we add label inside the frame
    jl.setVisible(True); // we set visible the text
    
    
	}

}
