package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ody {
    public final int a;
    public final boolean b;

    public ody() {
    }

    public ody(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static ody a() {
        odx odxVar = new odx();
        odxVar.a = 0;
        odxVar.b = false;
        Integer num = odxVar.a;
        if (num != null && odxVar.b != null) {
            return new ody(num.intValue(), odxVar.b.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (odxVar.a == null) {
            sb.append(" appUpdateType");
        }
        if (odxVar.b == null) {
            sb.append(" allowAssetPackDeletion");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ody) {
            ody odyVar = (ody) obj;
            if (this.a == odyVar.a && this.b == odyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
