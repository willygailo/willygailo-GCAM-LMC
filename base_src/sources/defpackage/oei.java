package defpackage;

import com.google.android.play.core.install.InstallState;

/* JADX INFO: loaded from: classes2.dex */
public final class oei extends InstallState {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    private final String e;

    public oei(int i, long j, long j2, int i2, String str) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long c() {
        return this.b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long d() {
        return this.c;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.a == installState.b() && this.b == installState.c() && this.c == installState.d() && this.d == installState.a() && this.e.equals(installState.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        int i2 = this.d;
        String str = this.e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
