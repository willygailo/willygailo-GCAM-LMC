package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pou {
    public static final pou a = new pou(null);
    public final prj b = prj.b(16);
    public boolean c;
    private boolean d;

    private pou() {
    }

    private pou(byte[] bArr) {
        e();
        e();
    }

    static int a(pry pryVar, int i, Object obj) {
        int iAb = pom.ab(i);
        if (pryVar == pry.GROUP) {
            ppn.j((pqm) obj);
            iAb += iAb;
        }
        prz przVar = prz.INT;
        int iAf = 4;
        switch (pryVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iAf = 8;
                break;
            case FLOAT:
                ((Float) obj).floatValue();
                break;
            case INT64:
                iAf = pom.af(((Long) obj).longValue());
                break;
            case UINT64:
                iAf = pom.af(((Long) obj).longValue());
                break;
            case INT32:
                iAf = pom.N(((Integer) obj).intValue());
                break;
            case FIXED64:
                ((Long) obj).longValue();
                iAf = 8;
                break;
            case FIXED32:
                ((Integer) obj).intValue();
                break;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iAf = 1;
                break;
            case STRING:
                iAf = !(obj instanceof poc) ? pom.aa((String) obj) : pom.I((poc) obj);
                break;
            case GROUP:
                iAf = pom.L((pqm) obj);
                break;
            case MESSAGE:
                iAf = !(obj instanceof ppu) ? pom.S((pqm) obj) : pom.Q((ppu) obj);
                break;
            case BYTES:
                iAf = !(obj instanceof poc) ? pom.G((byte[]) obj) : pom.I((poc) obj);
                break;
            case UINT32:
                iAf = pom.ad(((Integer) obj).intValue());
                break;
            case ENUM:
                iAf = !(obj instanceof ppg) ? pom.N(((Integer) obj).intValue()) : pom.N(((ppg) obj).a());
                break;
            case SFIXED32:
                ((Integer) obj).intValue();
                break;
            case SFIXED64:
                ((Long) obj).longValue();
                iAf = 8;
                break;
            case SINT32:
                iAf = pom.W(((Integer) obj).intValue());
                break;
            case SINT64:
                iAf = pom.Y(((Long) obj).longValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iAb + iAf;
    }

    static void g(pom pomVar, pry pryVar, int i, Object obj) {
        if (pryVar == pry.GROUP) {
            pqm pqmVar = (pqm) obj;
            ppn.j(pqmVar);
            pomVar.A(i, 3);
            pomVar.aq(pqmVar);
            pomVar.A(i, 4);
            return;
        }
        pomVar.A(i, pryVar.t);
        prz przVar = prz.INT;
        switch (pryVar) {
            case DOUBLE:
                pomVar.an(((Double) obj).doubleValue());
                break;
            case FLOAT:
                pomVar.ap(((Float) obj).floatValue());
                break;
            case INT64:
                pomVar.E(((Long) obj).longValue());
                break;
            case UINT64:
                pomVar.E(((Long) obj).longValue());
                break;
            case INT32:
                pomVar.t(((Integer) obj).intValue());
                break;
            case FIXED64:
                pomVar.r(((Long) obj).longValue());
                break;
            case FIXED32:
                pomVar.p(((Integer) obj).intValue());
                break;
            case BOOL:
                pomVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof poc)) {
                    pomVar.z((String) obj);
                } else {
                    pomVar.n((poc) obj);
                }
                break;
            case GROUP:
                pomVar.aq((pqm) obj);
                break;
            case MESSAGE:
                pomVar.v((pqm) obj);
                break;
            case BYTES:
                if (!(obj instanceof poc)) {
                    byte[] bArr = (byte[]) obj;
                    pomVar.F(bArr, bArr.length);
                } else {
                    pomVar.n((poc) obj);
                }
                break;
            case UINT32:
                pomVar.C(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof ppg)) {
                    pomVar.t(((Integer) obj).intValue());
                } else {
                    pomVar.t(((ppg) obj).a());
                }
                break;
            case SFIXED32:
                pomVar.p(((Integer) obj).intValue());
                break;
            case SFIXED64:
                pomVar.r(((Long) obj).longValue());
                break;
            case SINT32:
                pomVar.as(((Integer) obj).intValue());
                break;
            case SINT64:
                pomVar.au(((Long) obj).longValue());
                break;
        }
    }

    public static int j(ppc ppcVar, Object obj) {
        return a(ppcVar.c, ppcVar.b, obj);
    }

    private static Object m(Object obj) {
        if (obj instanceof pqq) {
            return ((pqq) obj).c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static boolean n(Map.Entry entry) {
        if (((ppc) entry.getKey()).a() == prz.MESSAGE) {
            Object value = entry.getValue();
            if (!(value instanceof pqm)) {
                if (value instanceof ppu) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((pqm) value).n()) {
                return false;
            }
        }
        return true;
    }

    public final int b(Map.Entry entry) {
        ppc ppcVar = (ppc) entry.getKey();
        Object value = entry.getValue();
        if (ppcVar.a() != prz.MESSAGE) {
            return j(ppcVar, value);
        }
        if (value instanceof ppu) {
            int i = ((ppc) entry.getKey()).b;
            int iAb = pom.ab(1);
            return iAb + iAb + pom.ac(2, i) + pom.P(3, (ppu) value);
        }
        int i2 = ((ppc) entry.getKey()).b;
        int iAb2 = pom.ab(1);
        return iAb2 + iAb2 + pom.ac(2, i2) + pom.ab(3) + pom.S((pqm) value);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final pou clone() {
        pou pouVar = new pou();
        for (int i = 0; i < this.b.a(); i++) {
            Map.Entry entryF = this.b.f(i);
            pouVar.l((ppc) entryF.getKey(), entryF.getValue());
        }
        for (Map.Entry entry : this.b.c()) {
            pouVar.l((ppc) entry.getKey(), entry.getValue());
        }
        pouVar.d = this.d;
        return pouVar;
    }

    public final Iterator d() {
        return this.d ? new ppt(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        prj prjVar = this.b;
        if (!prjVar.c) {
            for (int i = 0; i < prjVar.a(); i++) {
            }
            Iterator it = prjVar.c().iterator();
            while (it.hasNext()) {
            }
        }
        if (!prjVar.c) {
            prjVar.b = prjVar.b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(prjVar.b);
            prjVar.d = prjVar.d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(prjVar.d);
            prjVar.c = true;
        }
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pou) {
            return this.b.equals(((pou) obj).b);
        }
        return false;
    }

    public final void f(Map.Entry entry) {
        ppc ppcVar = (ppc) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ppu) {
            throw null;
        }
        if (ppcVar.a() != prz.MESSAGE) {
            this.b.put(ppcVar, m(value));
            return;
        }
        Object objK = k(ppcVar);
        if (objK == null) {
            this.b.put(ppcVar, m(value));
            return;
        }
        if (objK instanceof pqq) {
            throw new UnsupportedOperationException();
        }
        pql pqlVarGz = ((pqm) objK).gz();
        ((poy) pqlVarGz).o((ppd) ((pqm) value));
        this.b.put(ppcVar, pqlVarGz.j());
    }

    final boolean h() {
        return this.b.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        for (int i = 0; i < this.b.a(); i++) {
            if (!n(this.b.f(i))) {
                return false;
            }
        }
        Iterator it = this.b.c().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object k(ppc ppcVar) {
        Object obj = this.b.get(ppcVar);
        if (!(obj instanceof ppu)) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if ((r7 instanceof defpackage.ppg) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r7 instanceof defpackage.ppu) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.ppc r6, java.lang.Object r7) {
        /*
            r5 = this;
            pry r0 = r6.c
            defpackage.ppn.h(r7)
            pry r1 = defpackage.pry.DOUBLE
            prz r1 = defpackage.prz.INT
            prz r0 = r0.s
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L26;
                case 7: goto L1d;
                case 8: goto L14;
                default: goto L13;
            }
        L13:
            goto L4e
        L14:
            boolean r0 = r7 instanceof defpackage.pqm
            if (r0 != 0) goto L42
            boolean r0 = r7 instanceof defpackage.ppu
            if (r0 == 0) goto L4e
            goto L42
        L1d:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L42
            boolean r0 = r7 instanceof defpackage.ppg
            if (r0 == 0) goto L4e
            goto L42
        L26:
            boolean r0 = r7 instanceof defpackage.poc
            if (r0 != 0) goto L42
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L4e
            goto L42
        L2f:
            boolean r0 = r7 instanceof java.lang.String
            goto L40
        L32:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r0 = r7 instanceof java.lang.Double
            goto L40
        L38:
            boolean r0 = r7 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r0 = r7 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r0 = r7 instanceof java.lang.Integer
        L40:
            if (r0 == 0) goto L4e
        L42:
            boolean r0 = r7 instanceof defpackage.ppu
            if (r0 == 0) goto L48
            r5.d = r1
        L48:
            prj r0 = r5.b
            r0.put(r6, r7)
            return
        L4e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r6.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            pry r6 = r6.c
            prz r6 = r6.s
            r2[r1] = r6
            r6 = 2
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r2[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pou.l(ppc, java.lang.Object):void");
    }
}
