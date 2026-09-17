.class public final Lcom/isDefaults;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static overrideDefaults(Lddj;Lddf;)V
    .locals 6

    move-object v1, p0

    check-cast v1, Ldep;

    const/4 v2, 0x1

    const/4 v3, 0x0

    sget-object v0, Lddq;->e:Lddg;

    invoke-interface {v1, v0, v3}, Lddk;->s(Lddg;Z)V

    return-void
.end method
