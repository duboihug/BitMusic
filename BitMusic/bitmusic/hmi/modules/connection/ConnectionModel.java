/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmusic.hmi.modules.connection;

import bitmusic.hmi.mainwindow.WindowComponent;
import bitmusic.hmi.patterns.AbstractModel;
import bitmusic.profile.utilities.ProfileExceptions;

/**
 *
 * @author hebergui, unkedeuxke
 */
public final class ConnectionModel extends AbstractModel {

    public ConnectionModel() {
        super();
    }

    public boolean doConnection(String login, String password) throws ProfileExceptions {
        return true;
        //return WindowComponent.getInstance().getApiProfile().checkPassword(login, password);
    }
}
