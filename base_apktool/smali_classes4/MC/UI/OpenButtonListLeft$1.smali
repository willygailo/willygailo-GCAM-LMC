.class LMC/UI/OpenButtonListLeft$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "OpenButtonListLeft.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMC/UI/OpenButtonListLeft;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:LMC/UI/OpenButtonListLeft;


# direct methods
.method constructor <init>(LMC/UI/OpenButtonListLeft;)V
    .locals 0

    iput-object p1, p0, LMC/UI/OpenButtonListLeft$1;->this$0:LMC/UI/OpenButtonListLeft;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    return-void
.end method
