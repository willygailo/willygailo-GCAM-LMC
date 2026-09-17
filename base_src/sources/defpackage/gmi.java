package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gmi {
    public final String a;
    public final List b;

    public gmi(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final String toString() {
        ojb ojbVarBa = obr.ba("ValidationResult");
        ojbVarBa.b("strategy", this.a);
        ojbVarBa.c("valid", "false");
        ojbVarBa.b("failed constraints", this.b);
        return ojbVarBa.toString();
    }
}
