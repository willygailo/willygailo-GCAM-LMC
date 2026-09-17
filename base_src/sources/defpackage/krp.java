package defpackage;

import android.content.Context;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class krp {
    private static final Object a = new Object();
    private static volatile krm b;

    private krp() {
    }

    public static IInterface a(Context context, String str, kro kroVar) {
        krm krmVarB = b;
        if (krmVarB == null) {
            synchronized (a) {
                krmVarB = b;
                if (krmVarB == null) {
                    krmVarB = b(context);
                    b = krmVarB;
                }
            }
        }
        return krmVarB.a(context, str, kroVar);
    }

    private static krm b(Context context) throws krn {
        Class<?> clsLoadClass;
        try {
            clsLoadClass = krp.class.getClassLoader().loadClass("com.google.android.gms.learning.internal.dynamite.FatDynamiteLoader");
        } catch (ClassNotFoundException e) {
            try {
                clsLoadClass = krp.class.getClassLoader().loadClass("krl");
            } catch (ClassNotFoundException e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                throw new krn(strValueOf.length() != 0 ? "No dynamite loader found: ".concat(strValueOf) : new String("No dynamite loader found: "), e2);
            }
        }
        try {
            return (krm) clsLoadClass.getConstructor(Context.class).newInstance(context);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
            String strValueOf2 = String.valueOf(e3.getMessage());
            throw new krn(strValueOf2.length() != 0 ? "Failed to create dynamite loader instance: ".concat(strValueOf2) : new String("Failed to create dynamite loader instance: "), e3);
        }
    }
}
