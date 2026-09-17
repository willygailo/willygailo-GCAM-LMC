package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes2.dex */
final class osy {
    public Object a;

    public final void a(Object obj, Object obj2) {
        if (this.a != obj) {
            throw new ConcurrentModificationException();
        }
        this.a = obj2;
    }
}
