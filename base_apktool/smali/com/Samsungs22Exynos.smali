.class public Lcom/Samsungs22Exynos;
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

    const-string v0, "pref_enable_manual_array_key"

    const-string v4, "1"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_manual_array_key"

    const-string v4, "0,1,2,3,52,54,56"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_show_buttons_key"

    const-string v4, "1"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_aux_tele_key"

    const-string v4, "1"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_aux_wide_key"

    const-string v4, "1"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key_front"

    const-string v4, "2"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key_tele"

    const-string v4, "2"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key_wide"

    const-string v4, "2"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key_id4"

    const-string v4, "2"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key_id5"

    const-string v4, "2"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key"

    const-string v4, "2"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_exynosfix_key"

    const-string v4, "-1"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_exynosfix_key_2"

    const-string v4, "-1"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_exynosfix_key_3"

    const-string v4, "-1"

    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
