package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class fd implements fc {
    private final Object[] a;
    private int b;

    public fd(int i) {
        this.a = new Object[i];
    }

    @Override // defpackage.fc
    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i2;
        return obj;
    }

    @Override // defpackage.fc
    public boolean b(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                Object[] objArr = this.a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.b = i2 + 1;
                return true;
            }
            if (this.a[i] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i++;
        }
    }
}
