package visionplusx;

import javax.swing.JDialog;
import javax.swing.JFrame;
import visionplusx.model.MUser;

//XXX:NIDUARA
public class VisionPlusX implements Runnable {

    public static void main(String[] args) {
        // TODO: system init point
        //look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);

        //show main frame
        VisionPlusX vpx = new VisionPlusX();
        vpx.run();
    }

    @Override
    public void run() {
        //check user permission
        MUser user = Login.getInstance().attemptLogin();

        if (user == null) {
            System.exit(0);//login failed
        }

        //create main frame
        Home home = Home.getInstance();
        home.resetMainFrame();
        home.setVisible(true);
    }
}
