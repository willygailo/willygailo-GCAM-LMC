package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.camera.camerapipe.CameraPipeCameraHardwareManager$allCameraIds$1", c = "CameraPipeCameraHardwareManager.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_windowActionModeOverlay})
final class lhl extends qma implements qmy {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ lhm e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhl(lhm lhmVar, qlh qlhVar) {
        super(qlhVar);
        this.e = lhmVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        lhl lhlVar = new lhl(this.e, qlhVar);
        lhlVar.f = obj;
        return lhlVar;
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((lhl) create((qol) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b3 -> B:19:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.qls
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
