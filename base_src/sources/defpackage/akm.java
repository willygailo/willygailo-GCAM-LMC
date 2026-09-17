package defpackage;

/* JADX INFO: loaded from: classes.dex */
class akm extends ga {
    protected em[] m;
    String n;
    int o;
    int p;

    public akm() {
        this.m = null;
        this.o = 0;
    }

    public akm(akm akmVar) {
        this.m = null;
        this.o = 0;
        this.n = akmVar.n;
        int i = akmVar.p;
        this.p = 0;
        this.m = et.r(akmVar.m);
    }

    public em[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public boolean k() {
        return false;
    }

    public void setPathData(em[] emVarArr) {
        em[] emVarArr2 = this.m;
        if (emVarArr2 != null && emVarArr != null && emVarArr2.length == emVarArr.length) {
            for (int i = 0; i < emVarArr2.length; i++) {
                em emVar = emVarArr2[i];
                char c = emVar.a;
                em emVar2 = emVarArr[i];
                if (c == emVar2.a && emVar.b.length == emVar2.b.length) {
                }
            }
            em[] emVarArr3 = this.m;
            for (int i2 = 0; i2 < emVarArr.length; i2++) {
                emVarArr3[i2].a = emVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = emVarArr[i2].b;
                    if (i3 < fArr.length) {
                        emVarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        this.m = et.r(emVarArr);
    }
}
