package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class kog extends bmo implements koh {
    private final Object a;

    public kog() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    private kog(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }

    public static koh b(Object obj) {
        return new kog(obj);
    }

    public static Object c(koh kohVar) {
        if (kohVar instanceof kog) {
            return ((kog) kohVar).a;
        }
        IBinder iBinderAsBinder = kohVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        mip.dk(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
