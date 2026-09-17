package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bdu implements bmi {
    private final /* synthetic */ int a;

    public bdu(int i) {
        this.a = i;
    }

    public static final bdv b() {
        try {
            return new bdv(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.bmi
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return b();
            case 1:
                return new bck();
            default:
                return new ArrayList();
        }
    }
}
