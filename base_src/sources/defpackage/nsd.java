package defpackage;

import com.google.android.apps.camera.bottombar.R;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker$doWork$2", c = "F250Worker.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_dialogPreferredPadding, R.styleable.AppCompatTheme_dialogTheme, 64, R.styleable.AppCompatTheme_listPreferredItemHeightSmall})
public final class nsd extends qmb implements qmy {
    Object a;
    int b;
    final /* synthetic */ F250Worker c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsd(F250Worker f250Worker, qlh qlhVar) {
        super(2, qlhVar);
        this.c = f250Worker;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        return new nsd(this.c, qlhVar);
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nsd) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[Catch: all -> 0x001f, PHI: r1
      0x0060: PHI (r1v9 ??) = (r1v15 ??), (r1v16 ??) binds: [B:20:0x005e, B:9:0x0015] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x001f, blocks: (B:6:0x000f, B:23:0x0073, B:9:0x0015, B:21:0x0060, B:12:0x001b, B:19:0x0050), top: B:40:0x0005 }] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r11 != r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v17, types: [com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, nrl] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.qls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
