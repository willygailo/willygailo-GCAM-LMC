package androidx.window.layout;

import com.google.android.apps.camera.bottombar.R;
import defpackage.qks;
import defpackage.qlh;
import defpackage.qlw;
import defpackage.qmb;
import defpackage.qmy;
import defpackage.qts;

/* JADX INFO: loaded from: classes.dex */
@qlw(b = "androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1", c = "WindowInfoRepositoryImpl.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle})
final class WindowInfoRepositoryImpl$windowLayoutInfo$1 extends qmb implements qmy {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$windowLayoutInfo$1(WindowInfoRepositoryImpl windowInfoRepositoryImpl, qlh qlhVar) {
        super(2, qlhVar);
        this.this$0 = windowInfoRepositoryImpl;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        WindowInfoRepositoryImpl$windowLayoutInfo$1 windowInfoRepositoryImpl$windowLayoutInfo$1 = new WindowInfoRepositoryImpl$windowLayoutInfo$1(this.this$0, qlhVar);
        windowInfoRepositoryImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoRepositoryImpl$windowLayoutInfo$1;
    }

    @Override // defpackage.qmy
    public final Object invoke(qts qtsVar, qlh qlhVar) {
        return ((WindowInfoRepositoryImpl$windowLayoutInfo$1) create(qtsVar, qlhVar)).invokeSuspend(qks.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:17:0x0062, B:20:0x0074, B:22:0x007c), top: B:37:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0090 -> B:37:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.qls
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            qlp r0 = defpackage.qlp.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            switch(r1) {
                case 0: goto L39;
                case 1: goto L23;
                case 2: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L10:
            java.lang.Object r1 = r8.L$2
            qsw r1 = (defpackage.qsw) r1
            java.lang.Object r3 = r8.L$1
            fb r3 = (defpackage.fb) r3
            java.lang.Object r4 = r8.L$0
            qts r4 = (defpackage.qts) r4
            defpackage.qmd.M(r9)     // Catch: java.lang.Throwable -> L35
            r9 = r4
            r4 = r8
            goto L91
        L23:
            java.lang.Object r1 = r8.L$2
            qsw r1 = (defpackage.qsw) r1
            java.lang.Object r3 = r8.L$1
            fb r3 = (defpackage.fb) r3
            java.lang.Object r4 = r8.L$0
            qts r4 = (defpackage.qts) r4
            defpackage.qmd.M(r9)     // Catch: java.lang.Throwable -> L35
            r5 = r4
            r4 = r8
            goto L74
        L35:
            r9 = move-exception
            r4 = r8
            goto La4
        L39:
            defpackage.qmd.M(r9)
            java.lang.Object r9 = r8.L$0
            qts r9 = (defpackage.qts) r9
            r1 = 10
            r3 = 4
            qsu r1 = defpackage.qnt.l(r1, r2, r3)
            androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$listener$1 r3 = new androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$listener$1
            r3.<init>()
            androidx.window.layout.WindowInfoRepositoryImpl r4 = r8.this$0
            androidx.window.layout.WindowBackend r4 = androidx.window.layout.WindowInfoRepositoryImpl.access$getWindowBackend$p(r4)
            androidx.window.layout.WindowInfoRepositoryImpl r5 = r8.this$0
            android.app.Activity r5 = androidx.window.layout.WindowInfoRepositoryImpl.access$getActivity$p(r5)
            androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1 r6 = new java.util.concurrent.Executor() { // from class: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.1
                static {
                    /*
                        androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1 r0 = new androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1) androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.1.INSTANCE androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.AnonymousClass1.<init>():void");
                }

                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable r1) {
                    /*
                        r0 = this;
                        r1.getClass()
                        r1.run()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.AnonymousClass1.execute(java.lang.Runnable):void");
                }
            }
            r4.registerLayoutChangeCallback(r5, r6, r3)
            qsw r1 = r1.d()     // Catch: java.lang.Throwable -> La2
            r4 = r8
        L62:
            r4.L$0 = r9     // Catch: java.lang.Throwable -> La0
            r4.L$1 = r3     // Catch: java.lang.Throwable -> La0
            r4.L$2 = r1     // Catch: java.lang.Throwable -> La0
            r5 = 1
            r4.label = r5     // Catch: java.lang.Throwable -> La0
            java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> La0
            if (r5 == r0) goto L9f
            r7 = r5
            r5 = r9
            r9 = r7
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> La0
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> La0
            if (r9 == 0) goto L93
            java.lang.Object r9 = r1.b()     // Catch: java.lang.Throwable -> La0
            androidx.window.layout.WindowLayoutInfo r9 = (androidx.window.layout.WindowLayoutInfo) r9     // Catch: java.lang.Throwable -> La0
            r4.L$0 = r5     // Catch: java.lang.Throwable -> La0
            r4.L$1 = r3     // Catch: java.lang.Throwable -> La0
            r4.L$2 = r1     // Catch: java.lang.Throwable -> La0
            r4.label = r2     // Catch: java.lang.Throwable -> La0
            java.lang.Object r9 = r5.emit(r9, r4)     // Catch: java.lang.Throwable -> La0
            if (r9 == r0) goto L92
            r9 = r5
        L91:
            goto L62
        L92:
            return r0
        L93:
            androidx.window.layout.WindowInfoRepositoryImpl r9 = r4.this$0
            androidx.window.layout.WindowBackend r9 = androidx.window.layout.WindowInfoRepositoryImpl.access$getWindowBackend$p(r9)
            r9.unregisterLayoutChangeCallback(r3)
            qks r9 = defpackage.qks.a
            return r9
        L9f:
            return r0
        La0:
            r9 = move-exception
            goto La4
        La2:
            r9 = move-exception
            r4 = r8
        La4:
            androidx.window.layout.WindowInfoRepositoryImpl r0 = r4.this$0
            androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoRepositoryImpl.access$getWindowBackend$p(r0)
            r0.unregisterLayoutChangeCallback(r3)
            goto Laf
        Lae:
            throw r9
        Laf:
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
