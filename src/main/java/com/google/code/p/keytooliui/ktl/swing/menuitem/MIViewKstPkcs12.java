package com.google.code.p.keytooliui.ktl.swing.menuitem;

import java.awt.event.ActionListener;

import com.google.code.p.keytooliui.ktl.util.jarsigner.UtilKstPkcs12;

public final class MIViewKstPkcs12 extends MIViewKstAbs
{
    public MIViewKstPkcs12(ActionListener actListenerParent)
    {
        super(UtilKstPkcs12.f_s_strKeystoreType, actListenerParent);

        /*if (! com.google.code.p.keytooliui.ktl.util.jarsigner.KTLAbs.s_isPolicyExtended())
        {
            setEnabled(false);
            setVisible(false);
        }*/
    }
}
