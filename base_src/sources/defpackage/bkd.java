package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bkd implements bjv {
    final /* synthetic */ bke a;

    public bkd(bke bkeVar) {
        this.a = bkeVar;
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 11 + String.valueOf(strValueOf).length());
        sb.append(string);
        sb.append("{fragment=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
