package com.davidkahan.stackexchange.ui.main;

import java.lang.System;

/**
 * Created by David Kahan on 14/10/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/davidkahan/stackexchange/ui/main/QuestionsAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/davidkahan/stackexchange/datamodels/Question;", "Lcom/davidkahan/stackexchange/ui/main/QuestionsAdapter$QuestionViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "QuestionViewHolder", "app_debug"})
public final class QuestionsAdapter extends androidx.paging.PagingDataAdapter<com.davidkahan.stackexchange.datamodels.Question, com.davidkahan.stackexchange.ui.main.QuestionsAdapter.QuestionViewHolder> {
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.davidkahan.stackexchange.ui.main.QuestionsAdapter.QuestionViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.davidkahan.stackexchange.ui.main.QuestionsAdapter.QuestionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public QuestionsAdapter() {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/davidkahan/stackexchange/ui/main/QuestionsAdapter$QuestionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "creationDateText", "Landroid/widget/TextView;", "isAnsweredImage", "Landroid/widget/ImageView;", "scoreText", "titleText", "bindQuestion", "", "question", "Lcom/davidkahan/stackexchange/datamodels/Question;", "app_debug"})
    public static final class QuestionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView titleText = null;
        private final android.widget.TextView scoreText = null;
        private final android.widget.TextView creationDateText = null;
        private final android.widget.ImageView isAnsweredImage = null;
        
        public final void bindQuestion(@org.jetbrains.annotations.NotNull()
        com.davidkahan.stackexchange.datamodels.Question question) {
        }
        
        public QuestionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}