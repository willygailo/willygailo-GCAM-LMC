package j$.sun.security.action;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes2.dex */
public class GetPropertyAction implements PrivilegedAction {
    private String defaultVal;
    private String theProp;

    public GetPropertyAction(String str) {
        this.theProp = str;
    }

    public static String privilegedGetProperty(String str) {
        return System.getSecurityManager() == null ? System.getProperty(str) : (String) AccessController.doPrivileged(new GetPropertyAction(str));
    }

    @Override // java.security.PrivilegedAction
    public String run() {
        String property = System.getProperty(this.theProp);
        return property == null ? this.defaultVal : property;
    }
}
