package androidx.window.core;

import defpackage.qmj;
import defpackage.qnp;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class Version$bigInteger$2 extends qnp implements qmj {
    final /* synthetic */ Version this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Version$bigInteger$2(Version version) {
        super(0);
        this.this$0 = version;
    }

    @Override // defpackage.qmj
    public final BigInteger invoke() {
        return BigInteger.valueOf(this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getPatch()));
    }
}
