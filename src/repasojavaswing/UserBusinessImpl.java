/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasojavaswing;

import repasojavaswing.Usuario;
import repasojavaswing.UserBusiness;

/**
 *
 * @author escor
 */
public class UserBusinessImpl implements UserBusiness {

    @Override
    public Usuario getUser() {
        Usuario user = new Usuario("admin","123");
        return user;
    }
    
}
