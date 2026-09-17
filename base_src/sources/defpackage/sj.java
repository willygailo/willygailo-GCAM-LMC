package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        a = iArr;
        try {
            iArr[TimeUnit.MILLISECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[TimeUnit.SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[TimeUnit.MINUTES.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[TimeUnit.HOURS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[TimeUnit.DAYS.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
