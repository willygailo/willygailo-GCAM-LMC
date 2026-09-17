.class public Lcom/Transsion;
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

    const-string v0, "pref_rn8p_key"

    const-string v4, "1"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_samsungfix_key"

    const-string v4, "-1"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key"

    const-string v4, "0"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key_front"

    const-string v4, "0"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_awb_key"

    const-string v4, "4"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_awb_key_front"

    const-string v4, "4"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_bitrate_key"

    const-string v4, "12"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_frames_hdr_key"

    const-string v4, "12"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_frames_hdr_key_front"

    const-string v4, "12"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_qjpg_key"

    const-string v4, "100"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "lib_hardjpgquality_key"

    const-string v4, "15008052"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "lib_hardjpgquality_key_front"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ldcu;->q:Lddg;

    invoke-interface {v1, v0, v3}, Lddk;->s(Lddg;Z)V

    sget-object v0, Ldcu;->E:Lddg;

    invoke-interface {v1, v0, v2}, Lddk;->s(Lddg;Z)V

    sget-object v0, Ldcu;->v:Lddg;

    invoke-interface {v1, v0, v2}, Lddk;->s(Lddg;Z)V

    return-void
.end method
