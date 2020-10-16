package com.davidkahan.stackexchange.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/davidkahan/stackexchange/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mainViewModel", "Lcom/davidkahan/stackexchange/ui/main/MainViewModel;", "getMainViewModel", "()Lcom/davidkahan/stackexchange/ui/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "questionsAdapter", "Lcom/davidkahan/stackexchange/ui/main/QuestionsAdapter;", "getQuestionsAdapter", "()Lcom/davidkahan/stackexchange/ui/main/QuestionsAdapter;", "fetchAllQuestions", "", "fetchFilteredQuestionsByIsAnswered", "isAnswered", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupViews", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.davidkahan.stackexchange.ui.main.QuestionsAdapter questionsAdapter = null;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.davidkahan.stackexchange.ui.main.QuestionsAdapter getQuestionsAdapter() {
        return null;
    }
    
    private final com.davidkahan.stackexchange.ui.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void fetchAllQuestions() {
    }
    
    private final void fetchFilteredQuestionsByIsAnswered(boolean isAnswered) {
    }
    
    private final void setupViews() {
    }
    
    public MainActivity() {
        super();
    }
}