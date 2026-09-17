package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mli extends Exception {
    public mli(Exception exc) {
        super("Exception while parsing video", exc);
    }

    public mli(String str) {
        super(str);
    }
}
