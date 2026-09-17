package defpackage;

import j$.util.function.Supplier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class idh implements Supplier {
    private final /* synthetic */ int e;
    public static final /* synthetic */ idh d = new idh(3);
    public static final /* synthetic */ idh c = new idh(2);
    public static final /* synthetic */ idh b = new idh(1);
    public static final /* synthetic */ idh a = new idh(0);

    private /* synthetic */ idh(int i) {
        this.e = i;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return new ArrayList();
    }
}
