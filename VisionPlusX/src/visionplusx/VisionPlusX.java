package visionplusx;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;
import visionplusx.model.MUser;

//XXX:NIDUARA
public class VisionPlusX implements Runnable {

    public static void main(String[] args) {
        //  system init point

        //show main frame
        VisionPlusX vpx = new VisionPlusX();
        SwingUtilities.invokeLater(vpx);
    }

    @Override
    public void run() {
        //look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin(new OfficeBlue2007Skin());

        //check user permission
        MUser user = Login.getInstance().attemptLogin();

        if (user == null) {
            System.exit(0);//login failed
        }

        //create main frame
        Home home = Home.getInstance();
        home.resetMainFrame();
        home.setUser(user);
        home.setVisible(true);
    }
}
