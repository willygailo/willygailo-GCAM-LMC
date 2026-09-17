package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class npq extends ajd {
    public npq() {
        super(2, 3);
    }

    @Override // defpackage.ajd
    public final void a(ajy ajyVar) {
        ajyVar.g("ALTER TABLE ResourceEntity ADD COLUMN title TEXT");
        ajyVar.g("ALTER TABLE AnnotachmentEntity ADD COLUMN contentHash TEXT");
        ajyVar.g("ALTER TABLE ResourceEntity ADD COLUMN relations BLOB");
    }
}
