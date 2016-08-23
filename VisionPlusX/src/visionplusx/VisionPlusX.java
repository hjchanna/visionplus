package visionplusx;

import visionplusx.model.MUser;

//XXX:NIDUARA

public class VisionPlusX implements Runnable {

    public static void main(String[] args) {
        // TODO: system init point
            
    }

    @Override
    public void run() {
        //check user permission
        MUser user = Login.getInstance().attemptLogin();

        if (user == null) {
            System.exit(0);//login failed
        }
        
        //create main frame
        new Home().setVisible(true);
    }

}
