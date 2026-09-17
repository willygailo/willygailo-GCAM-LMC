package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oeu extends oen {
    final /* synthetic */ oev a;

    public oeu(oev oevVar) {
        this.a = oevVar;
    }

    @Override // defpackage.oen
    public final void a() {
        oew oewVar = this.a.a;
        ((bmn) oewVar.j).a.unlinkToDeath(oewVar.h, 0);
        oew oewVar2 = this.a.a;
        oewVar2.j = null;
        oewVar2.e = false;
    }
}
