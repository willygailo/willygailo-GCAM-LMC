package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class qnv extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return new Random();
    }
}
