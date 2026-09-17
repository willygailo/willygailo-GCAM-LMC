package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aqs {
    public String a;
    public amq b;
    public int c;
    public List d;
    public List e;
    public int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqs)) {
            return false;
        }
        aqs aqsVar = (aqs) obj;
        if (this.c != aqsVar.c) {
            return false;
        }
        String str = this.a;
        if (str == null ? aqsVar.a != null : !str.equals(aqsVar.a)) {
            return false;
        }
        if (this.f != aqsVar.f) {
            return false;
        }
        amq amqVar = this.b;
        if (amqVar == null ? aqsVar.b != null : !amqVar.equals(aqsVar.b)) {
            return false;
        }
        List list = this.d;
        if (list == null ? aqsVar.d != null : !list.equals(aqsVar.d)) {
            return false;
        }
        List list2 = this.e;
        if (list2 != null) {
            return list2.equals(aqsVar.e);
        }
        return aqsVar.e == null;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        int i = this.f;
        if (i != 0) {
            gg.g(i);
        } else {
            i = 0;
        }
        int i2 = (iHashCode + i) * 31;
        amq amqVar = this.b;
        int iHashCode2 = (((i2 + (amqVar != null ? amqVar.hashCode() : 0)) * 31) + this.c) * 31;
        List list = this.d;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.e;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
