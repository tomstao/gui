

public class Main {
    public static void main(String[] args) {

        // JFrame = a GUI window to add components to
//        JFrame frame = new JFrame(); // creates a frame
//        frame.setTitle("JFrame title goes here"); // sets title of frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//        frame.setResizable(false); // prevent frame from being resized
//        frame.setVisible(true); // makes frame visible
//        frame.setSize(420, 420); // sets x-dimension, y-dimension
//        ImageIcon image = new ImageIcon("logo.png"); // create an ImageIcon
//        frame.setIconImage(image.getImage()); // change icon of frame
//        frame.getContentPane().setBackground(new Color(123,50,250)); // change color of background
         MyFrame myFrame = new MyFrame();
         // We can creat a class that extends JFrame and put all the code in that class
            myFrame.setTitle("JFrame title goes here"); // sets title of frame
    }
}