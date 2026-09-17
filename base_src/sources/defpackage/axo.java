package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class axo {
    final String a;

    public axo(String str) {
        int length = str.length() - 14;
        if (length > 0) {
            axp.c(axp.a, "Tag " + str + " is " + length + " chars longer than limit.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CAM2PORT_");
        sb.append(length > 0 ? str.substring(0, 14) : str);
        this.a = sb.toString();
    }

    public final String toString() {
        return this.a;
    }
}
