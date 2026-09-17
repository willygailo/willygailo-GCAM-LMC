package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class asr {
    static {
        DesugarTimeZone.getTimeZone("UTC");
    }

    public static atc a(Calendar calendar) {
        return new atc(calendar);
    }
}
