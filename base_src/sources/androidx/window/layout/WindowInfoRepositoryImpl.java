package androidx.window.layout;

import android.app.Activity;
import com.google.android.apps.camera.bottombar.R;
import defpackage.qks;
import defpackage.qlh;
import defpackage.qlw;
import defpackage.qmb;
import defpackage.qmj;
import defpackage.qmy;
import defpackage.qnm;
import defpackage.qtq;
import defpackage.qtr;
import defpackage.qts;
import defpackage.qtw;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInfoRepositoryImpl implements WindowInfoRepository {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final Activity activity;
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qnm qnmVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1, reason: invalid class name */
    @qlw(b = "androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1", c = "WindowInfoRepositoryImpl.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge, R.styleable.AppCompatTheme_listPreferredItemHeightSmall})
    final class AnonymousClass1 extends qmb implements qmy {
        final /* synthetic */ qmj $producer;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(qmj qmjVar, qlh qlhVar) {
            super(2, qlhVar);
            this.$producer = qmjVar;
        }

        @Override // defpackage.qls
        public final qlh create(Object obj, qlh qlhVar) {
            AnonymousClass1 anonymousClass1 = WindowInfoRepositoryImpl.this.new AnonymousClass1(this.$producer, qlhVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qmy
        public final Object invoke(qts qtsVar, qlh qlhVar) {
            return ((AnonymousClass1) create(qtsVar, qlhVar)).invokeSuspend(qks.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0081  */
        /* JADX WARN: Code duplicated, block: B:27:0x008c A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #1 {all -> 0x00bb, blocks: (B:22:0x0072, B:25:0x0084, B:27:0x008c), top: B:54:0x0072 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x009e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009e -> B:54:0x0072). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // defpackage.qls
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public WindowInfoRepositoryImpl(Activity activity, WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        activity.getClass();
        windowMetricsCalculator.getClass();
        windowBackend.getClass();
        this.activity = activity;
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    private final qtr configurationChanged(qmj qmjVar) {
        return qnm.x(new AnonymousClass1(qmjVar, null));
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public qtr getCurrentWindowMetrics() {
        return new qtq(configurationChanged(new WindowInfoRepositoryImpl$currentWindowMetrics$1(this)), qtw.b);
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public qtr getWindowLayoutInfo() {
        return qnm.x(new WindowInfoRepositoryImpl$windowLayoutInfo$1(this, null));
    }
}
