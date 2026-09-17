package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ayh extends ayd {
    public ayh(Class cls) {
        String strValueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 46);
        sb.append("Failed to find source encoder for data class: ");
        sb.append(strValueOf);
        super(sb.toString());
    }
}
