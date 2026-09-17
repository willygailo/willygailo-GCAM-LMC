package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class osb {
    public final Field a;

    public osb(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    final void a(Object obj, Object obj2) {
        try {
            this.a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
