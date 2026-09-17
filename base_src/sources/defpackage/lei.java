package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lei implements lek {
    AMR_NB("audio/3gpp"),
    AMR_WB("audio/amr-wb"),
    AAC("audio/mp4a-latm"),
    HE_AAC("audio/mp4a-latm"),
    AAC_ELD("audio/mp4a-latm");

    public final String f;

    lei(String str) {
        this.f = str;
    }

    public static lei a(int i) {
        switch (i) {
            case 1:
                return AMR_NB;
            case 2:
                return AMR_WB;
            case 3:
                return AAC;
            case 4:
                return HE_AAC;
            case 5:
                return AAC_ELD;
            default:
                StringBuilder sb = new StringBuilder(41);
                sb.append("Unsupported audio codec type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.lek
    public final String b() {
        return this.f;
    }
}
