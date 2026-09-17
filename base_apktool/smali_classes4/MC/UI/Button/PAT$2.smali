.class LMC/UI/Button/PAT$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMC/UI/Button/PAT;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:LMC/UI/Button/PAT;


# direct methods
.method constructor <init>(LMC/UI/Button/PAT;)V
    .locals 0

    iput-object p1, p0, LMC/UI/Button/PAT$2;->this$1:LMC/UI/Button/PAT;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    invoke-static {}, LMC/Utils;->onRestart()V

    return-void
.end method
