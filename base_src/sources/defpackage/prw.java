package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class prw extends IllegalArgumentException {
    public prw(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
