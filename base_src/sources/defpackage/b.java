package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final Properties a;

    static {
        Properties properties = new Properties();
        a = properties;
        try {
            InputStream resourceAsStream = System.getSecurityManager() != null ? (InputStream) AccessController.doPrivileged(new c(d.class)) : d.class.getResourceAsStream("/android/icumessageformat/ICUConfig.properties");
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            }
        } catch (IOException e) {
        } catch (MissingResourceException e2) {
        }
    }

    public static String a() {
        String property;
        if (System.getSecurityManager() != null) {
            try {
                property = (String) AccessController.doPrivileged(new a());
            } catch (AccessControlException e) {
                property = null;
            }
        } else {
            property = System.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode");
        }
        return property == null ? a.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL") : property;
    }
}
