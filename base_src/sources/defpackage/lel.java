package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lel implements lek {
    H263("video/3gpp"),
    H264("video/avc"),
    MPEG_4_SP("video/mp4v-es"),
    HEVC("video/hevc");

    public final String e;

    lel(String str) {
        this.e = str;
    }

    public static lel a(int i) {
        switch (i) {
            case 1:
                return H263;
            case 2:
                return H264;
            case 3:
                return MPEG_4_SP;
            case 4:
            default:
                StringBuilder sb = new StringBuilder(41);
                sb.append("Unsupported video codec type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            case 5:
                return HEVC;
        }
    }

    @Override // defpackage.lek
    public final String b() {
        return this.e;
    }
}
