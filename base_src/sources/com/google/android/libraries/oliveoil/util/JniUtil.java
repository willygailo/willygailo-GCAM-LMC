package com.google.android.libraries.oliveoil.util;

/* JADX INFO: loaded from: classes.dex */
public class JniUtil {
    public static final /* synthetic */ int a = 0;

    static {
        a();
    }

    public static void a() {
        try {
            System.loadLibrary("oliveoil");
        } catch (UnsatisfiedLinkError e) {
            if (System.getProperty("java.vm.name").equals("Dalvik")) {
                throw e;
            }
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 32);
            sb.append("Not running Dalvik VM. Details: ");
            sb.append(strValueOf);
            throw new UnsatisfiedLinkError(sb.toString());
        }
    }
}
